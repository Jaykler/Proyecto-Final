package Ventanas;


import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Log_in_window extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Log_in_window() {
        initComponents();
        panel_login.setBackground(new Color (212,176,155,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_login = new javax.swing.JPanel();
        label_Nombre_Salon = new javax.swing.JLabel();
        label_Bienvenido1 = new javax.swing.JLabel();
        label_Usuario = new javax.swing.JLabel();
        textField_Username_input = new javax.swing.JTextField();
        label_contrasena = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btn_Iniciar_Ses = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_login.setBackground(new java.awt.Color(212, 176, 155));
        panel_login.setEnabled(false);

        label_Nombre_Salon.setFont(new java.awt.Font("Poor Richard", 0, 80)); // NOI18N
        label_Nombre_Salon.setForeground(new java.awt.Color(0, 0, 0));
        label_Nombre_Salon.setText("<html><p>Beauty salon </p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;& Spa</p></html>");
        label_Nombre_Salon.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        label_Bienvenido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Bienvenido1.setForeground(new java.awt.Color(0, 0, 0));
        label_Bienvenido1.setText("!Bienvenido! Por favor, ingrese a su cuenta...");

        label_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        label_Usuario.setText("Usuario");

        textField_Username_input.setBackground(new java.awt.Color(255, 255, 255));
        textField_Username_input.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_Username_input.setForeground(new java.awt.Color(0, 0, 0));
        textField_Username_input.setText(" ");
        textField_Username_input.setBorder(null);
        textField_Username_input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label_contrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_contrasena.setForeground(new java.awt.Color(0, 0, 0));
        label_contrasena.setText("Contraseña");

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.setText("jPasswordField1");
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_Iniciar_Ses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Iniciar_Ses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Iniciar_Session_Exit.png"))); // NOI18N
        btn_Iniciar_Ses.setLabelFor(btn_Iniciar_Ses);
        btn_Iniciar_Ses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Iniciar_Ses.setFocusable(false);
        btn_Iniciar_Ses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Iniciar_Ses.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Iniciar_Ses.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Iniciar_Ses.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Iniciar_Ses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Iniciar_SesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Iniciar_SesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Iniciar_SesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginLayout.createSequentialGroup()
                        .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_Bienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Username_input, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(label_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(label_Nombre_Salon))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginLayout.createSequentialGroup()
                        .addComponent(btn_Iniciar_Ses, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label_Nombre_Salon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_Bienvenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(label_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textField_Username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(label_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_Iniciar_Ses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 690, 560));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds_Fondo/login_bg.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        bgImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgImageMouseDragged(evt);
            }
        });
        bgImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgImageMousePressed(evt);
            }
        });
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bgImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgImageMousePressed
        // TODO add your handling cdoe here:
        xx = evt.getX();
        xy = evt.getY();
        
    }//GEN-LAST:event_bgImageMousePressed
  
    private void bgImageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgImageMouseDragged
        // TODO add your handling code here:
        
        int x = evt.getXOnScreen();

	int y = evt.getYOnScreen();

	Log_in_window.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_bgImageMouseDragged

    private void btn_Iniciar_SesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Iniciar_SesMouseEntered
        // TODO add your handling code here:
         btn_Iniciar_Ses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Iniciar_Session.png")));
    }//GEN-LAST:event_btn_Iniciar_SesMouseEntered

    private void btn_Iniciar_SesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Iniciar_SesMouseExited
        // TODO add your handling code here:
        //btn_Iniciar_Ses.setBorder(RoundRectangle2D);
        btn_Iniciar_Ses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Iniciar_Session_Exit.png")));
    }//GEN-LAST:event_btn_Iniciar_SesMouseExited

    private void btn_Iniciar_SesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Iniciar_SesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_Iniciar_SesMouseClicked

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
            java.util.logging.Logger.getLogger(Log_in_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_in_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_in_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_in_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Iniciar_Ses;
    private javax.swing.JLabel label_Bienvenido1;
    private javax.swing.JLabel label_Nombre_Salon;
    private javax.swing.JLabel label_Usuario;
    private javax.swing.JLabel label_contrasena;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textField_Username_input;
    // End of variables declaration//GEN-END:variables
    private int xx, xy;
}
