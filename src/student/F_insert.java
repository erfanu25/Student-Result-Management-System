/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author erfan
 */
public class F_insert extends javax.swing.JFrame {

    /**
     * Creates new form F_insert
     */
    public static String F_id,Name,Contact,C_Code,Pass;
    public F_insert() {
        initComponents();
        setResizable(false);
        setTitle("Student Result System");
        Fillcombo();
        setVisible(true);
    }
    private void Fillcombo(){
        try{
            Connection c = null;
           Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:std.db"); 
           String sql="select * from Course";
           PreparedStatement pst = c.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           
           while(rs.next()){
               String name = rs.getString("C_Code");
               Combox.addItem(name);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ft = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Ct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Combox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        passt = new javax.swing.JTextField();
        b = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SList = new javax.swing.JButton();
        FList = new javax.swing.JButton();
        AddC = new javax.swing.JButton();
        AddS = new javax.swing.JButton();
        AddF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Snap ITC", 3, 24)); // NOI18N
        jLabel5.setText("Insert New Faculty ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 97, 315, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setText("Faculty ID");

        Ft.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        Nt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel3.setText("Contact");

        Ct.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel4.setText("Course Code");

        Combox.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        Combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        passt.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        passt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtActionPerformed(evt);
            }
        });

        b.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        b.setText("Submit");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        ClearButton.setText("CLEAR");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ft, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addComponent(Nt)
                                .addComponent(Ct)
                                .addComponent(passt))
                            .addComponent(Combox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ft, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 198, -1, -1));

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton2.setText("Assign Course");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton1.setText("Course List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SList.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        SList.setText("Student List");
        SList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SListActionPerformed(evt);
            }
        });

        FList.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        FList.setText("Faculty List");
        FList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FListActionPerformed(evt);
            }
        });

        AddC.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        AddC.setText("Add Course");
        AddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCActionPerformed(evt);
            }
        });

        AddS.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        AddS.setText("Add Student ");
        AddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSActionPerformed(evt);
            }
        });

        AddF.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 14)); // NOI18N
        AddF.setText("Add Faculty");
        AddF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stencil", 3, 24)); // NOI18N
        jLabel7.setText("Admin Pannel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AddF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddS, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(AddC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(AddF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/hot_air_balloon_reflections-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setDefaultCloseOperation(int i) {
        super.setDefaultCloseOperation(F_insert.DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
         if(evt.getSource()==b)
         {
             
             F_id=(Ft.getText().trim()); 
             Name=(Nt.getText().trim());
             Contact=(Ct.getText().trim());
             C_Code = Combox.getSelectedItem().toString();
             Pass=(passt.getText().trim());
             
              boolean matches = false;
             
        matches=F_id.matches("[0-9]{3,10}");     //regex for Faculty id
        if(matches==false)
        {
          
            JOptionPane.showMessageDialog(null, "Please Inter Correct ID Format","MESSAGE",
            JOptionPane.ERROR_MESSAGE);
          dispose();
          new F_insert();
          return;
        }
        matches=Name.matches("^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$");  //regex for Faculty name
        if(matches==false)
        {
          
            JOptionPane.showMessageDialog(null, "Please Inter Correct Name Format","MESSAGE",
            JOptionPane.ERROR_MESSAGE);
          dispose();
          new F_insert();
          return;
        }
        
        matches=Contact.matches("^[0][0-9]{10}");   //regex for Faculty contact
         if(matches==false)
        {
          
            JOptionPane.showMessageDialog(null, "Please Inter Correct Contact number","MESSAGE",
            JOptionPane.ERROR_MESSAGE);
          dispose();
          new F_insert();
          return;
        }
        
         
          Connection c = null;
        
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:std.db");
      
     
     
      String sql = "INSERT INTO Faculty (F_id,Name,Contact,C_Code) " +
                   "VALUES (?,?,?,?);";
      
    
          //System.out.println(F_id+Name+Contact+C_Code);
                         PreparedStatement ps = c.prepareStatement(sql); 
                     ps.setString(1,F_id);
                     ps.setString(2,Name);
                     ps.setString(3,Contact);
                     ps.setString(4,C_Code);
                     ps.executeUpdate();
                 
      String sql1 = "INSERT INTO Login (ID,Pass,Level) " +
                   "VALUES (?,?,2);";
                 PreparedStatement ps1 = c.prepareStatement(sql1); 
                     ps1.setString(1,F_id);
                     ps1.setString(2,Pass);
                     ps1.executeUpdate(); 
                 
      
      
      

JOptionPane.showMessageDialog(null, "Record Inserted successfully.","MESSAGE",
            JOptionPane.PLAIN_MESSAGE);

c.close();
dispose();
new Jtable();
/*status=rs.next();
      if(status==true)
      {
          System.out.println("success");
      }
      else
      {
          System.out.println("Wrong");
      }*/
    }

    catch ( ClassNotFoundException | SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      JOptionPane.showMessageDialog(null, "Inter Unique ID.","MESSAGE",
            JOptionPane.ERROR_MESSAGE);
      
    }
         }

    }//GEN-LAST:event_bActionPerformed

    private void passtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtActionPerformed

    private void ComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        new Login();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispose();
        AssignCourse assignCourse = new AssignCourse();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         dispose();
        C_list c_list = new C_list();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SListActionPerformed
        dispose();
        S_list s_list = new S_list();
    }//GEN-LAST:event_SListActionPerformed

    private void FListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FListActionPerformed
         dispose();
        Jtable obj =new Jtable();
    }//GEN-LAST:event_FListActionPerformed

    private void AddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCActionPerformed
        dispose();
        C_insert c_insert = new C_insert();
    }//GEN-LAST:event_AddCActionPerformed

    private void AddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSActionPerformed
        dispose();
        S_insert s_insert = new S_insert();
    }//GEN-LAST:event_AddSActionPerformed

    private void AddFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFActionPerformed
         dispose();
        F_insert f_insert = new F_insert();
    }//GEN-LAST:event_AddFActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
       Ft.getText(); 
       Nt.getText();
       Ct.getText();
       passt.getText();
       Ft.setText(null); 
       Nt.setText(null);
       Ct.setText(null);
       passt.setText(null);        
    }//GEN-LAST:event_ClearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddC;
    private javax.swing.JButton AddF;
    private javax.swing.JButton AddS;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> Combox;
    private javax.swing.JTextField Ct;
    private javax.swing.JButton FList;
    private javax.swing.JTextField Ft;
    private javax.swing.JTextField Nt;
    private javax.swing.JButton SList;
    private javax.swing.JButton b;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField passt;
    // End of variables declaration//GEN-END:variables
}
