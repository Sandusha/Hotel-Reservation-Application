

package hotelreservation;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewInHouseList extends javax.swing.JFrame {
Connection con;


    public ViewInHouseList() {
        try
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInhouse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("In-House Guests");
        setMaximumSize(new java.awt.Dimension(907, 553));
        setMinimumSize(new java.awt.Dimension(907, 553));
        setPreferredSize(new java.awt.Dimension(907, 553));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        tblInhouse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblInhouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Name", "Check In Date", "Room Number", "Room Type", "Bed Type", "Occupancy", "Meal Plan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInhouse);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 81, 880, 430);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel1.setText("In-House Guests");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 10, 310, 41);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bG1.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 910, 550);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
             
    }//GEN-LAST:event_formWindowOpened

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
     try
            
        {
         tblInhouse.setModel(new DefaultTableModel(null,new String[]{"Reservation_ID","Name","Check_In_Date","Room_Type",
             "Bed_Type","Room_Number","Occupancy","Meal_Plan"})) ;
        
            PreparedStatement stmt = con.prepareStatement("select RID,Name,CheckIn,RoomType,BedType,RoomNumber,Occupancy,MealPlan from CheckIns where Status='In'");
            ResultSet rs=stmt.executeQuery();
            while (rs.next())
            {
               String Reservation_ID = String.valueOf(rs.getString("RID"));
                String Name = String.valueOf(rs.getString("Name"));
                String Check_In_Date = String.valueOf(rs.getString("CheckIn"));
                String Room_Type = String.valueOf(rs.getString("RoomType"));
                String Bed_Type = String.valueOf(rs.getString("BedType"));
                String Room_Number = String.valueOf(rs.getString("RoomNumber")); 
                String Occupancy = String.valueOf(rs.getString("Occupancy"));
                String Meal_Plan = String.valueOf(rs.getString("MealPlan"));
                String tbData[] = {Reservation_ID,Name,Check_In_Date,Room_Type,Bed_Type,Room_Number,Occupancy,Meal_Plan}; 
                DefaultTableModel tbModel = (DefaultTableModel)tblInhouse.getModel();
                tbModel.addRow(tbData);
            
        }
        }
        catch(Exception ex){
            {
                JOptionPane.showMessageDialog(null, "Error Connecting to Database"+ex,"Inhouse Guests Form",
                    JOptionPane.ERROR_MESSAGE);
            }
        }    
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ViewInHouseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInHouseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInHouseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInHouseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInHouseList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInhouse;
    // End of variables declaration//GEN-END:variables
}
