/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicesystem.home;

import invoiceProject.dbConinvoice;
import java.awt.Color;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Al-RaZi
 */
public class NewClient extends javax.swing.JFrame {
    
    dbConinvoice dbConn = new dbConinvoice();
    PreparedStatement pst;
    
     public void clear(){
        txtNewname.setText("");
        txtNewemail.setText("");
        txtNewcontact.setText("");
        txtNewaddress.setText("");
        
    }
    
    
//public NewUser(dbConinvoice DBConn){
//    this.DBConn=DBConn;
//}

    /**
     * Creates new form NewUser
     */
    public NewClient() {
        initComponents();

        
        //Title of the window Assign
        this.setTitle("MiXed Invoice - New Client");
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
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNewname = new javax.swing.JTextField();
        txtNewemail = new javax.swing.JTextField();
        txtNewcontact = new javax.swing.JTextField();
        txtNewaddress = new javax.swing.JTextField();
        txtNewcombo = new javax.swing.JComboBox<>();
        btnNewreset = new javax.swing.JButton();
        btnNewsave = new javax.swing.JButton();
        btnNewexit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCsid = new javax.swing.JTextField();
        btntooltip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Client");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/new-user.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel5.setText("Contact");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel7.setText("Gender");

        txtNewname.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNewname.setText("Enter Client Name");
        txtNewname.setToolTipText("Type Client Name");
        txtNewname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewnameFocusLost(evt);
            }
        });

        txtNewemail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNewemail.setText("Enter Client Email");
        txtNewemail.setToolTipText("Type Client Email");
        txtNewemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewemailFocusLost(evt);
            }
        });

        txtNewcontact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNewcontact.setText("Enter Client Contact");
        txtNewcontact.setToolTipText("Enter Client Contact Info");
        txtNewcontact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewcontactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewcontactFocusLost(evt);
            }
        });

        txtNewaddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNewaddress.setText("Enter Client Address");
        txtNewaddress.setToolTipText("Type Client Address");
        txtNewaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewaddressFocusLost(evt);
            }
        });

        txtNewcombo.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNewcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        txtNewcombo.setToolTipText("Select Gender");

        btnNewreset.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnNewreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/reset.png"))); // NOI18N
        btnNewreset.setText("Reset");
        btnNewreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewresetActionPerformed(evt);
            }
        });

        btnNewsave.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnNewsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/save.png"))); // NOI18N
        btnNewsave.setText("Save");
        btnNewsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewsaveMouseClicked(evt);
            }
        });

        btnNewexit.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnNewexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/close-exit.png"))); // NOI18N
        btnNewexit.setText("Exit");
        btnNewexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewexitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel9.setText("CSID");

        txtCsid.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtCsid.setText("Enter CSID");
        txtCsid.setToolTipText("Enter CSID");
        txtCsid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCsidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCsidFocusLost(evt);
            }
        });

        btntooltip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/tooltip- 32 X 32.png"))); // NOI18N
        btntooltip.setToolTipText("Click to See More!");
        btntooltip.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btntooltip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntooltipMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewname)
                    .addComponent(txtNewemail)
                    .addComponent(txtNewcontact)
                    .addComponent(txtNewaddress)
                    .addComponent(txtNewcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNewreset, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewsave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewexit, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addComponent(txtCsid))
                .addGap(18, 18, 18)
                .addComponent(btntooltip, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btntooltip, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCsid, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewname)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewemail)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewcontact)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewaddress)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewsave))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1070, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewemailFocusGained
        // TODO add your handling code here:
        if (txtNewemail.getText().equals("Enter Client Email")){
        txtNewemail.setText("");
        txtNewemail.setForeground(new Color(0,0,0));
        
        }

    }//GEN-LAST:event_txtNewemailFocusGained

    
    
    private void txtNewemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewemailFocusLost
        // TODO add your handling code here:
        
        if (txtNewemail.getText().equals("")){
        txtNewemail.setText("Enter Client Email");
        txtNewemail.setForeground(new Color(153,153,153));
        
        }
    }//GEN-LAST:event_txtNewemailFocusLost

    
    private void txtNewcontactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewcontactFocusGained
        // TODO add your handling code here:
        if (txtNewcontact.getText().equals("Enter Client Contact")){
        txtNewcontact.setText("");
        txtNewcontact.setForeground(new Color(0,0,0));
        
        }
    }//GEN-LAST:event_txtNewcontactFocusGained

    
    private void txtNewcontactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewcontactFocusLost
        // TODO add your handling code here:
        if (txtNewcontact.getText().equals("")){
        txtNewcontact.setText("Enter Client Contact");
        txtNewcontact.setForeground(new Color(153,153,153));
        
        }
        
        
    }//GEN-LAST:event_txtNewcontactFocusLost

    
    private void txtNewaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewaddressFocusGained
        // TODO add your handling code here:
        if (txtNewaddress.getText().equals("Enter Client Address")){
        txtNewaddress.setText("");
        txtNewaddress.setForeground(new Color(0,0,0));
        
        }
        
    }//GEN-LAST:event_txtNewaddressFocusGained

    private void txtNewaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewaddressFocusLost
        // TODO add your handling code here:
        if (txtNewaddress.getText().equals("")){
        txtNewaddress.setText("Enter Client Address");
        txtNewaddress.setForeground(new Color(153,153,153));
        
        }
        
    }//GEN-LAST:event_txtNewaddressFocusLost

    private void btnNewexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewexitActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
 
    }//GEN-LAST:event_btnNewexitActionPerformed

    private void btnNewsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewsaveMouseClicked
        DateTimeFormatter dateCreate= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dateCreate.format(now);
        
        DateTimeFormatter timeCreate= DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime tm = LocalDateTime.now();
        String time = timeCreate.format(tm);
        
        String csid =txtCsid.getText().trim();
        try {
            
            String check = "select * from newuser where csid ='"+csid+"'";
            pst=dbConn.getCon().prepareStatement(check);
            ResultSet rs;
            rs = pst.executeQuery();
            
             if(rs.next()){
                JOptionPane.showMessageDialog(this, "Client Already Available!");
                 dispose();
                 new NewClient().setVisible(true);
            }else{
            String sql = "insert into newuser(csid, name, email, contact, address, gender, date_created, time_created) values(?, ?, ?, ?, ?, ?, ?, ?)";
            
            pst=dbConn.getCon().prepareStatement(sql);
            
            pst.setString(1, txtCsid.getText().trim());
            pst.setString(2, txtNewname.getText().trim());
            pst.setString(3, txtNewemail.getText().toLowerCase().trim());
            pst.setString(4, txtNewcontact.getText().trim());
            pst.setString(5, txtNewaddress.getText().trim());
            pst.setString(6, txtNewcombo.getSelectedItem().toString());
            pst.setString(7, date);
            pst.setString(8, time);

            pst.executeUpdate();
         
            
            
            JOptionPane.showMessageDialog(this, "Data Saved Successful!");
            pst.close();
            dbConn.getCon().close();
            clear();
            dispose();
            setVisible(false);
            new NewClient().setVisible(true);
            
             }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Data NOT Saved!!");
            
            Logger.getLogger(NewClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data NOT Saved!!");
            Logger.getLogger(NewClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNewsaveMouseClicked

    private void btnNewresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewresetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new NewClient().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNewresetActionPerformed

    private void txtCsidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCsidFocusGained
        // TODO add your handling code here:
        if (txtCsid.getText().equals("Enter CSID")){
        txtCsid.setText("");
        txtCsid.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtCsidFocusGained

    private void txtCsidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCsidFocusLost
        // TODO add your handling code here:
        if (txtCsid.getText().equals("")){
        txtCsid.setText("Enter CSID");
        txtCsid.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCsidFocusLost

    private void btntooltipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntooltipMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "ID must be unique and consists Alphanumeric");
    }//GEN-LAST:event_btntooltipMouseClicked

    private void txtNewnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewnameFocusGained
        // TODO add your handling code here:
        if (txtNewname.getText().equals("Enter Client Name")){
        txtNewname.setText("");
        txtNewname.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_txtNewnameFocusGained

    private void txtNewnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewnameFocusLost
        // TODO add your handling code here:
        if (txtNewname.getText().equals("")){
        txtNewname.setText("Enter Client Name");
        txtNewname.setForeground(new Color(153,153,153));
        }
        
    }//GEN-LAST:event_txtNewnameFocusLost

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
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewexit;
    private javax.swing.JButton btnNewreset;
    private javax.swing.JButton btnNewsave;
    private javax.swing.JButton btntooltip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCsid;
    private javax.swing.JTextField txtNewaddress;
    private javax.swing.JComboBox<String> txtNewcombo;
    private javax.swing.JTextField txtNewcontact;
    private javax.swing.JTextField txtNewemail;
    private javax.swing.JTextField txtNewname;
    // End of variables declaration//GEN-END:variables
}
