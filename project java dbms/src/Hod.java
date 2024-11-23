
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hsviv
 */
public class Hod extends javax.swing.JFrame {
Connection con=null;
Statement st=null;
PreparedStatement pst=null;
ResultSet rs=null;

   
    public Hod() {
        initComponents();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/dsatm", "root", "Bdvt@1234");
            } catch (SQLException ex) {
                Logger.getLogger(Hod.class.getName()).log(Level.SEVERE, null, ex);
            }

    }  catch (ClassNotFoundException ex) {
    Logger.getLogger(Hod.class.getName()).log(Level.SEVERE, null, ex);
}
        ShowRecordINTable();
    }
    public void ShowRecordINTable(){
int c=0;
    try {
        pst=con.prepareStatement("Select * from hod_cabin_inventory");
        rs=pst.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        c=rsmd.getColumnCount();
        DefaultTableModel DModel=(DefaultTableModel) jTable1.getModel();
                            DModel.setRowCount(0);
                            while(rs.next()){
                  Vector column =new Vector();
                  for (int i=0;i<=c;i++){
                      column.add(rs.getString("sl_no"));
                      column.add(rs.getString("particulars"));
                      column.add(rs.getString("dept_item_no"));
                      column.add(rs.getString("total"));
                  }
                  DModel.addRow(column);
                            }
    } catch (SQLException ex) {
        Logger.getLogger(Hod.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtslno = new javax.swing.JTextField();
        txtpart = new javax.swing.JTextField();
        txtdept = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "sl_no", "particulars", "dept_item_no", "total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 890, -1));

        jPanel1.setBackground(new java.awt.Color(221, 243, 243));
        jPanel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("    SL.NO");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setText("DEPT_ITEM_NO");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel5.setText("  PARTICULARS");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setText("    TOTAL");

        txtslno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtslnoActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpart, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtslno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdept))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtslno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdept, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 890, 170));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Red_X.svg (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hod (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(txtslno.getText().equals("")){
      JOptionPane.showMessageDialog(this, "All Field is Requied");
      txtslno.requestFocus();
    }
    else if(txttotal.getText().equals("")){
       JOptionPane.showMessageDialog(this, "All Field is Requied");
       txttotal.requestFocus();
    }   
    else{   
        
        PreparedStatement pst=null;
        Statement st=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/dsatm","root","Bdvt@1234");
           // st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pst=con.prepareStatement("select * from hod_cabin_inventory where sl_no=?");
            pst.setString(1, txtslno.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"serial Number Item Already Exist");
            }
            else{
                try{
                   int pric=Integer.parseInt(txttotal.getText());
                       
                        try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/dsatm","root","Bdvt@1234");
                        pst=con.prepareStatement("insert into hod_cabin_inventory(sl_no,particulars,dept_item_no,total)values(?,?,?,?)");
                        pst.setString(1, txtslno.getText());
                        pst.setString(2, txtpart.getText());
                        pst.setString(3, txtdept.getText());
                        pst.setString(4, txttotal.getText());
                                            
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Item Added");
                   ShowRecordINTable();
                        txttotal.setText("");
                        txtslno.setText("");
                        txtpart.setText("");
                        txtdept.setText("");
                  
                } catch (ClassNotFoundException | SQLException ex) {}
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Invalid");
                    }
                
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
           //Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtslnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtslnoActionPerformed
       
    }//GEN-LAST:event_txtslnoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if (txtslno.getText().equals("")) {
    JOptionPane.showMessageDialog(this, "Serial Number is Required");
    txtslno.requestFocus();
} else {
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/dsatm", "root", "Bdvt@1234");

        pst = con.prepareStatement("select * from hod_cabin_inventory where sl_no=?");
        pst.setString(1, txtslno.getText());
        rs = pst.executeQuery();
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Serial Number Item Does Not Exist");
        } else {
            pst = con.prepareStatement("delete from hod_cabin_inventory where sl_no=?");
            pst.setString(1, txtslno.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Item Deleted");

            // Clear input fields after deletion
            txtslno.setText("");
            txtpart.setText("");
            txtdept.setText("");
            txttotal.setText("");

            // Refresh the table to show the updated records
            ShowRecordINTable();
        }
    } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(this, "An error occurred while deleting the item: " + ex.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while closing resources: " + e.getMessage());
        }
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if (txtslno.getText().equals("") || txtpart.getText().equals("") || txtdept.getText().equals("") || txttotal.getText().equals("")) {
    JOptionPane.showMessageDialog(this, "All Fields are Required");
    txtslno.requestFocus();
} else {
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/dsatm", "root", "Bdvt@1234");

        pst = con.prepareStatement("select * from hod_cabin_inventory where sl_no=?");
        pst.setString(1, txtslno.getText());
        rs = pst.executeQuery();

        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Serial Number Item Does Not Exist");
        } else {
            int price = Integer.parseInt(txttotal.getText());

            pst = con.prepareStatement("update hod_cabin_inventory set particulars=?, dept_item_no=?, total=? where sl_no=?");
            pst.setString(1, txtpart.getText());
            pst.setString(2, txtdept.getText());
            pst.setInt(3, price);
            pst.setString(4, txtslno.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Item Updated");

            // Clear input fields after update
            txtslno.setText("");
            txtpart.setText("");
            txtdept.setText("");
            txttotal.setText("");

            // Refresh the table to show the updated records
            ShowRecordINTable();
        }
    } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(this, "An error occurred while updating the item: " + ex.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid total value: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while closing resources: " + e.getMessage());
        }
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdept;
    private javax.swing.JTextField txtpart;
    private javax.swing.JTextField txtslno;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
