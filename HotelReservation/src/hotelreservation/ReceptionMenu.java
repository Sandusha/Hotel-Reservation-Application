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
public class ReceptionMenu extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionMenu
     */
    public ReceptionMenu() {
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
        btnChkout5 = new javax.swing.JButton();
        btnInlist5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Villa Nilnara - Receptionist");
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
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 690, 160, 60));

        btnInlist.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist.setText("View inhouse guests");
        btnInlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlistActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 300, 60));

        btnChkin.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnChkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnChkin.setText("Check In");
        btnChkin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChkin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkinActionPerformed(evt);
            }
        });
        jPanel1.add(btnChkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 300, 60));

        btnChkout.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnChkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnChkout.setText("Check Out");
        btnChkout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChkout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnChkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 300, 60));

        btnChkout5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnChkout5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnChkout5.setText("View room availability");
        btnChkout5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChkout5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChkout5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkout5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnChkout5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 300, 60));

        btnInlist5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btnInlist5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        btnInlist5.setText("View checkout list");
        btnInlist5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInlist5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInlist5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInlist5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInlist5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInlist5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/screen.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 830));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkinActionPerformed
     CheckinReception obj = new CheckinReception();
                    obj.show();
                    
    }//GEN-LAST:event_btnChkinActionPerformed

    private void btnChkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkoutActionPerformed
    CheckOut obj = new CheckOut();
                    obj.show();
                 
    }//GEN-LAST:event_btnChkoutActionPerformed

    private void btnInlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInlistActionPerformed
        ViewInHouseListAll obj = new ViewInHouseListAll();
                    obj.show();       
    }//GEN-LAST:event_btnInlistActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        Login obj = new Login();
                    obj.show();
                      this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnChkout5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkout5ActionPerformed
        ViewRoominfo obj = new ViewRoominfo();
        obj.show();
        
    }//GEN-LAST:event_btnChkout5ActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChkin;
    private javax.swing.JButton btnChkout;
    private javax.swing.JButton btnChkout5;
    private javax.swing.JButton btnInlist;
    private javax.swing.JButton btnInlist5;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}