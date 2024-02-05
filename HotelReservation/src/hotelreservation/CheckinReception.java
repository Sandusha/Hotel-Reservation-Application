/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelreservation;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.management.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandusha
 */
public class CheckinReception extends javax.swing.JFrame {
  Connection con;
    /**
     * Creates new form CheckinReception
     */
    public CheckinReception() 
    { try
        {
           DBConnection obj=new DBConnection();
           con=obj.GetConnection();
            
        }
        catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error Connecting to Database"+ex,"Reserve Room Form",
                    JOptionPane.ERROR_MESSAGE);
                }
   initComponents();
   autogenerate();
   
        txtRoomprice.setEditable(false);
        txtMealprice.setEditable(false);
        txtID.setEditable(false);
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal=Calendar.getInstance();
        dateIn.setDate(cal.getTime());
       }
    
    
        String bedtype;
        String roomtype;
        String roomno;
        String price;
        String meal;
        
    public void loadmeal(){
        
     txtMealprice.setText("");
      try      
        {   cmbMeal.removeAllItems();
            PreparedStatement stat = con.prepareStatement("select * from Meals ");
            ResultSet rs=stat.executeQuery();
            while(rs.next())
            {
            cmbMeal.addItem(rs.getString(1));
          
            }
           
        }
        
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e);
                 }
    }    
        
        
   public void loadroom(){
        cmbroom.removeAllItems();
        txtRoomprice.setText("");
        bedtype=(String)cmbBedtype.getSelectedItem();
        roomtype=(String)cmbRtype.getSelectedItem();
        try      
        { 
            PreparedStatement stat = con.prepareStatement("select * from Rooms where Bed='"+bedtype+"' and RoomType='"+roomtype+"' and Status='Not Booked' ");
            ResultSet rs=stat.executeQuery();
            while(rs.next())
            {
            cmbroom.addItem(rs.getString(1));
          
            }
                
        }
        
        catch(Exception e)
        { }
   }
   
   
   
     public void autogenerate()
 {
 try
{
    PreparedStatement stmt=con.prepareStatement("select RID from CheckIns");
    ResultSet rs=stmt.executeQuery();
    String RID=null;
    
    while (rs.next())
    {
        RID=rs.getString("RID");
    }
    String x=RID.substring(1);
    
    int ID = Integer.parseInt(x);
    
    
      	String  IDS=null;
        if(ID>0 && ID<9)
      {
       ID=ID+1;
       IDS ="R00"+ID;  
      }
      else   if(ID>=9 && ID<99)
      {
       ID=ID+1;
        IDS ="R0"+ID;
               }
       else   if(ID>=99)
      {
       ID=ID+1;
        IDS ="R"+ID;
      }
txtID .setText(IDS);   
}
    
catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error "+e);
                  } 
}
     public void reset()
{txtID.setText("");
txtName.setText("");
txtNic.setText("");
txtphone.setText("");
txtAddress.setText("");
txtEmail.setText("");
txtRoomprice.setText("");
txtMealprice.setText("");
txtOcc.setText("");
cmbBedtype.setSelectedItem(null);
cmbMeal.setSelectedItem(null);
cmbRtype.setSelectedItem(null);
cmbroom.setSelectedItem(null);
}     
  public void updateroom()
  {if(!txtRoomprice.getText().equals(""))
  { try      
        { 
            PreparedStatement stmt = con.prepareStatement("update Rooms set Status='Booked' where RoomNumber='"+roomno+"'");
            stmt.execute();
        }
        
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,"Error "+e);
        }  
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

        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        cmbBedtype = new javax.swing.JComboBox();
        txtOcc = new javax.swing.JTextField();
        cmbroom = new javax.swing.JComboBox();
        txtMealprice = new javax.swing.JTextField();
        cmbMeal = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtRoomprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbRtype = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        dateIn = new com.toedter.calendar.JDateChooser();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Check In");
        setMaximumSize(new java.awt.Dimension(1292, 698));
        setMinimumSize(new java.awt.Dimension(1292, 698));
        setPreferredSize(new java.awt.Dimension(1292, 698));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-save-close-48 (1).png"))); // NOI18N
        btnSave.setText("Check in");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(480, 570, 130, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-clear-symbol-48.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 570, 116, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(799, 113, 79, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Room Number");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(799, 211, 101, 17);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(280, 110, 98, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bed Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(799, 154, 65, 17);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Reservation ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(129, 113, 103, 17);
        getContentPane().add(txtNic);
        txtNic.setBounds(280, 200, 332, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mobile");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 260, 44, 17);
        getContentPane().add(txtName);
        txtName.setBounds(279, 151, 332, 30);
        getContentPane().add(txtphone);
        txtphone.setBounds(280, 250, 332, 30);

        cmbBedtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double", "Triple" }));
        cmbBedtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBedtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBedtype);
        cmbBedtype.setBounds(948, 151, 167, 30);
        getContentPane().add(txtOcc);
        txtOcc.setBounds(948, 262, 167, 30);

        cmbroom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbroomActionPerformed(evt);
            }
        });
        getContentPane().add(cmbroom);
        cmbroom.setBounds(948, 208, 167, 30);

        txtMealprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMealpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtMealprice);
        txtMealprice.setBounds(948, 379, 167, 30);

        cmbMeal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMealActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMeal);
        cmbMeal.setBounds(948, 336, 167, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Room Price");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(799, 429, 78, 17);

        txtRoomprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoompriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtRoomprice);
        txtRoomprice.setBounds(948, 426, 167, 30);

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 300, 332, 120);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Meal Plan");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(799, 339, 64, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Meal Price");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(799, 382, 68, 17);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(280, 440, 332, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NIC");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 210, 28, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Occupancy");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(799, 262, 75, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 320, 56, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(129, 154, 40, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Check-In");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 500, 64, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 440, 36, 22);

        cmbRtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Superior", "Deluxe" }));
        cmbRtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRtype);
        cmbRtype.setBounds(948, 110, 167, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel7.setText("Check In");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 10, 160, 41);
        getContentPane().add(dateIn);
        dateIn.setBounds(280, 500, 330, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bG1.jpg"))); // NOI18N
        bg.setMaximumSize(new java.awt.Dimension(1292, 698));
        bg.setMinimumSize(new java.awt.Dimension(1292, 698));
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1350, 730);

        setSize(new java.awt.Dimension(1293, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       loadmeal();
    }//GEN-LAST:event_formWindowOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean valid=true;
        if(txtID.getText().isEmpty()||
            txtName.getText().isEmpty()||txtNic.getText().isEmpty()||
            txtAddress.getText().isEmpty()||cmbBedtype.getSelectedItem().toString().isEmpty()||txtEmail.getText().isEmpty()||cmbRtype.getSelectedItem().toString().isEmpty()||
            txtMealprice.getText().isEmpty()||txtOcc.getText().isEmpty()|| txtRoomprice.getText().isEmpty()||cmbMeal.getSelectedItem().toString().isEmpty()||cmbRtype.getSelectedItem().toString().isEmpty()||dateIn.toString().isEmpty())

        {
            JOptionPane.showMessageDialog(null,"Fields can't be blank", "Add Reservation Form", JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
        else
        {
            if(valid)
            {
                try
                {
                    PreparedStatement stat=con.prepareStatement("Insert into CheckIns values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    stat.setString(1,txtID.getText());
                    stat.setString(2,txtName.getText());
                    stat.setString(3,txtNic.getText());
                    stat.setString(4,txtphone.getText());
                    stat.setString(5,txtAddress.getText());
                    stat.setString(6,txtEmail.getText());
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
                    String date=sdf.format(dateIn.getDate());
                    stat.setString(7,date);
                    stat.setString(8,cmbRtype.getSelectedItem().toString());
                    stat.setString(9,cmbBedtype.getSelectedItem().toString());
                    stat.setString(10,cmbroom.getSelectedItem().toString());
                    stat.setString(11,txtOcc.getText());
                    stat.setString(12,cmbMeal.getSelectedItem().toString());
                    stat.setString(13,txtMealprice.getText());
                    stat.setString(14,txtRoomprice.getText());
                    stat.setString(15,"In");
                    int rows=stat.executeUpdate();

                    if(rows>0)
                    {
                        JOptionPane.showMessageDialog(null,"CheckIn details have been saved");
                        updateroom();
                        reset();
                        autogenerate();
                    }
                }

                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,"Error "+ex);
                }
            }}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();
        autogenerate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbBedtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBedtypeActionPerformed
        loadroom();
    }//GEN-LAST:event_cmbBedtypeActionPerformed

    private void cmbroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbroomActionPerformed
        roomno=(String)cmbroom.getSelectedItem();
        try
        {
            PreparedStatement stat = con.prepareStatement("select * from Rooms where RoomNumber='"+roomno+"'");
            ResultSet rs1=stat.executeQuery();
            while(rs1.next())
            {
                txtRoomprice.setText(rs1.getString(4));

            }

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_cmbroomActionPerformed

    private void txtMealpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMealpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMealpriceActionPerformed

    private void cmbMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMealActionPerformed
        meal=(String)cmbMeal.getSelectedItem();
        try
        {
            PreparedStatement stat = con.prepareStatement("select * from Meals where MealPlan='"+meal+"'");
            ResultSet rs1=stat.executeQuery();
            while(rs1.next())
            {
                txtMealprice.setText(rs1.getString(2));

            }

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_cmbMealActionPerformed

    private void txtRoompriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoompriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoompriceActionPerformed

    private void cmbRtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRtypeActionPerformed
        cmbroom.removeAllItems();
        txtRoomprice.setText("");
        bedtype=(String)cmbBedtype.getSelectedItem();
        roomtype=(String)cmbRtype.getSelectedItem();
        try
        {
            PreparedStatement stmt = con.prepareStatement("select * from Rooms where Bed='"+bedtype+"' and RoomType='"+roomtype+"' and Status='Not Booked'");
            ResultSet rs2=stmt.executeQuery();
            while(rs2.next())
            {
                cmbroom.addItem(rs2.getString(1));

            }

        }

        catch(Exception e)
        {

        }
    }//GEN-LAST:event_cmbRtypeActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(CheckinReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckinReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckinReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckinReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckinReception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbBedtype;
    private javax.swing.JComboBox cmbMeal;
    private javax.swing.JComboBox cmbRtype;
    private javax.swing.JComboBox cmbroom;
    private com.toedter.calendar.JDateChooser dateIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMealprice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtOcc;
    private javax.swing.JTextField txtRoomprice;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
