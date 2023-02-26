/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicesystem.home;

import invoiceProject.dbConinvoice;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Al-RaZi
 */
public class UpdateClient extends javax.swing.JFrame {

    dbConinvoice dbConn = new dbConinvoice();
    PreparedStatement pst;
    
    /**
     * Creates new form UpdateUser
     */
    public UpdateClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtUpcontact = new javax.swing.JTextField();
        txtUpemail = new javax.swing.JTextField();
        txtUpname = new javax.swing.JTextField();
        txtUpaddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCsid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel1.setText("Update Client");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/update-user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, -1));

        txtSearch.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        txtSearch.setText("Search Client!");
        txtSearch.setToolTipText("Type Client Phone!");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 430, -1));

        btnSearch.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/search - 32.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUpcontact.setEditable(false);
        txtUpcontact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel2.add(txtUpcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 380, -1));

        txtUpemail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel2.add(txtUpemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 380, -1));

        txtUpname.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel2.add(txtUpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 380, -1));

        txtUpaddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel2.add(txtUpaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 380, -1));

        btnUpdate.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/update-user.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, 80));

        btnReset.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, 80));

        btnClose.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/close-exit.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 160, 80));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Contact Info");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 9, 160, 40));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 60, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 60, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Contact");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("CSID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, 30));

        txtCsid.setEditable(false);
        txtCsid.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel2.add(txtCsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 380, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 990, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            // TODO add your handling code here:
            String sql = "select csid, name, email, contact, address from newuser where csid=?";
            ResultSet rs;
            pst=dbConn.getCon().prepareStatement(sql);
            pst.setString(1, txtSearch.getText().trim());
            
            rs = pst.executeQuery();
            
            while(rs.next()){
            txtCsid.setText(rs.getString(1));
            txtUpname.setText(rs.getString(2));
            txtUpemail.setText(rs.getString(3));
            txtUpcontact.setText(rs.getString(4));
            txtUpaddress.setText(rs.getString(5));
            
            }
              
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Client ID Not Exist!");
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UpdateClient().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        String sql = "update newuser set name=?, email=?, contact=?, address=? where csid=?";
        try {
            pst=dbConn.getCon().prepareStatement(sql);

            
            pst.setString(1, txtUpname.getText());
            pst.setString(2, txtUpemail.getText());
            pst.setString(3, txtUpcontact.getText());
            pst.setString(4, txtUpaddress.getText());
            pst.setString(5, txtCsid.getText().trim());
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update Successful");
            
            pst.close();
            dbConn.getCon().close();
            
             setVisible(false);
             new UpdateClient().setVisible(true);
            

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Operation Failed!");
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Operation Failed!");
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        // TODO add your handling code here:
         if (txtSearch.getText().equals("Search Client!")){
        txtSearch.setText("");
        txtSearch.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        // TODO add your handling code here:
        if (txtSearch.getText().equals("")){
        txtSearch.setText("Search Client!");
        txtSearch.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtSearchFocusLost

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
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCsid;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUpaddress;
    private javax.swing.JTextField txtUpcontact;
    private javax.swing.JTextField txtUpemail;
    private javax.swing.JTextField txtUpname;
    // End of variables declaration//GEN-END:variables
}
