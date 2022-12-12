/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class userDashboard extends javax.swing.JFrame {

  /**
   * Creates new form userDashboard
   */
  public userDashboard() {
    initComponents();
    GradientDropdownMenu menu = new GradientDropdownMenu();
    menu.setMenuHeight(113);
    menu.setHeaderGradient(false);
    
    
    jLabel1 = new javax.swing.JLabel();

    jLabel1.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/view/karyakram logo.png")
      )
    ); // NOI18N
    // jLabel1.setText("jLabel1");
    menu.add(jLabel1);
    menu.addItem("Karyakram    ");
    menu.setGradientColor(new Color(102, 102, 255), new Color(102, 102, 255));

    menu.addItem("What we do    ", "Notification", "Preview Photo");
    menu.addItem("Service    ", "Hire", "Payment", "Location Service");
    menu.addItem("Resources    ", "Feedback", "Contact Us");
    menu.applay(this);
    menu.addEvent(
      new MenuEvent() {
        @Override
        public void selected(int index, int subIndex, boolean menuItem) {
          if (menuItem) {
            //JOptionPane.showMessageDialog(null, menu.getMenuNameAt(index, subIndex).trim());

<<<<<<< HEAD
          }
=======
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/karyakram.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(345, 113));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Group 13.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(972, 578));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        jLabel4.setText("Manage best event");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 480, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
        jLabel5.setText("with one solution");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel6.setText("Karyakram");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Event in a smooth and ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("well coped manner");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 120, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Karyakram");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 120, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("What we do");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 150, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setText("Service");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 90, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setText("Resources");
        jButton5.setBorder(null);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 130, 40));

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
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 150, 50));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 113));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new Login().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
new Register().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
>>>>>>> 9348298c8f5aa38697e26fe0ff5be95d4cec49c6
        }
      }
    );
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPopupMenu1 = new javax.swing.JPopupMenu();
    Userdashboard = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    Userdashboard.setPreferredSize(new java.awt.Dimension(1366, 768));

    jLabel1.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/view/karyakram.png"))
    ); // NOI18N
    jLabel1.setPreferredSize(new java.awt.Dimension(345, 113));

    jLabel3.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/view/Group 13.png"))
    ); // NOI18N
    jLabel3.setText("jLabel3");
    jLabel3.setPreferredSize(new java.awt.Dimension(972, 578));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
    jLabel4.setText("Manage best event");

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 52)); // NOI18N
    jLabel5.setText("with one solution");

    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
    jLabel6.setText("Karyakram");

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel7.setText("Event in a smooth and ");

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel8.setText("well coped manner");

    jButton1.setBackground(new java.awt.Color(102, 102, 255));
    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Sign In ");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout UserdashboardLayout = new javax.swing.GroupLayout(
      Userdashboard
    );
    Userdashboard.setLayout(UserdashboardLayout);
    UserdashboardLayout.setHorizontalGroup(
      UserdashboardLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jLabel1,
          javax.swing.GroupLayout.PREFERRED_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.PREFERRED_SIZE
        )
        .addGroup(
          UserdashboardLayout
            .createSequentialGroup()
            .addGap(90, 90, 90)
            .addGroup(
              UserdashboardLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(
                      jButton1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      120,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addComponent(jLabel5)
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(
                      jLabel3,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addComponent(
                  jLabel4,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  480,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(jLabel6)
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel8)
                )
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel7)
                )
            )
        )
    );
    UserdashboardLayout.setVerticalGroup(
      UserdashboardLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          UserdashboardLayout
            .createSequentialGroup()
            .addComponent(
              jLabel1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(7, 7, 7)
            .addGroup(
              UserdashboardLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(470, 470, 470)
                    .addComponent(
                      jButton1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      50,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jLabel5)
                )
                .addComponent(
                  jLabel3,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(
                      jLabel4,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      80,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jLabel6)
                )
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addComponent(jLabel8)
                )
                .addGroup(
                  UserdashboardLayout
                    .createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(jLabel7)
                )
            )
        )
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          Userdashboard,
          javax.swing.GroupLayout.PREFERRED_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.PREFERRED_SIZE
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addComponent(
              Userdashboard,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              762,
              Short.MAX_VALUE
            )
            .addContainerGap()
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //     TODO add your handling code here:
  }//GEN-LAST:event_jButton1ActionPerformed

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
      java.util.logging.Logger
        .getLogger(userDashboard.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(userDashboard.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(userDashboard.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(userDashboard.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new userDashboard().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel Userdashboard;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPopupMenu jPopupMenu1;
  // End of variables declaration//GEN-END:variables
}
