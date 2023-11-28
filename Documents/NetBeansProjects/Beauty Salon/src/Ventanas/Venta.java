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
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Venta() {
        initComponents();
        panel_transparent.setBackground(new Color (212,176,155,200));
        panel_Transparent1.setBackground(new Color (255,255,255,200));
        panel_Transparent2.setBackground(new Color (255,255,255,200));
        panel_Transparent3.setBackground(new Color (255,255,255,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_transparent = new javax.swing.JPanel();
        label_Nombre = new javax.swing.JLabel();
        textField_Client_Name_input = new javax.swing.JTextField();
        label_No_contacto = new javax.swing.JLabel();
        panel_Transparent1 = new javax.swing.JPanel();
        label_titulo1 = new javax.swing.JLabel();
        HOME_ICON = new javax.swing.JLabel();
        TextField_No_contacto = new javax.swing.JTextField();
        Label_Fecha = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        label_Borered = new javax.swing.JLabel();
        panel_Transparent2 = new javax.swing.JPanel();
        panel_Transparent3 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_Hora = new javax.swing.JLabel();
        jTextField_Hora = new javax.swing.JTextField();
        jTextField_Direccion = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_transparent.setBackground(new java.awt.Color(212, 176, 155));
        panel_transparent.setEnabled(false);
        panel_transparent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_transparentMouseDragged(evt);
            }
        });
        panel_transparent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_transparentMousePressed(evt);
            }
        });
        panel_transparent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Nombre.setText("NOMBRE:");
        label_Nombre.setFocusable(false);
        label_Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panel_transparent.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 187, 110, 40));

        textField_Client_Name_input.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_Client_Name_input.setText(" ");
        textField_Client_Name_input.setBorder(null);
        textField_Client_Name_input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel_transparent.add(textField_Client_Name_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 300, 40));

        label_No_contacto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_No_contacto.setText("NO. CONTACTO:");
        panel_transparent.add(label_No_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 130, 40));

        panel_Transparent1.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo1.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo1.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        label_titulo1.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo1.setText("BEAUTY SALON & SPA");
        label_titulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        HOME_ICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png"))); // NOI18N
        HOME_ICON.setFocusable(false);
        HOME_ICON.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HOME_ICON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOME_ICONMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOME_ICONMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HOME_ICONMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_Transparent1Layout = new javax.swing.GroupLayout(panel_Transparent1);
        panel_Transparent1.setLayout(panel_Transparent1Layout);
        panel_Transparent1Layout.setHorizontalGroup(
            panel_Transparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Transparent1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HOME_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(label_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        panel_Transparent1Layout.setVerticalGroup(
            panel_Transparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Transparent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(HOME_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_transparent.add(panel_Transparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        TextField_No_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_No_contactoActionPerformed(evt);
            }
        });
        panel_transparent.add(TextField_No_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 300, 40));

        Label_Fecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Fecha.setText("FECHA:");
        panel_transparent.add(Label_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 60, 40));

        jDateChooser.setDateFormatString("d,MMMM,y");
        panel_transparent.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 170, 40));

        label_Borered.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Borered.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Buscar cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Palatino Linotype", 0, 12))); // NOI18N
        panel_transparent.add(label_Borered, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 1000, 390));

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Transparent2Layout = new javax.swing.GroupLayout(panel_Transparent2);
        panel_Transparent2.setLayout(panel_Transparent2Layout);
        panel_Transparent2Layout.setHorizontalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_Transparent2Layout.setVerticalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_transparent.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1130, -1));

        panel_Transparent3.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText(" Citas");
        label_titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_Transparent3Layout = new javax.swing.GroupLayout(panel_Transparent3);
        panel_Transparent3.setLayout(panel_Transparent3Layout);
        panel_Transparent3Layout.setHorizontalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Transparent3Layout.setVerticalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_transparent.add(panel_Transparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 89, 400, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("CORREO ELECTRONICO:");
        panel_transparent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, 40));

        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });
        panel_transparent.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 240, 40));

        jLabel_Hora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_Hora.setText("HORA:");
        panel_transparent.add(jLabel_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, 40));
        panel_transparent.add(jTextField_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 90, 40));

        jTextField_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DireccionActionPerformed(evt);
            }
        });
        panel_transparent.add(jTextField_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 300, 40));

        jLabel_Direccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Direccion.setText("DIRECCIÓN:");
        panel_transparent.add(jLabel_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 130, 40));

        getContentPane().add(panel_transparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 730));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg_Registros.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_transparentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMousePressed
        // TODO add your handling code here:\
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panel_transparentMousePressed

    private void panel_transparentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();

        int y = evt.getYOnScreen();

        Venta.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panel_transparentMouseDragged

    private void jTextField_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DireccionActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void TextField_No_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_No_contactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_No_contactoActionPerformed

    private void HOME_ICONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseExited
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png")));
    }//GEN-LAST:event_HOME_ICONMouseExited

    private void HOME_ICONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseEntered
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_LIGHTBROWN.png")));
    }//GEN-LAST:event_HOME_ICONMouseEntered

    private void HOME_ICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseClicked
        // TODO add your handling code here:
        Clientes_Windows cw = new Clientes_Windows();
        cw.setVisible(true);
        dispose();
    }//GEN-LAST:event_HOME_ICONMouseClicked
    
   
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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME_ICON;
    private javax.swing.JLabel Label_Fecha;
    private javax.swing.JTextField TextField_No_contacto;
    private javax.swing.JLabel bgImage;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Hora;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Hora;
    private javax.swing.JLabel label_Borered;
    private javax.swing.JLabel label_No_contacto;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_Transparent2;
    private javax.swing.JPanel panel_Transparent3;
    private javax.swing.JPanel panel_transparent;
    private javax.swing.JTextField textField_Client_Name_input;
    // End of variables declaration//GEN-END:variables
    private int xx, xy;
}
