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
public class Inventario_Windows_Contabilidad extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Inventario_Windows_Contabilidad() {
        initComponents();
        panel_Main.setBackground(new Color (198,214,222,180));
        panel_Transparent1.setBackground(new Color (255,255,255,200));
        panel_Transparent2.setBackground(new Color (255,255,255,200));
        
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
        panel_Transparent1 = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        label_Home_Icon = new javax.swing.JLabel();
        label_Nombre = new javax.swing.JLabel();
        TFnombre_Producto = new javax.swing.JTextField();
        label_Precio = new javax.swing.JLabel();
        TF_Precio = new javax.swing.JTextField();
        label_Cantidad = new javax.swing.JLabel();
        cantidad_Producto = new javax.swing.JSpinner();
        btn_Agregar_Producto = new javax.swing.JLabel();
        Panel_tabla = new javax.swing.JPanel();
        Label_titulo = new javax.swing.JLabel();
        TextField_Total = new javax.swing.JTextField();
        Label_Total_Prod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_Inventario = new javax.swing.JTable();
        TextField_Total1 = new javax.swing.JTextField();
        Label_Total_Prod1 = new javax.swing.JLabel();
        btn_Actualizar_Producto = new javax.swing.JLabel();
        btn_Eliminar_Producto = new javax.swing.JLabel();
        panel_Transparent2 = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Main.setBackground(new java.awt.Color(198, 214, 222));
        panel_Main.setEnabled(false);
        panel_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Transparent1.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        panel_Transparent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_title.setForeground(new java.awt.Color(105, 133, 149));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Inventario");
        label_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Transparent1.add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 250, 80));

        label_Home_Icon.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        label_Home_Icon.setForeground(new java.awt.Color(105, 87, 86));
        label_Home_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Home_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_BLUE.png"))); // NOI18N
        label_Home_Icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_Home_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Home_IconMouseClicked(evt);
            }
        });
        panel_Transparent1.add(label_Home_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 50));

        panel_Main.add(panel_Transparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 70));

        label_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_Nombre.setText("PRODUCTO:");
        panel_Main.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, 30));

        TFnombre_Producto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TFnombre_Producto.setBorder(null);
        TFnombre_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel_Main.add(TFnombre_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 320, 30));

        label_Precio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Precio.setForeground(new java.awt.Color(0, 0, 0));
        label_Precio.setText("PRECIO:");
        panel_Main.add(label_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 70, 30));

        TF_Precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TF_Precio.setBorder(null);
        TF_Precio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel_Main.add(TF_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 130, 30));

        label_Cantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        label_Cantidad.setText("CANTIDAD:");
        panel_Main.add(label_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 80, 30));

        cantidad_Producto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidad_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_Main.add(cantidad_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 70, 30));

        btn_Agregar_Producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Agregar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Agregar_Producto_White.png"))); // NOI18N
        btn_Agregar_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Agregar_Producto.setFocusable(false);
        btn_Agregar_Producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Agregar_Producto.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Agregar_Producto.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Agregar_Producto.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Agregar_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Agregar_ProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Agregar_ProductoMouseExited(evt);
            }
        });
        panel_Main.add(btn_Agregar_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, -1));

        Panel_tabla.setBackground(new java.awt.Color(105, 133, 149));
        Panel_tabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_titulo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        Label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_titulo.setText("Lista de Productos");
        Panel_tabla.add(Label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 13, 241, -1));

        TextField_Total.setEditable(false);
        Panel_tabla.add(TextField_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 157, 33));

        Label_Total_Prod.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Total_Prod.setForeground(new java.awt.Color(255, 255, 255));
        Label_Total_Prod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Total_Prod.setText("TOTAL:");
        Panel_tabla.add(Label_Total_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 80, 24));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        Tab_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "TOTAL", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tab_Inventario);

        Panel_tabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 950, 216));

        TextField_Total1.setEditable(false);
        Panel_tabla.add(TextField_Total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 157, 33));

        Label_Total_Prod1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Total_Prod1.setForeground(new java.awt.Color(255, 255, 255));
        Label_Total_Prod1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Total_Prod1.setText("CANTIDAD TOTAL:");
        Panel_tabla.add(Label_Total_Prod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 141, 24));

        panel_Main.add(Panel_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 950, 320));

        btn_Actualizar_Producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Actualizar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Actualizar_Producto_White.png"))); // NOI18N
        btn_Actualizar_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Actualizar_Producto.setFocusable(false);
        btn_Actualizar_Producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Actualizar_Producto.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Actualizar_Producto.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Actualizar_Producto.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Actualizar_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Actualizar_ProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Actualizar_ProductoMouseExited(evt);
            }
        });
        panel_Main.add(btn_Actualizar_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 200, -1));

        btn_Eliminar_Producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Eliminar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Eliminar_Producto_White.png"))); // NOI18N
        btn_Eliminar_Producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Eliminar_Producto.setFocusable(false);
        btn_Eliminar_Producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Eliminar_Producto.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Eliminar_Producto.setMinimumSize(new java.awt.Dimension(204, 36));
        btn_Eliminar_Producto.setPreferredSize(new java.awt.Dimension(200, 36));
        btn_Eliminar_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Eliminar_ProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Eliminar_ProductoMouseExited(evt);
            }
        });
        panel_Main.add(btn_Eliminar_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 200, -1));

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));
        panel_Transparent2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        javax.swing.GroupLayout panel_Transparent2Layout = new javax.swing.GroupLayout(panel_Transparent2);
        panel_Transparent2.setLayout(panel_Transparent2Layout);
        panel_Transparent2Layout.setHorizontalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        panel_Transparent2Layout.setVerticalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        panel_Main.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1150, 60));

        getContentPane().add(panel_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1150, 680));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds_Fondo/Contabilidad_bg.jpg"))); // NOI18N
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void label_Home_IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Home_IconMouseClicked
        // TODO add your handling code here:
        Home_Windows_Contabilidad hwc = new Home_Windows_Contabilidad();
        hwc.setVisible(true);
        dispose();
    }//GEN-LAST:event_label_Home_IconMouseClicked

    private void btn_Agregar_ProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Agregar_ProductoMouseEntered
        // TODO add your handling code here:
        btn_Agregar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Agregar_Producto_Blue.png"))); 
    }//GEN-LAST:event_btn_Agregar_ProductoMouseEntered

    private void btn_Agregar_ProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Agregar_ProductoMouseExited
        // TODO add your handling code here:
        //btn_Iniciar_Ses.setBorder(RoundRectangle2D);
        btn_Agregar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Agregar_Producto_White.png"))); 
    }//GEN-LAST:event_btn_Agregar_ProductoMouseExited

    private void btn_Actualizar_ProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Actualizar_ProductoMouseEntered
        // TODO add your handling code here:
        btn_Actualizar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Actualizar_Producto_Blue.png"))); 
    }//GEN-LAST:event_btn_Actualizar_ProductoMouseEntered

    private void btn_Actualizar_ProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Actualizar_ProductoMouseExited
        // TODO add your handling code here:
        btn_Actualizar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Actualizar_Producto_White.png"))); 
    }//GEN-LAST:event_btn_Actualizar_ProductoMouseExited

    private void btn_Eliminar_ProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Eliminar_ProductoMouseEntered
        // TODO add your handling code here:
        btn_Eliminar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Eliminar_Producto_Blue.png"))); 
    }//GEN-LAST:event_btn_Eliminar_ProductoMouseEntered

    private void btn_Eliminar_ProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Eliminar_ProductoMouseExited
        // TODO add your handling code here:
        btn_Eliminar_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Eliminar_Producto_White.png"))); 
    }//GEN-LAST:event_btn_Eliminar_ProductoMouseExited

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
            java.util.logging.Logger.getLogger(Inventario_Windows_Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario_Windows_Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario_Windows_Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario_Windows_Contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-flabel_Precio//</editor-fold>
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
                new Inventario_Windows_Contabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Total_Prod;
    private javax.swing.JLabel Label_Total_Prod1;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JPanel Panel_tabla;
    private javax.swing.JTextField TF_Precio;
    private javax.swing.JTextField TFnombre_Producto;
    private javax.swing.JTable Tab_Inventario;
    private javax.swing.JTextField TextField_Total;
    private javax.swing.JTextField TextField_Total1;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Actualizar_Producto;
    private javax.swing.JLabel btn_Agregar_Producto;
    private javax.swing.JLabel btn_Eliminar_Producto;
    private javax.swing.JSpinner cantidad_Producto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Cantidad;
    private javax.swing.JLabel label_Home_Icon;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_Precio;
    private javax.swing.JLabel label_title;
    private javax.swing.JPanel panel_Main;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_Transparent2;
    // End of variables declaration//GEN-END:variables
}
