package Ventanas;


import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Home_Windows_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Home_Windows_Administrador() {
        initComponents();
        panel_Main.setBackground(new Color (145,153,149,200));
        panel_Transparent2.setBackground(new Color (255,255,255,200));
        panel_Transparent3.setBackground(new Color (255,255,255,100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Main = new javax.swing.JPanel();
        panel_Transparent2 = new javax.swing.JPanel();
        label_Home_Icon = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        btn_Recepcion = new javax.swing.JLabel();
        btn_Contabildad = new javax.swing.JLabel();
        btn_Manejo_Usuario = new javax.swing.JLabel();
        panel_Transparent3 = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Main.setBackground(new java.awt.Color(145, 153, 149));
        panel_Main.setEnabled(false);
        panel_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        panel_Transparent2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Home_Icon.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_Home_Icon.setForeground(new java.awt.Color(105, 87, 86));
        label_Home_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Home_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_GREEN.png"))); // NOI18N
        label_Home_Icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent2.add(label_Home_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 50));

        label_title.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_title.setForeground(new java.awt.Color(90, 103, 102));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("HOME");
        label_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent2.add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 80));

        panel_Main.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 80));

        btn_Recepcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Recepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Recepcion_White.png"))); // NOI18N
        btn_Recepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Recepcion.setFocusable(false);
        btn_Recepcion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Recepcion.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Recepcion.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Recepcion.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Recepcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RecepcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RecepcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RecepcionMouseExited(evt);
            }
        });
        panel_Main.add(btn_Recepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 200));

        btn_Contabildad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Contabildad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Contabilidad_White.png"))); // NOI18N
        btn_Contabildad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Contabildad.setFocusable(false);
        btn_Contabildad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Contabildad.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Contabildad.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Contabildad.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Contabildad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ContabildadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ContabildadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ContabildadMouseExited(evt);
            }
        });
        panel_Main.add(btn_Contabildad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 280, 200));

        btn_Manejo_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Manejo_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Manejo_Usuario_White.png"))); // NOI18N
        btn_Manejo_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Manejo_Usuario.setFocusable(false);
        btn_Manejo_Usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Manejo_Usuario.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Manejo_Usuario.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Manejo_Usuario.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Manejo_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Manejo_UsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Manejo_UsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Manejo_UsuarioMouseExited(evt);
            }
        });
        panel_Main.add(btn_Manejo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 280, 200));

        panel_Transparent3.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        panel_Transparent3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_Main.add(panel_Transparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1020, 80));

        getContentPane().add(panel_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 1020, 570));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds_Fondo/Management_bg_MEDIUM.jpg"))); // NOI18N
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Manejo_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Manejo_UsuarioMouseClicked
        // TODO add your handling code here:
//        Registro_Windows ResgitrosW = new Registro_Windows();
//        ResgitrosW.setVisible(true);
        dispose();
        //btn_Cliente_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_Registrar.png")));
    }//GEN-LAST:event_btn_Manejo_UsuarioMouseClicked

    private void btn_Manejo_UsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Manejo_UsuarioMouseEntered
        // TODO add your handling code here:
       btn_Manejo_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Manejo_Usuario_Green.png")));
    }//GEN-LAST:event_btn_Manejo_UsuarioMouseEntered

    private void btn_Manejo_UsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Manejo_UsuarioMouseExited
        // TODO add your handling code here:
       btn_Manejo_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Manejo_Usuario_White.png")));
    }//GEN-LAST:event_btn_Manejo_UsuarioMouseExited

    private void btn_RecepcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RecepcionMouseClicked
        // TODO add your handling code here:
        recepcionHomeCall();
        
        
    }//GEN-LAST:event_btn_RecepcionMouseClicked

    private void btn_RecepcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RecepcionMouseEntered
        // TODO add your handling code here:
        btn_Recepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Recepcion_Green.png")));
    }//GEN-LAST:event_btn_RecepcionMouseEntered

    private void btn_RecepcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RecepcionMouseExited
        // TODO add your handling code here:
       btn_Recepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Recepcion_White.png")));
    }//GEN-LAST:event_btn_RecepcionMouseExited

    private void btn_ContabildadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ContabildadMouseClicked
        // TODO add your handling code here:
        contabilidadHomeCall();
    }//GEN-LAST:event_btn_ContabildadMouseClicked

    private void btn_ContabildadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ContabildadMouseEntered
        // TODO add your handling code here:
        btn_Contabildad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Contabilidad_Green.png")));
    }//GEN-LAST:event_btn_ContabildadMouseEntered

    private void btn_ContabildadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ContabildadMouseExited
        // TODO add your handling code here:
        btn_Contabildad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Contabilidad_White.png")));
    }//GEN-LAST:event_btn_ContabildadMouseExited
    
    public void recepcionHomeCall(){
        Home_Windows HW= new Home_Windows();    
        HW.setVisible(true);
        HW.label_HomeM_Icon.setVisible(true);
        dispose();
    }
    public void contabilidadHomeCall(){
        Home_Windows_Contabilidad HWC= new Home_Windows_Contabilidad();    
        HWC.setVisible(true);
        HWC.label_HomeM_Icon.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(Home_Windows_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Windows_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Windows_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Windows_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Windows_Administrador().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Contabildad;
    private javax.swing.JLabel btn_Manejo_Usuario;
    private javax.swing.JLabel btn_Recepcion;
    private javax.swing.JLabel label_Home_Icon;
    private javax.swing.JLabel label_title;
    private javax.swing.JPanel panel_Main;
    private javax.swing.JPanel panel_Transparent2;
    private javax.swing.JPanel panel_Transparent3;
    // End of variables declaration//GEN-END:variables
}
