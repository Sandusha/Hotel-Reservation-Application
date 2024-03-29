/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelreservation;

/**
 *
 * @author Sandusha
 */
public class AccountantMenu extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionMenu
     */
    public AccountantMenu() {
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
        btnlogout = new javax.swing.JButton();
        btnInlist = new javax.swing.JButton();
        btnChkin = new javax.swing.JButton();
        btnChkout = new javax.swing.JButton();
        btnInlist1 = new javax.swing.JButton();
        btnInlist3 = new javax.swing.JButton();
        btnInlist4 = new javax.swing.JButton();
        btnInlist5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Villa Nilnara-Accountant");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(1600, 800));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 700, 160, 60));

        btnInlist.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist.setText("Manage User Accounts");
        btnInlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlistActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 330, 60));

        btnChkin.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnChkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnChkin.setText("View Bills");
        btnChkin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChkin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkinActionPerformed(evt);
            }
        });
        jPanel1.add(btnChkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 330, 60));

        btnChkout.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnChkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnChkout.setText("Manage Rooms");
        btnChkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChkout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnChkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 330, 60));

        btnInlist1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist1.setText("Manage Meals");
        btnInlist1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlist1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 330, 60));

        btnInlist3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist3.setText("View Inhouse Guests");
        btnInlist3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlist3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 330, 60));

        btnInlist4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist4.setText("View Cancellations");
        btnInlist4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlist4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 330, 60));

        btnInlist5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist5.setText("View Checkout List");
        btnInlist5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlist5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 330, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/screen.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 800));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkinActionPerformed
     ViewBills obj = new ViewBills();
                    obj.show();
                    
    }//GEN-LAST:event_btnChkinActionPerformed

    private void btnChkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkoutActionPerformed
    ManageRoom obj = new ManageRoom();
                    obj.show();
                 
    }//GEN-LAST:event_btnChkoutActionPerformed

    private void btnInlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInlistActionPerformed
ManageUsers obj = new ManageUsers();
                    obj.show();       
    }//GEN-LAST:event_btnInlistActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        Login obj = new Login();
                    obj.show();
                      this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnInlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInlist1ActionPerformed
    ManageMeals obj = new ManageMeals();
                    obj.show();      // TODO add your handling code here:
    }//GEN-LAST:event_btnInlist1ActionPerformed

    private void btnInlist3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInlist3ActionPerformed
        ViewInHouseListAll obj = new ViewInHouseListAll();
        obj.show();
    }//GEN-LAST:event_btnInlist3ActionPerformed

    private void btnInlist4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInlist4ActionPerformed
         ViewCancellations obj = new ViewCancellations();
        obj.show();
    }//GEN-LAST:event_btnInlist4ActionPerformed

    private void btnInlist5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInlist5ActionPerformed
        ViewCheckout obj = new ViewCheckout();
        obj.show();
    }//GEN-LAST:event_btnInlist5ActionPerformed

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
            java.util.logging.Logger.getLogger(AccountantMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountantMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountantMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountantMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountantMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChkin;
    private javax.swing.JButton btnChkout;
    private javax.swing.JButton btnInlist;
    private javax.swing.JButton btnInlist1;
    private javax.swing.JButton btnInlist3;
    private javax.swing.JButton btnInlist4;
    private javax.swing.JButton btnInlist5;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
