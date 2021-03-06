/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELWANY
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import project.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CustomerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);

    }
      int id=0; 
      String Query; 
      String roomType;
      String bed; 
      String roomNO; 
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel1.setText("Customer Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 152, -1, -1));

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel2.setText("Check In Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 152, -1, -1));

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setText("Check Out Date (Today)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 152, -1, -1));

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel4.setText("Customer Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 152, -1, -1));

        jTextField1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 184, 197, -1));

        jTextField2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 184, 143, -1));

        jTextField3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 184, 163, -1));

        jTextField4.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 184, 164, -1));

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel5.setText("Price Per Day");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 234, 123, -1));

        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel6.setText("Number Of Days Stay");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 234, -1, -1));

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel7.setText("Total Cost");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 234, -1, -1));

        jLabel8.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 234, -1, -1));

        jTextField5.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 266, 197, -1));

        jTextField6.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 266, 143, -1));

        jTextField7.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 266, 163, -1));

        jTextField8.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1041, 266, 164, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name ", "Mobile Number", "Nationalty", "Gender", "Email", "Ssn", "Address", "CheckIn Date", "Room No", "bed", "Room Type", "Price per Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1250, 250));

        jLabel9.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel9.setText("Room Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jTextField9.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 87, 72, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 86, -1, -1));

        jLabel10.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Customer Check Out.png"))); // NOI18N
        jLabel10.setText("Custome Check Out");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 11, 200, 43));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 28, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        String mobileNumber=jTextField4.getText();
        String email=jTextField8.getText();
        String Checkout=jTextField3.getText();
        String numberOfDaysStay=jTextField6.getText();
        String TotalAmount=jTextField7.getText();
        roomNO=jTextField9.getText();
        Query="update customer set numberOfDayStay ='"+numberOfDaysStay+"' ,totalAmount='"+TotalAmount+"',checkout='"+Checkout+"'where id='"+id+"'";
        InsertUpdateDelete.setData(Query, "");
        Query="update rooms set status='Not Booked' where roomNo='"+roomNO+"'";
        InsertUpdateDelete.setData(Query, "");
        String path="G:\\";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try 
        {
            PdfWriter .getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
            doc.open();
            Paragraph paragraph1=new Paragraph("                                                      Hotel Management System                                  ");
            doc.add(paragraph1);
            Paragraph paragraph2=new Paragraph("****************************************************************************************************************");
            doc.add(paragraph2);
            Paragraph paragraph3=new Paragraph("\tBill ID  : "+id+"\nCustomer Details:\nName: "+name+"\nMobile Number: "+mobileNumber+"\nEmail: "+email+"\n");
            doc.add(paragraph3);
            doc.add(paragraph2);
            Paragraph paragraph4=new Paragraph("\tRoom  Details:\nNumber: "+jTextField9.getText()+"\nType: "+roomType+"\nBed:"+bed+"\nPrice Per Day: "+jTextField5.getText()+"\n");
            doc.add(paragraph4);
            doc.add(paragraph2);
            PdfPTable tb1=new PdfPTable(4);
            tb1.addCell("Check in Date: "+jTextField2.getText()+"");
            tb1.addCell("Check Out Date: "+Checkout+"");
            tb1.addCell("NO of Days Stay: "+numberOfDaysStay+"");
            tb1.addCell("Total Amoun Paid: "+TotalAmount+"");
            doc.add(tb1);
            doc.add(paragraph2);
            Paragraph paragraph5=new Paragraph("Thanks you, Please Visit Again. ");
            doc.add(paragraph5);
            
        }
        catch (Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close() ;
        int a=JOptionPane.showConfirmDialog(null,"Do You Want To Print Bill","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
        try
        {
            if((new File("G:\\"+id+".pdf")).exists())
            {
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler G:\\"+id+".pdf");
                
            }
            else 
                System.out.println("File is not Exists");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
            new HomePage().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String roomno=jTextField9.getText(); 
       try
       {
              ResultSet rs=Select.getData("select *from customer where roomNO='"+roomno+"' and checkout is NULL");
              if (rs.next())
              {
              jTextField9.setEditable(false);
              id=rs.getInt(1);
              jTextField1.setText(rs.getString(2));
              jTextField2.setText(rs.getString(9));
              jTextField4.setText(rs.getString(3));
              jTextField5.setText(rs.getString(13));
                  SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
                  Calendar cal=Calendar.getInstance();
                  jTextField3.setText(myFormat.format(cal.getTime()));
                  String dateBeforeString=rs.getString(9);
                  java.util.Date dateBefore=myFormat.parse(dateBeforeString);
                  String dateAfterString=myFormat.format(cal.getTime());
                  java.util.Date dateAfter=myFormat.parse(dateAfterString);
                  long difference=dateAfter.getTime()- dateBefore.getTime();
                  int noOfDayStay=(int) (difference/(1000*60*60*24));
                 noOfDayStay=1;
                 jTextField6.setText(String.valueOf(noOfDayStay));
                 float price=Float.parseFloat(jTextField5.getText());
                 jTextField7.setText(String.valueOf(noOfDayStay*price));
                 jTextField8.setText(rs.getString(6));
                 roomType=rs.getString(12);
                 bed=rs.getString(11);
              }
              else
                  JOptionPane.showMessageDialog(null, "Room Number is not Booked or Room Number is not Exist ");     
       }
       catch (Exception e ){
       JOptionPane.showMessageDialog(null, e);
       }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       ResultSet rs=Select.getData("select *from customer where checkout is NULL");
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       try 
       {
       while (rs.next())
       {
       model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
       }
       
       }
       catch (Exception e )
       {
           JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void exists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
