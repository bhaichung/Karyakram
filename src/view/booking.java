/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
public class booking extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
    public booking() {
        initComponents();
        addHire();
        addVenue();
        table();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hireCombo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        confirmHire = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        venueNameTxt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        confirmBook = new javax.swing.JButton();
        capacityTxt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ratingTxt = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        noText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        venueCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        confirmVenue = new javax.swing.JButton();
        venueDetails1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        h_name = new javax.swing.JLabel();
        h_name1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        venueDetails = new javax.swing.JLabel();
        h_name2 = new javax.swing.JLabel();
        h_name3 = new javax.swing.JLabel();
        h_name4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("KARYAKRAM BOOKING");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 270, -1));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 66, 1370, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("HIRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Person Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 280, -1, -1));

        hireCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOD", "SOLTEE HOTEL", "MARRIOT", "HYAAT REGENCY", "YAK AND YETI", "PLATINUM", "GOKARNA RESORT" }));
        hireCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hireComboItemStateChanged(evt);
            }
        });
        hireCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireComboActionPerformed(evt);
            }
        });
        jPanel1.add(hireCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 230, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("FILL UP YOUR DETAILS");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        confirmHire.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmHire.setForeground(new java.awt.Color(51, 153, 0));
        confirmHire.setText("HIRE");
        confirmHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmHireActionPerformed(evt);
            }
        });
        jPanel1.add(confirmHire, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, -1, -1));

        venueNameTxt.setText("Lord Of Drinks (LOD)");
        jPanel1.add(venueNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Price");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 70, -1));

        priceTxt.setText("Rs.50,000");
        jPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 70, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Price");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 70, -1));

        confirmBook.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        confirmBook.setForeground(new java.awt.Color(0, 153, 0));
        confirmBook.setText("CONFIRM BOOKING");
        confirmBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBookActionPerformed(evt);
            }
        });
        jPanel1.add(confirmBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, -1, 40));

        capacityTxt.setText("1500");
        jPanel1.add(capacityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 70, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Rating");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 70, -1));

        ratingTxt.setText("4.5/5");
        jPanel1.add(ratingTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Phone Number : ");
        jLabel17.setPreferredSize(new java.awt.Dimension(63, 19));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 100, 20));
        jPanel1.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 390, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("No of People");
        jLabel18.setPreferredSize(new java.awt.Dimension(63, 19));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 251, 90, -1));
        jPanel1.add(noText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 410, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Date : ");
        jLabel19.setPreferredSize(new java.awt.Dimension(63, 19));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 70, -1));
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 410, -1));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 570, 240));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("VENUE");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        venueCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOD", "SOLTEE HOTEL", "MARRIOT", "HYAAT REGENCY", "YAK AND YETI", "PLATINUM", "GOKARNA RESORT" }));
        venueCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                venueComboItemStateChanged(evt);
            }
        });
        venueCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                venueComboFocusLost(evt);
            }
        });
        venueCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                venueComboMouseReleased(evt);
            }
        });
        jPanel1.add(venueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 230, 230, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Abhigya Shrestha", "9844642649", "LOD", "Asmit", "2022-12-18", "1500", "55000"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SN", "Full Name", "Phone Number", "Venue", "Hired", "Date", "No of People", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 690, 240));

        editBtn.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        editBtn.setForeground(new java.awt.Color(102, 102, 255));
        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, 40));

        jButton3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, 40));

        confirmVenue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmVenue.setForeground(new java.awt.Color(51, 153, 0));
        confirmVenue.setText("Confirm Venue");
        confirmVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmVenueActionPerformed(evt);
            }
        });
        jPanel1.add(confirmVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        venueDetails1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(venueDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 290, 330));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("VENUE DETAILS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Venue Name ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Capacity");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 70, -1));

        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 230, 210));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 300, 70, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Phone No ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 330, 70, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Experience ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 360, 70, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Role");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 385, 70, -1));
        jPanel1.add(h_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 410, 120, 20));
        jPanel1.add(h_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 120, 20));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1320, 570));

        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 230, 210));

        venueDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(venueDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, 290, 330));
        jPanel1.add(h_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 330, 120, 20));
        jPanel1.add(h_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, 120, 20));
        jPanel1.add(h_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmHireActionPerformed
        hireCombo.setEnabled(false);
    }//GEN-LAST:event_confirmHireActionPerformed

    private void hireComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hireComboActionPerformed

    private void confirmVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmVenueActionPerformed
        venueCombo.setEnabled(false);
    }//GEN-LAST:event_confirmVenueActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            // TODO add your handling code here:
            int i = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();
           int id =Integer.parseInt(model.getValueAt(i, 0).toString());

            Booking b = new Booking(id, null,null,0,0,null,0);
            bookingController bc = new bookingController();
            int b1 = bc.chooseBooking(b);

            if(b1==1){
                JOptionPane.showMessageDialog(null, "Booking Selected");
                new editBooking().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Booking Not Confirmed");
            }
        } catch (Exception ex) {
           
        }
         
    }//GEN-LAST:event_editBtnActionPerformed

    private void venueComboMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venueComboMouseReleased
        
    }//GEN-LAST:event_venueComboMouseReleased

    private void venueComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_venueComboFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_venueComboFocusLost

    private void venueComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_venueComboItemStateChanged
        // TODO add your handling code here:
        
        String item = null;
        Object selecteditem = venueCombo.getSelectedItem();
        if(selecteditem!=null){
            item = selecteditem.toString();
    
        }
    
        Venue v1 = new Venue(0,item,0,0,null);
        venueController vc = new venueController();
    
        ResultSet rs = vc.selectVenueId(v1);
        try {
            while(rs.next()){
                String name = rs.getString(2);
                String capacity = rs.getString(3);
                String rating = rs.getString(4);
                String price = rs.getString(5);
    
                venueNameTxt.setText(name);
                capacityTxt.setText(capacity);
                ratingTxt.setText(""+rating+"/5");
                priceTxt.setText(price);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//GEN-LAST:event_venueComboItemStateChanged
    
    private void hireComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hireComboItemStateChanged
        String item = null;
        Object selecteditem = hireCombo.getSelectedItem();
        if(selecteditem!=null){
            item = selecteditem.toString();

        }

        hire h1 = new hire(item,null,null,null,null);
        HireController hc=  new HireController();

        ResultSet rs = hc.selectHireName(h1);
        try {
            while(rs.next()){
                String name = rs.getString(1);
                String phone = rs.getString(2);
                String exp = rs.getString(3);
                String role = rs.getString(4);
                String price = rs.getString(5);

                h_name1.setText(name);
                h_name2.setText(phone);
                h_name3.setText(exp);
                h_name4.setText(role);
                h_name.setText(price);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//GEN-LAST:event_hireComboItemStateChanged

    private void confirmBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBookActionPerformed
        
        String date = dateText.getText();
        String email = null;
        String phone = null;
        int v_id = 0;
        String vName = venueNameTxt.getText();
        String hName= h_name1.getText();
        int noCustomers = Integer.parseInt(noText.getText());
        int hireprice = 0;
        int venuePrice = 0;
        int total = 0;
// Check if the fields are empty
        if (date.equals("") || noCustomers == 0) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");

        } 
        else if(dateValid.dateVerify(date)){
            JOptionPane.showMessageDialog(null, "Please enter a valid date");
        }
        else {
            
            hire h1 = new hire(hName,null,null,null,null);
            Venue v1 = new Venue(0,vName,0,0,null);
    
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
    
            Booking b1= new Booking(0,email,phone,v_id,noCustomers,date,total);
            bookingController bc = new bookingController();
            System.out.println(email);
            int result = bc.insertDetails(b1);
            if(result>0){
                JOptionPane.showMessageDialog(this, "Booked Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                table();
            }
        }
    }//GEN-LAST:event_confirmBookActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            // TODO add your handling code here:
            // Booking b1 = new Booking()

            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
           if(response == JOptionPane.YES_OPTION){
            int i = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();
            int id = Integer.parseInt(model.getValueAt(i, 0).toString());
            Booking b1 = new Booking(id,null,null,0,0,null,0);
            bookingController bc = new bookingController();
            int result = bc.cancelBooking(b1);
            if(result>0){
                JOptionPane.showMessageDialog(this, "Canceled Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                table();
            }
               }
           else if(response == JOptionPane.NO_OPTION){
              return;
           }

    }//GEN-LAST:event_jButton3ActionPerformed

    public void table(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ResultSet rs = new bookingController().selectDetails();
        try {
            while(rs.next()){
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    public void addHire(){
        hireCombo.removeAllItems();

        String item = null;
        ResultSet rs = new HireController().selectHire();
        try {
            while(rs.next()){
                item = rs.getString(1);
                hireCombo.addItem(item);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void addVenue(){
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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capacityTxt;
    private javax.swing.JButton confirmBook;
    private javax.swing.JButton confirmHire;
    private javax.swing.JButton confirmVenue;
    private javax.swing.JTextField dateText;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel h_name;
    private javax.swing.JLabel h_name1;
    private javax.swing.JLabel h_name2;
    private javax.swing.JLabel h_name3;
    private javax.swing.JLabel h_name4;
    private javax.swing.JComboBox<String> hireCombo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField noText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel priceTxt;
    private javax.swing.JLabel ratingTxt;
    private javax.swing.JComboBox<String> venueCombo;
    private javax.swing.JLabel venueDetails;
    private javax.swing.JLabel venueDetails1;
    private javax.swing.JLabel venueNameTxt;
    // End of variables declaration//GEN-END:variables
}
