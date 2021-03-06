/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static student.Login.id;

/**
 *
 * @author erfan
 */
public class F_panel extends javax.swing.JFrame {

    /**
     * Creates new form F_panel
     */
    public static String F_name,FC_code,Grade,sID;
    public static int i;
    public F_panel() {
        initComponents();
        setResizable(false);
        setTitle("Student Result System");
        setLabel();
        FnameLabel.setText(F_name);
        CourseNLabel.setText(FC_code);
         
        AllStdtable();
        setVisible(true);
        
         // mouse listener for selected student Table
       DefaultTableModel model = (DefaultTableModel) STable.getModel();
        STable.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
             i = STable.getSelectedRow();
            
            T1.setText(model.getValueAt(i, 1).toString());
            StudentID.setText(model.getValueAt(i, 0).toString());
        }
        });
        
    }
 
  public final void setLabel()
  {
       String query = "select * from Faculty where F_id=(?)";
       Connection c = null;
        Statement stmt = null;
      
        
     
        PreparedStatement ps;
        try {
            Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:std.db");
      stmt = c.createStatement();
            ps = c.prepareStatement(query);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            
            
        int i =0;
        while (rs.next()) {
           
           F_name = rs.getString("Name");
           FC_code = rs.getString("C_Code");
            i++; 
        }
        if(i <1)
        {
            JOptionPane.showMessageDialog(null, "No Record Found","Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }
          catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Jtable.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
     private void AllStdtable()
 {
      String strQuery = "select * from $temp";
         Connection c = null;
          
        PreparedStatement ps = null;
        try {
            Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:std.db");
        String query =strQuery.replace("$temp",FC_code);
            ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel) STable.getModel();   
        int i =0;
        while (rs.next()) {
           String S_id = rs.getString("S_id");
           String Grade = rs.getString("Grade");
            
            model.addRow(new Object[]{S_id,Grade});
            i++; 
        }
        if(i <1)
        {
            JOptionPane.showMessageDialog(null, "No Record Found","MESSAGE",
            JOptionPane.ERROR_MESSAGE);
        }
    }
          catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jtable.class.getName()).log(Level.SEVERE, null, ex);
        }
 }  

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        STable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        T1 = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StudentID = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CourseNLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FnameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        jButton2.setText("Log out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 120));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        STable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        STable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Grade"
            }
        ));
        jScrollPane1.setViewportView(STable);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        T1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        SubmitButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel2.setText("Grade:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel5.setText("S_ID:");

        StudentID.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        StudentID.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(T1)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StudentID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backButton.setText("Back ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        CourseNLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        CourseNLabel.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel1.setText("Faculty :");

        FnameLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        FnameLabel.setText("jLabel2");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel4.setText("Taken Course:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CourseNLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FnameLabel)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FnameLabel)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CourseNLabel))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 238, -1));

        jLabel3.setFont(new java.awt.Font("Snap ITC", 3, 24)); // NOI18N
        jLabel3.setText("Grade Submisson");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 105, -1, 35));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/hot_air_balloon_reflections-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


// Grade Submit button operation
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
     
        Grade =(T1.getText().trim());
        sID=(StudentID.getText().trim());
          Connection c = null;
        
     try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:std.db");
      
     
     
      String query = "UPDATE $temp SET Grade=(?) WHERE S_id=(?)" ;
      
                    String sql =query.replace("$temp",FC_code);
                     PreparedStatement ps = c.prepareStatement(sql); 
                     ps.setString(1,Grade);
                     ps.setString(2,sID);
                     ps.executeUpdate(); 
                 
                    
                    DefaultTableModel model = (DefaultTableModel) STable.getModel();
                    model.setValueAt(T1.getText(), i, 1);
                    //model.removeRow(Table.getSelectedRow());
      
  
JOptionPane.showMessageDialog(null, "Record updated successfully.","MESSAGE",
            JOptionPane.PLAIN_MESSAGE);

c.close();


    }

    catch ( ClassNotFoundException | SQLException e ) {
        //System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      JOptionPane.showMessageDialog(null, "Select Student","MESSAGE",
            JOptionPane.ERROR_MESSAGE);
    }     
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Login();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new F_pinfo();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
@Override
    public void setDefaultCloseOperation(int i) {
        super.setDefaultCloseOperation(F_panel.DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseNLabel;
    private javax.swing.JLabel FnameLabel;
    private javax.swing.JTable STable;
    private javax.swing.JLabel StudentID;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField T1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
