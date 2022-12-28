/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import controller.UserController;
import models.User;

/**
 *
 * @author acer
 */
public class feedback extends javax.swing.JFrame {

    /**
     * Creates new form feedback
     */
    public feedback() {
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
        tfFeedback = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sumbit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        editFeedback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        feed = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        feed1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFeedbackActionPerformed(evt);
            }
        });
        jPanel1.add(tfFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 234, 62));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("KARYAKRAM FEEDBACK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 37, 189, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Give a feedback:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 234, -1));

        sumbit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sumbit.setForeground(new java.awt.Color(102, 102, 255));
        sumbit.setText("SUBMIT");
        sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitActionPerformed(evt);
            }
        });
        jPanel1.add(sumbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        editFeedback.setText("EDIT");
        editFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFeedbackActionPerformed(evt);
            }
        });
        jPanel1.add(editFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Feedbacks");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        feed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        feed.setToolTipText("");
        feed.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(feed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        feed1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        feed1.setToolTipText("");
        feed1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(feed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitActionPerformed
//        noti1.setText("You have logged in sucessfully.");
String feedback = tfFeedback.getText();
User u1 = new User(null,null,null,null,null,null,feedback,null,null,null);
UserController uc = new UserController();
int rs = uc.updateFeedback(u1);        
JOptionPane.showMessageDialog(this, "Thankyou For the Feedback");

        dispose(); 
// TODO add your handling code here:
    }//GEN-LAST:event_sumbitActionPerformed

    private void tfFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFeedbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFeedbackActionPerformed

    private void editFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFeedbackActionPerformed
        // TODO add your handling code here:
        dispose();
        new editFeedback().setVisible(true);

    }//GEN-LAST:event_editFeedbackActionPerformed
    public void view(){
        try {
            ResultSet result1 = new UserController().selectFeedback();
            while(result1.next()){
                String fname = result1.getString(1);
                String feedback = result1.getString(2);
                feed.setText(fname);
                feed1.setText(feedback);
            }
                
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }}
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
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editFeedback;
    private javax.swing.JLabel feed;
    private javax.swing.JLabel feed1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sumbit;
    private javax.swing.JTextField tfFeedback;
    // End of variables declaration//GEN-END:variables
}
