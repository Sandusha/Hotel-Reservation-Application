/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelreservation;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sandusha
 */
public class CheckOut extends javax.swing.JFrame {
Connection con;
    /**
     * Creates new form CheckOut
     */
    public CheckOut() {try
        {
           DBConnection obj=new DBConnection();
           con=obj.GetConnection();
            
        }
        catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "Error Connecting to Database"+ex,"Check Out Form",
                    JOptionPane.ERROR_MESSAGE);
                } 
        initComponents();
         txtName.setEditable(false);
        txtPhone.setEditable(false);
        txtNic.setEditable(false);
        txtRprice.setEditable(false);
        txtMprice.setEditable(false);
         txtAmount.setEditable(false);
        txtCIn.setEditable(false);
         txtCout.setEditable(false);
        txtDstay.setEditable(false);
         txtEmail.setEditable(false);
         
         
    }
int rid;


public void updatereservations()
{String id= txtRid.getText();
    try
        {
            PreparedStatement stmt1=con.prepareStatement
            ("Update CheckIns set Status='Out' where RID='"+id+"'");
             stmt1.execute();
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error encountered while Updating data in the database"+ex,
                "Check Out Form",JOptionPane.ERROR_MESSAGE);
        }
}
public void printbill()
{
   String path="D:\\";
   com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
                      try
                      {
                          PdfWriter.getInstance(doc, new FileOutputStream(path+""+txtRid.getText()+".pdf"));
                          doc.open();
                          Paragraph para1= new Paragraph("                                                                   Villa Nilnara\n");
                          doc.add(para1);
                          Paragraph para2= new Paragraph("***************************************************************************************************************");
                          doc.add(para2);
                          Paragraph para3= new Paragraph("\tBill ID: "+txtRid.getText()+"\nName: "+txtName.getText()+"\nMobile Number: "+txtPhone.getText()+"\nEmail: "+txtEmail.getText()+"\nNIC: "+txtNic.getText()+"\n");
                          doc.add(para3);
                          doc.add(para2);
                          Paragraph para4= new Paragraph("\tRoom Number: "+txtRnumber.getText()+"\nMeal Plan Price Per Day: "+txtMprice.getText()+"\nRoom Price Per Day: "+txtRprice.getText()+"\nExtra Additions: "+txtExtra.getText()+"\n");
                          doc.add(para4);
                          doc.add(para2);
                          PdfPTable tbl1=new PdfPTable(4);
                          tbl1.addCell("Check In Date:"+txtCIn.getText()+"");
                          tbl1.addCell("Check Out Date:"+txtCout.getText()+"");
                          tbl1.addCell("No of Days Stayed:"+txtDstay.getText()+"");
                          tbl1.addCell("Total Amount Paid:"+txtAmount.getText()+"");
                          doc.add(tbl1);
                          doc.add(para2);
                          Paragraph para5= new Paragraph("Thank you.Please Visit Again!");
                          doc.add(para5);
                          Paragraph para6= new Paragraph("\tVilla Nilnara\nRajjwatta,Wellabada Pl,\nAhungalla.\nPhone: 0912255123\nEmail: VillaNilnara@Gmail.com\n");
                          doc.add(para6);
                      }
                      catch(Exception e)
                      {JOptionPane.showMessageDialog(null, e);
                      }
                      doc.close();
                      
                      int i=JOptionPane.showConfirmDialog(null,"Do You Want To Print a Bill?","Select",JOptionPane.YES_NO_OPTION);
                      if(i==0)
                      {
                      try
                      {
                      if((new File("D:\\"+txtRid.getText()+".pdf")).exists())
                      {Process P=Runtime
                                  .getRuntime()
                                  .exec("rundll32 url.dll.FileProtocolHandler D:\\"+txtRid.getText()+".pdf");
                                  Desktop.getDesktop().open(new File("D:\\"+txtRid.getText()+".pdf"));
                      }
                      
                          
                     
                      else
                      System.out.println("File does nor exist");
                     }
                      catch(IOException e)
                      {JOptionPane.showMessageDialog(null, e);}
                      }
}

public void loadtable()
{ try
            
        {
         tblMain.setModel(new DefaultTableModel(null,new String[]{"RID","Name","NIC","Mobile","Address","Email","CheckIn","RoomType","BedType","RoomNumber","Occupancy","MealPlan","MealPrice","RoomPrice"})) ;
        
            PreparedStatement stmt = con.prepareStatement("select * from CheckIns where Status='In'");
            ResultSet rs=stmt.executeQuery();
            while (rs.next())
            {
                String RID = String.valueOf(rs.getString("RID"));
                String Name = String.valueOf(rs.getString("Name"));
                String NIC = String.valueOf(rs.getString("NIC"));
                String Mobile = String.valueOf(rs.getString("Mobile"));
                String Address = String.valueOf(rs.getString("Address"));
                String Email = String.valueOf(rs.getString("Email"));
                String CheckIn = String.valueOf(rs.getString("CheckIn"));
                String RoomType = String.valueOf(rs.getString("RoomType"));
                String BedType = String.valueOf(rs.getString("BedType"));
                String RoomNumber = String.valueOf(rs.getString("RoomNumber"));
                String Occupancy = String.valueOf(rs.getString("Occupancy"));
                String MealPlan = String.valueOf(rs.getString("MealPlan"));
                String MealPrice = String.valueOf(rs.getString("MealPrice"));
                String RoomPrice = String.valueOf(rs.getString("RoomPrice"));
                String tbData[] = {RID,Name,NIC,Mobile,Address,Email,CheckIn,RoomType,BedType,RoomNumber,Occupancy,MealPlan,MealPrice,RoomPrice,}; // array for saving data
                DefaultTableModel tbModel = (DefaultTableModel)tblMain.getModel();

                tbModel.addRow(tbData);
            
        }
        }
        catch(Exception ex){
            {
                JOptionPane.showMessageDialog(null, "Error Connecting to Database"+ex,"Check out Form",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
}

 public void reset()
{txtRid.setText("");
txtName.setText("");
txtNic.setText("");
txtPhone.setText("");
txtEmail.setText("");
txtCIn.setText("");
txtCout.setText("");
txtRnumber.setText("");
txtRprice.setText("");
txtMprice.setText("");
txtDstay.setText("");
txtAmount.setText("");
txtRid.setEditable(true);
}     


public void updaterooms()
{String rn= txtRnumber.getText();
    try
        {
            PreparedStatement stmt2=con.prepareStatement
            ("update Rooms set Status='Not Booked' where RoomNumber='"+rn+"'");
             stmt2.execute();
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error encountered while Updating data in the database"+ex,
                "Check Out Form",JOptionPane.ERROR_MESSAGE);
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

        jLabel2 = new javax.swing.JLabel();
        txtRid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCIn = new javax.swing.JTextField();
        txtCout = new javax.swing.JTextField();
        txtRprice = new javax.swing.JTextField();
        txtMprice = new javax.swing.JTextField();
        txtDstay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        txtRnumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtExtra = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Check Out");
        setMinimumSize(new java.awt.Dimension(1292, 703));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel2.setText("Customer Check Out");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 10, 380, 40);
        getContentPane().add(txtRid);
        txtRid.setBounds(830, 140, 180, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("RID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(640, 140, 41, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 140, 130, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 260, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 220, 110, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Room price per day");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 180, 170, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Check-Out Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 340, 120, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Check-In Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 300, 110, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Duration of the stay");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 260, 160, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total Amount");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(640, 340, 100, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Meal price per day");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(640, 220, 160, 17);
        getContentPane().add(txtName);
        txtName.setBounds(260, 140, 160, 30);
        getContentPane().add(txtPhone);
        txtPhone.setBounds(260, 220, 160, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(260, 260, 160, 30);
        getContentPane().add(txtCIn);
        txtCIn.setBounds(260, 300, 160, 30);
        getContentPane().add(txtCout);
        txtCout.setBounds(260, 340, 160, 30);
        getContentPane().add(txtRprice);
        txtRprice.setBounds(830, 180, 180, 30);
        getContentPane().add(txtMprice);
        txtMprice.setBounds(830, 220, 180, 30);
        getContentPane().add(txtDstay);
        txtDstay.setBounds(830, 260, 180, 30);

        tblMain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblMain.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "Name", "NIC", "Mobile", "Address", "Email", "CheckIn", "RoomType", "BedType", "RoomNumber", "Occupancy", "MealPlan", "MealPrice", "RoomPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMain.setColumnSelectionAllowed(true);
        tblMain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblMain.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMain);
        tblMain.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblMain.getColumnModel().getColumnCount() > 0) {
            tblMain.getColumnModel().getColumn(0).setResizable(false);
            tblMain.getColumnModel().getColumn(1).setResizable(false);
            tblMain.getColumnModel().getColumn(2).setResizable(false);
            tblMain.getColumnModel().getColumn(3).setResizable(false);
            tblMain.getColumnModel().getColumn(4).setResizable(false);
            tblMain.getColumnModel().getColumn(5).setResizable(false);
            tblMain.getColumnModel().getColumn(6).setResizable(false);
            tblMain.getColumnModel().getColumn(7).setResizable(false);
            tblMain.getColumnModel().getColumn(8).setResizable(false);
            tblMain.getColumnModel().getColumn(9).setResizable(false);
            tblMain.getColumnModel().getColumn(10).setResizable(false);
            tblMain.getColumnModel().getColumn(11).setResizable(false);
            tblMain.getColumnModel().getColumn(12).setResizable(false);
            tblMain.getColumnModel().getColumn(13).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 470, 1250, 170);

        btnSearch.setFont(btnSearch.getFont().deriveFont(btnSearch.getFont().getStyle() | java.awt.Font.BOLD));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search (2).png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(660, 80, 110, 30);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-save-close-48 (1).png"))); // NOI18N
        btnSave.setText("Check Out");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(390, 391, 133, 50);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FormatFactoryicons8-clear-symbol-48.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setMaximumSize(new java.awt.Dimension(133, 41));
        btnClear.setMinimumSize(new java.awt.Dimension(133, 41));
        btnClear.setPreferredSize(new java.awt.Dimension(133, 41));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(770, 390, 120, 50);

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculate.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculate.setMaximumSize(new java.awt.Dimension(133, 41));
        btnCalculate.setMinimumSize(new java.awt.Dimension(133, 41));
        btnCalculate.setPreferredSize(new java.awt.Dimension(133, 41));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(580, 390, 130, 50);

        txtRnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRnumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtRnumber);
        txtRnumber.setBounds(530, 80, 120, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Room Number");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(420, 80, 110, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NIC");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 180, 28, 17);

        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });
        getContentPane().add(txtNic);
        txtNic.setBounds(260, 180, 160, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Extras");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(640, 300, 48, 20);
        getContentPane().add(txtAmount);
        txtAmount.setBounds(830, 340, 180, 30);
        getContentPane().add(txtExtra);
        txtExtra.setBounds(830, 300, 180, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bG1.jpg"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 1290, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
           loadtable();
    }//GEN-LAST:event_formComponentShown

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
     String id=txtRnumber.getText();
        try
        {
            PreparedStatement stmt=con.prepareStatement("select RID,Name,NIC,Mobile,Email,CheckIn,RoomNumber,MealPrice,RoomPrice from CheckIns where RoomNumber='"+id+"' AND Status='In'");
            ResultSet rs=stmt.executeQuery();
            
            if(rs.next())
            {
                
                txtRid.setEditable(false);
                txtRid.setText(rs.getString("RID"));
                txtName.setText(rs.getString("Name"));
                txtNic.setText(rs.getString("NIC"));
                txtPhone.setText(rs.getString("Mobile"));
                txtEmail.setText(rs.getString("Email"));
                txtCIn.setText(rs.getString("CheckIn"));
                txtRnumber.setText(rs.getString("RoomNumber"));
                txtMprice.setText(rs.getString("MealPrice"));
                txtRprice.setText(rs.getString("RoomPrice"));
                txtExtra.setText("0");
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();
        txtCout.setText(dateForm.format(cal.getTime()));
       }
            else
            {
              JOptionPane.showMessageDialog(null,"Room is not booked or doesn't exist");
               
            }
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(null,"Error encountered while searching data in the database"+ex,
                   "Check Out Form",JOptionPane.ERROR_MESSAGE);
        } 
                                             
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
    try {
       
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();
         
        java.util.Date Beforedate = dateForm.parse(txtCIn.getText());
        String dateafter=dateForm.format(cal.getTime());
        java.util.Date dateafter1=dateForm.parse(dateafter);
        long difference= dateafter1.getTime() - Beforedate.getTime();
        int nostayed=(int) (difference/(1000*60*60*24));
        if(nostayed==0)
            nostayed=1;
        
       txtDstay.setText(String.valueOf(nostayed));
        float extra=Float.parseFloat(txtExtra.getText());
        float rprice= Float.parseFloat(txtRprice.getText());
        float mprice= Float.parseFloat(txtMprice.getText());
        txtAmount.setText(String.valueOf((nostayed*(rprice+mprice))+extra));
    } catch (ParseException ex) {
         JOptionPane.showMessageDialog(null,"Error "+ex);
    }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
 String rid=txtRid.getText();
 String name=txtName.getText();
 String Email=txtEmail.getText();
 String phone=txtPhone.getText();
 String RNmbr=txtRnumber.getText();
 String meals=txtMprice.getText();
 String Rprice=txtRprice.getText();
 String cin=txtCIn.getText();
 String cout=txtCout.getText();
 String Dsty=txtDstay.getText();
 String Total=txtAmount.getText();
 String Nic=txtNic.getText();
 String Extra=txtExtra.getText();
 
        boolean valid=true;
        if(txtRid.getText().isEmpty()||
            txtDstay.getText().isEmpty()||txtAmount.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fields can't be blank", "Checkout Form", JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
        else
        {
            if(valid)
            {
                try
                {
                    PreparedStatement stmt=con.prepareStatement("Insert into CheckOuts values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    stmt.setString(1,rid);
                    stmt.setString(2,name);
                    stmt.setString(3,Nic);
                    stmt.setString(4,phone);
                    stmt.setString(5,Email);
                    stmt.setString(6,cin);
                    stmt.setString(7,cout);
                    stmt.setString(8,RNmbr);
                    stmt.setString(9,Rprice);
                    stmt.setString(10,meals);
                    stmt.setString(11,Dsty);
                    stmt.setString(12,Extra);
                    stmt.setString(13,Total);
                    int rows=stmt.executeUpdate();

                    if(rows>0)
                    {
                      JOptionPane.showMessageDialog(null,"Check Out details have been saved");
                      printbill();
                      updatereservations();
                      updaterooms();
                      loadtable();
                      reset();
                        
                   }
                }
                

                catch(SQLException ex)
                {
                    ex.printStackTrace();
                } catch (Exception ex) {
                    Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }}      
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     txtRid.setEditable(true);  
     reset();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtRnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRnumberActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMain;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCIn;
    private javax.swing.JTextField txtCout;
    private javax.swing.JTextField txtDstay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtMprice;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRid;
    private javax.swing.JTextField txtRnumber;
    private javax.swing.JTextField txtRprice;
    // End of variables declaration//GEN-END:variables
}
