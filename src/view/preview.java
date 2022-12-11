package view;

import java.io.File;
import view.Test;
/**
 *
 * @author acer
 */
public class preview extends javax.swing.JFrame {

//    private Test test;
    /** Creates new form preview */
    public preview() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        home_btn = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        karyakram = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        karyakram1 = new javax.swing.JButton();
        karyakram2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        navigation_bar = new javax.swing.JLabel();
        main_frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("GALLERY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 200, 70));

        home_btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        home_btn.setText("What we do");
        home_btn.setBorder(null);
        home_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                home_btnFocusGained(evt);
            }
        });
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 160, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/karayakam.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        karyakram.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        karyakram.setText("Resources");
        karyakram.setBorder(null);
        karyakram.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                karyakramFocusGained(evt);
            }
        });
        karyakram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyakramActionPerformed(evt);
            }
        });
        getContentPane().add(karyakram, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 130, 40));

        img.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image1 1.png"))); // NOI18N
        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 289, 178));

        img1.setBackground(new java.awt.Color(255, 255, 255));
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image2 1.png"))); // NOI18N
        img1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 289, 178));

        img2.setBackground(new java.awt.Color(255, 255, 255));
        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image3 1.png"))); // NOI18N
        img2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 289, 178));

        img3.setBackground(new java.awt.Color(255, 255, 255));
        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image4 1.png"))); // NOI18N
        img3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, -1, 178));

        img4.setBackground(new java.awt.Color(255, 255, 255));
        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image5 1.png"))); // NOI18N
        img4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 270, 178));

        img6.setBackground(new java.awt.Color(255, 255, 255));
        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image6 1.png"))); // NOI18N
        img6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 270, 178));

        img7.setBackground(new java.awt.Color(255, 255, 255));
        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagespath/image7 1.png"))); // NOI18N
        img7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 280, 178));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CONFERENCE MEETINGS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("RECEPTION CEREMONY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("FANCY DINNER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("BIRTHDAY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("FORMAL DINNER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CONCERT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("MARRIAGE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        karyakram1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        karyakram1.setText("Karyakam");
        karyakram1.setBorder(null);
        karyakram1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                karyakram1FocusGained(evt);
            }
        });
        karyakram1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyakram1ActionPerformed(evt);
            }
        });
        getContentPane().add(karyakram1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 130, 40));

        karyakram2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        karyakram2.setText("Services");
        karyakram2.setBorder(null);
        karyakram2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                karyakram2FocusGained(evt);
            }
        });
        karyakram2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyakram2ActionPerformed(evt);
            }
        });
        getContentPane().add(karyakram2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 130, 40));

        jButton6.setBackground(new java.awt.Color(242, 242, 242));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 255));
        jButton6.setText("Register");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 150, 50));

        navigation_bar.setBackground(new java.awt.Color(255, 255, 255));
        navigation_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(navigation_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 113));
        getContentPane().add(main_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_home_btnFocusGained
        // TODO add your handling code here:
        // home_btn.setSize(getPreferredSize());
        
    }//GEN-LAST:event_home_btnFocusGained

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home_btnActionPerformed

    private void karyakramFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_karyakramFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_karyakramFocusGained

    private void karyakramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyakramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_karyakramActionPerformed

    private void karyakram1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_karyakram1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_karyakram1FocusGained

    private void karyakram1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyakram1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_karyakram1ActionPerformed

    private void karyakram2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_karyakram2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_karyakram2FocusGained

    private void karyakram2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyakram2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_karyakram2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Register().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(preview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new preview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton karyakram;
    private javax.swing.JButton karyakram1;
    private javax.swing.JButton karyakram2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel main_frame;
    private javax.swing.JLabel navigation_bar;
    // End of variables declaration//GEN-END:variables

}
