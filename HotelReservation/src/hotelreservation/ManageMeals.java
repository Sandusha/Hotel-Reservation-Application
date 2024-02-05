/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelreservation;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sandusha
 */
public class ManageMeals extends javax.swing.JFrame {
    Connection con;
    /**
     * Creates new form ManageRoom
     */
    public ManageMeals() 
    { try
        {
           DBConnection obj=new DBConnection();
           con=obj.GetConnection();
            
        }
        catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error Connecting to Database"+ex,"Manage Room Form",
                    JOptionPane.ERROR_MESSAGE);
                }
        initComponents();
    }
public void reset()
{txtMealPlan.setText("");
txtInfo.setText("");
txtPrice.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMeals = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMealPlan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtInfo = new javax.swing.JTextField();
        bg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Meals");
        setMinimumSize(new java.awt.Dimension(1130, 570));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));

        tblMeals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MealPlan", "Price", "Info"
            }
        ));
        tblMeals.setToolTipText("");
        jScrollPane1.setViewportView(tblMeals);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 480, 560));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Meal Plan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("info");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-clear-symbol-48.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 110, 39));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-save-close-48 (1).png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 120, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel5.setText("Manage Meals");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        txtMealPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMealPlanActionPerformed(evt);
            }
        });
        getContentPane().add(txtMealPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 219, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 219, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search (2).png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 110, 39));

        txtInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInfoActionPerformed(evt);
            }
        });
        getContentPane().add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 220, 30));

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bG1.jpg"))); // NOI18N
        getContentPane().add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void update ()
    {
    try
            
        {
         tblMeals.setModel(new DefaultTableModel(null,new String[]{"MealPlan","Price","Info"})) ;
        
            PreparedStatement stmt = con.prepareStatement("select * from Meals");
            ResultSet rs=stmt.executeQuery();
            while (rs.next())
            {
                String Meal_plan = String.valueOf(rs.getString("MealPlan"));
                String price = String.valueOf(rs.getString("Price"));
                String info = String.valueOf(rs.getString("Info"));

                String tbData[] = {Meal_plan,price,info}; // array for saving data
                DefaultTableModel tbModel = (DefaultTableModel)tblMeals.getModel();

                tbModel.addRow(tbData);
            
        }
        }
        catch(Exception ex){
            {
                JOptionPane.showMessageDialog(null, "Error Connecting to Database"+ex,"View Stocks Form",
                    JOptionPane.ERROR_MESSAGE);
            }
        }    
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
boolean valid=true;
if(txtMealPlan.getText().isEmpty()||txtPrice.getText().isEmpty()||txtInfo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fields can't be blank", "Manage Meal Form", JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
        if(valid)
                      try
        {
            PreparedStatement stat=con.prepareStatement("Update Meals set Price=?, info=? where MealPlan=?");

            
            
            stat.setString(1,(String)txtPrice.getText());
            stat.setString(2,txtInfo.getText());
            stat.setString(3,txtMealPlan.getText());
            
          
          
            

            int rows=stat.executeUpdate();
            if(rows>0)
            {
                JOptionPane.showMessageDialog(null,"Meal data Updated..");
                 update (); 
            }

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Meal data not Updated Successully:"+ex,"Meals Form",JOptionPane.ERROR_MESSAGE);
        }
           
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       update (); 
        
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMealPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMealPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMealPlanActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                  try
        {
            PreparedStatement stmt=con.prepareStatement("Select * from Meals where MealPlan=?");

            stmt.setString(1,txtMealPlan.getText());

            ResultSet rs=stmt.executeQuery();

            if(rs.next())
            {
              
                txtMealPlan.setText(rs.getString("MealPlan"));
                txtPrice.setText(rs.getString("Price"));
                txtInfo.setText(rs.getString("Info"));
    
                
                JOptionPane.showMessageDialog(null,"Meal plan Found");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Meal plan not Found.");
            }
        }

        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error Encounted while searching:"+ex,"Sales Form",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInfoActionPerformed

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
            java.util.logging.Logger.getLogger(ManageMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMeals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMeals;
    private javax.swing.JTextField txtInfo;
    private javax.swing.JTextField txtMealPlan;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}