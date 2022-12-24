/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import controller.HireController;
import controller.UserController;
import controller.bookingController;
import controller.venueController;
import models.Booking;
import models.Venue;
import models.hire;

/**
 *
 * @author acer
 */
public class editBooking extends javax.swing.JFrame {
    
    /**
     * Creates new form editBooking
     */
    public editBooking() {
        initComponents();
        view();
        
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
        hireCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        peopleNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        venueCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bookText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Book Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 80, -1));

        hireCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOD", "SOLTEE HOTEL", "MARRIOT", "HYAAT REGENCY", "YAK AND YETI", "PLATINUM", "GOKARNA RESORT" }));
        hireCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireComboActionPerformed(evt);
            }
        });
        jPanel1.add(hireCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("EDIT TOTAL NO OF PEOPLE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 160, -1));
        jPanel1.add(peopleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("EDIT BOOKING");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("EDIT HIRED PERSON");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, -1));

        venueCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOD", "SOLTEE HOTEL", "MARRIOT", "HYAAT REGENCY", "YAK AND YETI", "PLATINUM", "GOKARNA RESORT" }));
        venueCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venueComboActionPerformed(evt);
            }
        });
        jPanel1.add(venueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("EDIT DATE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 80, -1));
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, -1));

        confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm.setText("CONFRIM EDIT");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("EDIT VENUE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        bookText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTextActionPerformed(evt);
            }
        });
        jPanel1.add(bookText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hireComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hireComboActionPerformed

    private void venueComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venueComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venueComboActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
            String email = null;
        String phone = null;
        int v_id = 0;
        String vName = venueCombo.getSelectedItem().toString();
        String hName= hireCombo.getSelectedItem().toString();
        int noCustomers = Integer.parseInt(peopleNo.getText());
        String date = dateText.getText();
        int hireprice = 0;
        int venuePrice = 0;
        int total = 0;
        hire h1 = new hire(hName,null,null,null,null);
        Venue v1 = new Venue(0,vName,0,0,null);
        int book_id = Integer.parseInt(bookText.getText());

        HireController hc = new HireController();
        venueController vc = new venueController();

        ResultSet rSet = hc.selectHiredetails(h1);
        ResultSet rSet2 = vc.selectVenueName(v1);
        ResultSet rset3 = new UserController().selectEmail();

        try {
            while(rSet.next()){
                phone = rSet.getString(1);
                hireprice = Integer.parseInt(rSet.getString(2));   
            }

            while(rSet2.next()){
                v_id  = Integer.parseInt(rSet2.getString(1));
                venuePrice = Integer.parseInt(rSet2.getString(2));
            }

            while(rset3.next()){
                email = rset3.getString(1);

            }

              total = hireprice+venuePrice;
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(this, e);
        }

        Booking b1= new Booking(book_id,email,phone,v_id,noCustomers,date,total);
        bookingController bc = new bookingController();
        int result = bc.editBooking(b1);
        if(result>0){
            JOptionPane.showMessageDialog(this, "Booking Edited");
            dispose();
            new booking().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Booking not Edited");
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void bookTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTextActionPerformed

    public void view(){
        venueCombo.removeAllItems();
        String item = null;
        ResultSet rs = new venueController().selectVenue();
        try {
             while(rs.next()){
                item = rs.getString(2);
                venueCombo.addItem(item);
             }
        } catch (Exception e) {
            // TODO: handle exception
        }

        hireCombo.removeAllItems();

        String item1 = null;
        ResultSet rs1 = new HireController().selectHire();
        try {
            while(rs1.next()){
                item1 = rs1.getString(1);
                hireCombo.addItem(item1);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            ResultSet rs2 = new bookingController().selectBooking();
            while(rs2.next()){
                int book_id = Integer.parseInt(rs2.getString(1));
                String venue = rs2.getString(2);
                String hire = rs2.getString(3);
                String date = rs2.getString(4);
                String people = rs2.getString(5);

                venueCombo.setSelectedItem(venue);
                hireCombo.setSelectedItem(hire);
                dateText.setText(date);
                peopleNo.setText(people);
                bookText.setText(Integer.toString(book_id));

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


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
            java.util.logging.Logger.getLogger(editBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookText;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField dateText;
    private javax.swing.JComboBox<String> hireCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField peopleNo;
    private javax.swing.JComboBox<String> venueCombo;
    // End of variables declaration//GEN-END:variables
}
