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
public class Home_Windows extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Home_Windows() {
        initComponents();
        
        panel_Transparent1.setBackground(new Color (212,176,155,200));
        panel_Transparent2.setBackground(new Color (255,255,255,100));
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

        panel_Transparent1 = new javax.swing.JPanel();
        panel_Transparent2 = new javax.swing.JPanel();
        label_Home_Icon = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        label_HomeM_Icon = new javax.swing.JLabel();
        btn_Cliente_Nuevo = new javax.swing.JLabel();
        btn_Editar_Client = new javax.swing.JLabel();
        btn_Cliente_Registrado = new javax.swing.JLabel();
        btn_Productos = new javax.swing.JLabel();
        btn_Facturar = new javax.swing.JLabel();
        panel_Transparent3 = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Transparent1.setBackground(new java.awt.Color(212, 176, 155));
        panel_Transparent1.setEnabled(false);
        panel_Transparent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        panel_Transparent2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Home_Icon.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_Home_Icon.setForeground(new java.awt.Color(105, 87, 86));
        label_Home_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Home_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png"))); // NOI18N
        label_Home_Icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent2.add(label_Home_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 50));

        label_title.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_title.setForeground(new java.awt.Color(105, 87, 86));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("HOME");
        label_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent2.add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 80));

        label_HomeM_Icon.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_HomeM_Icon.setForeground(new java.awt.Color(105, 87, 86));
        label_HomeM_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_HomeM_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_GREEN.png"))); // NOI18N
        label_HomeM_Icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent2.add(label_HomeM_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 50));

        panel_Transparent1.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

        btn_Cliente_Nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cliente_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cliente_nuevo_White.png"))); // NOI18N
        btn_Cliente_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cliente_Nuevo.setFocusable(false);
        btn_Cliente_Nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cliente_Nuevo.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Cliente_Nuevo.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Cliente_Nuevo.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Cliente_Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Cliente_NuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Cliente_NuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Cliente_NuevoMouseExited(evt);
            }
        });
        panel_Transparent1.add(btn_Cliente_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 200));

        btn_Editar_Client.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Editar_Client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Editar_Cliente_White.png"))); // NOI18N
        btn_Editar_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Editar_Client.setFocusable(false);
        btn_Editar_Client.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Editar_Client.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Editar_Client.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Editar_Client.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Editar_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Editar_ClientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Editar_ClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Editar_ClientMouseExited(evt);
            }
        });
        panel_Transparent1.add(btn_Editar_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 280, 200));

        btn_Cliente_Registrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cliente_Registrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Btn_Cliente_Registrado.png"))); // NOI18N
        btn_Cliente_Registrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cliente_Registrado.setFocusable(false);
        btn_Cliente_Registrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cliente_Registrado.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Cliente_Registrado.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Cliente_Registrado.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Cliente_Registrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Cliente_RegistradoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Cliente_RegistradoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Cliente_RegistradoMouseExited(evt);
            }
        });
        panel_Transparent1.add(btn_Cliente_Registrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 280, 200));

        btn_Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Productos_White.png"))); // NOI18N
        btn_Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Productos.setFocusable(false);
        btn_Productos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Productos.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Productos.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Productos.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseExited(evt);
            }
        });
        panel_Transparent1.add(btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 280, 200));

        btn_Facturar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Facturar_White.png"))); // NOI18N
        btn_Facturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Facturar.setFocusable(false);
        btn_Facturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Facturar.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Facturar.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Facturar.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_FacturarMouseExited(evt);
            }
        });
        panel_Transparent1.add(btn_Facturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 280, 200));

        panel_Transparent3.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        panel_Transparent3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_Transparent1.add(panel_Transparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1020, 70));

        getContentPane().add(panel_Transparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 1020, 640));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds_Fondo/bg_Registros.jpg"))); // NOI18N
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cliente_RegistradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cliente_RegistradoMouseClicked
        // TODO add your handling code here:
        Registro_Windows ResgitrosW = new Registro_Windows();
        ResgitrosW.setVisible(true);
        dispose();
        //btn_Cliente_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_Registrar.png")));
    }//GEN-LAST:event_btn_Cliente_RegistradoMouseClicked

    private void btn_Cliente_RegistradoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cliente_RegistradoMouseEntered
        // TODO add your handling code here:
        btn_Cliente_Registrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cliente_Registrado_Entered.png")));
    }//GEN-LAST:event_btn_Cliente_RegistradoMouseEntered

    private void btn_Cliente_RegistradoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cliente_RegistradoMouseExited
        // TODO add your handling code here:
        btn_Cliente_Registrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cliente_Registrado.png"))); 
    }//GEN-LAST:event_btn_Cliente_RegistradoMouseExited

    private void btn_Cliente_NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cliente_NuevoMouseClicked
        // TODO add your handling code here:
        new Registration_Window().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_Cliente_NuevoMouseClicked

    private void btn_Cliente_NuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cliente_NuevoMouseEntered
        // TODO add your handling code here:
        btn_Cliente_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cliente_nuevo_Brown.png")));
    }//GEN-LAST:event_btn_Cliente_NuevoMouseEntered

    private void btn_Cliente_NuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Cliente_NuevoMouseExited
        // TODO add your handling code here:
        btn_Cliente_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Cliente_nuevo_White.png")));
    }//GEN-LAST:event_btn_Cliente_NuevoMouseExited

    private void btn_Editar_ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Editar_ClientMouseClicked
        // TODO add your handling code here:
        Actualizar_Cliente_Window acw = new Actualizar_Cliente_Window();
        acw.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_Editar_ClientMouseClicked

    private void btn_Editar_ClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Editar_ClientMouseEntered
        // TODO add your handling code here:
        btn_Editar_Client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Editar_Cliente_Brown.png")));
    }//GEN-LAST:event_btn_Editar_ClientMouseEntered

    private void btn_Editar_ClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Editar_ClientMouseExited
        // TODO add your handling code here:
        btn_Editar_Client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Editar_Cliente_White.png")));
    }//GEN-LAST:event_btn_Editar_ClientMouseExited

    private void btn_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseClicked
        // TODO add your handling code here:
        Venta_Producto_Window vpw = new Venta_Producto_Window();
        vpw.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_ProductosMouseClicked

    private void btn_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseEntered
        // TODO add your handling code here:
        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Productos_Brown.png")));
    }//GEN-LAST:event_btn_ProductosMouseEntered

    private void btn_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseExited
        // TODO add your handling code here:
        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Productos_White.png")));
    }//GEN-LAST:event_btn_ProductosMouseExited

    private void btn_FacturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseClicked
        // TODO add your handling code here:
        Facturacion_Windows fw = new Facturacion_Windows();
        fw.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_FacturarMouseClicked

    private void btn_FacturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseEntered
        // TODO add your handling code here:
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Facturar_Brown.png"))); 
    }//GEN-LAST:event_btn_FacturarMouseEntered

    private void btn_FacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturarMouseExited
        // TODO add your handling code here:
        btn_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Facturar_White.png"))); 
    }//GEN-LAST:event_btn_FacturarMouseExited

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
            java.util.logging.Logger.getLogger(Home_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Windows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Cliente_Nuevo;
    private javax.swing.JLabel btn_Cliente_Registrado;
    private javax.swing.JLabel btn_Editar_Client;
    private javax.swing.JLabel btn_Facturar;
    private javax.swing.JLabel btn_Productos;
    public javax.swing.JLabel label_HomeM_Icon;
    private javax.swing.JLabel label_Home_Icon;
    private javax.swing.JLabel label_title;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_Transparent2;
    private javax.swing.JPanel panel_Transparent3;
    // End of variables declaration//GEN-END:variables
}
