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
public class Update extends javax.swing.JFrame {
  Connection con;
    /**
     * Creates new form CheckinReception
     */
    public Update() 
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
  
        //SimpleDateFormat dateForm = new SimpleDateFormat("yyyy/MM/dd");
        //Calendar cal=Calendar.getInstance();
        //dateIn.setDate(cal.getTime());
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
txtRnumber.setText("");
txtRnumber.setText("");
cmbBedtype.setSelectedItem(null);
cmbMeal.setSelectedItem(null);
cmbRtype.setSelectedItem(null);
cmbroom.setSelectedItem(null);
}     
      public void unblocktext()  {  
        txtEmail.setEditable(true);
        txtName.setEditable(true);
        txtNic.setEditable(true);
        txtMealprice.setEditable(true);
        txtAddress.setEditable(true);
        txtCin.setEditable(true);
        txtOcc.setEditable(true);
        txtphone.setEditable(true);
        txtRnumber.setEditable(true);   
  } 
  
   public void blocktext()  { 
        txtEmail.setEditable(false);
        txtName.setEditable(false);
        txtNic.setEditable(false);
        txtMealprice.setEditable(false);
        txtAddress.setEditable(false);
        txtCin.setEditable(false);
        txtOcc.setEditable(false);
        txtphone.setEditable(false);
        txtRnumber.setEditable(false);
         txtRoomprice.setEditable(false);
        txtMealprice.setEditable(false);
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

        bg = new javax.swing.JLabel();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCin = new javax.swing.JTextField();
        txtRnumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bG1.jpg"))); // NOI18N
        bg.setMaximumSize(new java.awt.Dimension(1292, 698));
        bg.setMinimumSize(new java.awt.Dimension(1292, 698));
        bg.setPreferredSize(new java.awt.Dimension(1292, 698));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Amend Inhouse Details");
        setMaximumSize(new java.awt.Dimension(1292, 698));
        setMinimumSize(new java.awt.Dimension(1292, 698));
        setPreferredSize(new java.awt.Dimension(1292, 698));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search (2).png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 116, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Room Number");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 98, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bed Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Reservation ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));
        getContentPane().add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 332, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mobile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 332, 30));
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 332, 30));

        cmbBedtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Double", "Triple" }));
        cmbBedtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBedtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBedtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 167, 30));

        txtOcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccActionPerformed(evt);
            }
        });
        getContentPane().add(txtOcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 170, 30));

        cmbroom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbroomActionPerformed(evt);
            }
        });
        getContentPane().add(cmbroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 167, 30));

        txtMealprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMealpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtMealprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 170, 30));

        cmbMeal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMealActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Room Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));

        txtRoomprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoompriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtRoomprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 170, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 332, 110));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Meal Plan");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Meal Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 332, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NIC");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Occupancy");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Check-In");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, 22));

        cmbRtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Superior", "Deluxe" }));
        cmbRtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 167, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel7.setText("Amend Inhouse Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-save-close-48 (1).png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 120, 39));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-clear-symbol-48.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 116, 40));
        getContentPane().add(txtCin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 330, 30));

        txtRnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRnumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtRnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 170, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Current Room Number");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bG1.jpg"))); // NOI18N
        bg1.setMaximumSize(new java.awt.Dimension(1292, 698));
        bg1.setMinimumSize(new java.awt.Dimension(1292, 698));
        bg1.setPreferredSize(new java.awt.Dimension(1292, 698));
        getContentPane().add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 690));

        setSize(new java.awt.Dimension(1334, 716));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       loadmeal();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String id=txtID.getText();
        try
        {
            PreparedStatement stmt=con.prepareStatement("select Name,NIC,Mobile,Address,Email,Checkin,RoomType,BedType,RoomNumber,Occupancy,MealPlan,MealPrice,RoomPrice from CheckIns where RID='"+id+"'AND Status='In'");
            ResultSet rs=stmt.executeQuery();
            
            if(rs.next())
            {
                
                //txtID.setEditable(false);
                txtCin.setEditable(false);
                txtName.setText(rs.getString("Name"));
                txtNic.setText(rs.getString("NIC"));
                txtphone.setText(rs.getString("Mobile"));
                txtAddress.setText(rs.getString("Address"));
                txtEmail.setText(rs.getString("Email"));
                txtCin.setText(rs.getString("Checkin"));
                
                cmbRtype.setSelectedItem(rs.getString("RoomType")); 
                cmbBedtype.setSelectedItem(rs.getString("BedType"));
                //cmbroom.setSelectedItem(rs.getString("RoomNumber"));
                txtRnumber.setText(rs.getString("RoomNumber"));
               
                
                txtOcc.setText(rs.getString("Occupancy"));  
                
                cmbMeal.setSelectedItem(rs.getString("MealPlan"));
             
                txtMealprice.setText(rs.getString("MealPrice"));
                txtRoomprice.setText(rs.getString("RoomPrice"));
                
                
     
       }
            else
            {
              JOptionPane.showMessageDialog(null,"Reservation doesn't exist");
               
            }
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(null,"Error encountered while searching data in the database"+ex,
                   "Check Out Form",JOptionPane.ERROR_MESSAGE);
        }   
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

               boolean valid=true;
            if(txtID.getText().isEmpty()||
            txtName.getText().isEmpty()||txtNic.getText().isEmpty()||
            txtAddress.getText().isEmpty()||cmbBedtype.getSelectedItem().toString().isEmpty()||txtEmail.getText().isEmpty()||cmbRtype.getSelectedItem().toString().isEmpty()||
            txtMealprice.getText().isEmpty()||txtOcc.getText().isEmpty()|| txtRoomprice.getText().isEmpty()||cmbMeal.getSelectedItem().toString().isEmpty()||cmbRtype.getSelectedItem().toString().isEmpty())

        {
            JOptionPane.showMessageDialog(null,"Fields can't be blank", "Add Reservation Form", JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
        else
        {
            if(valid)
                
        try
        {
            PreparedStatement stat=con.prepareStatement("Update CheckIns set Name=?, NIC=?, Mobile=?, Address=?, Email=?, RoomType=?, BedType=?, roomNumber=?, Occupancy=?, MealPlan=?, MealPrice=?, RoomPrice=?, Status=? where RID=?");

    
                    stat.setString(1,txtName.getText());
                    stat.setString(2,txtNic.getText());
                    stat.setString(3,txtphone.getText());
                    stat.setString(4,txtAddress.getText());
                    stat.setString(5,txtEmail.getText());
                    //SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
                    //String date=sdf.format(dateIn.getDate());
                    //stat.setString(6,date);
                    stat.setString(6,cmbRtype.getSelectedItem().toString());
                    stat.setString(7,cmbBedtype.getSelectedItem().toString());
                    stat.setString(8,cmbroom.getSelectedItem().toString());
                    stat.setString(9,txtOcc.getText());
                    stat.setString(10,cmbMeal.getSelectedItem().toString());
                    stat.setString(11,txtMealprice.getText());
                    stat.setString(12,txtRoomprice.getText());
                    stat.setString(13,"In");
                    stat.setString(14,txtID.getText());
       

            int rows=stat.executeUpdate();
            if(rows>0)
            {
                JOptionPane.showMessageDialog(null,"Data Updated..");
                   blocktext();
                    reset();
            }

        }
        catch(Exception ex)
        {   blocktext();
            JOptionPane.showMessageDialog(null,"Data not Updated Successully:"+ex,"Checkin Form",JOptionPane.ERROR_MESSAGE);
        }}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reset();
        autogenerate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtOccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccActionPerformed

    private void txtRnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRnumberActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JComboBox cmbBedtype;
    private javax.swing.JComboBox cmbMeal;
    private javax.swing.JComboBox cmbRtype;
    private javax.swing.JComboBox cmbroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMealprice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtOcc;
    private javax.swing.JTextField txtRnumber;
    private javax.swing.JTextField txtRoomprice;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}