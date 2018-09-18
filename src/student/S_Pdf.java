/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.FileOutputStream;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.swing.JOptionPane;

public class S_Pdf {
    
    public S_Pdf(){
                
        Connection c=null;
        Statement st=null;
        ResultSet rs= null;
        String query="Select * from Student";
        
        try{
                Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:std.db");
                st=c.createStatement();
                rs=st.executeQuery(query);
                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
                PdfWriter.getInstance(my_pdf_report, new FileOutputStream("Student_List.pdf"));
                my_pdf_report.open();            
                //we have four columns in our table
                PdfPTable my_report_table = new PdfPTable(4);
                //create a cell object
                PdfPCell table_cell;
               
                while (rs.next()) {                
                                String S_id = rs.getString("S_id");
                                table_cell=new PdfPCell(new Phrase(S_id));
                                my_report_table.addCell(table_cell);
                                String name=rs.getString("Name");
                                table_cell=new PdfPCell(new Phrase(name));
                                my_report_table.addCell(table_cell);
                                String Contact=rs.getString("Contact");
                                table_cell=new PdfPCell(new Phrase(Contact));
                                my_report_table.addCell(table_cell);
                                String Email=rs.getString("Email");
                                table_cell=new PdfPCell(new Phrase(Email));
                                my_report_table.addCell(table_cell);
                                }
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table);                       
                my_pdf_report.close();
                
                /* Close all DB related objects */
                rs.close();
                st.close(); 
                c.close(); 
                 JOptionPane.showMessageDialog(null, "Successfully pdf Created ","Error",
            JOptionPane.PLAIN_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
                
        }
    
}
