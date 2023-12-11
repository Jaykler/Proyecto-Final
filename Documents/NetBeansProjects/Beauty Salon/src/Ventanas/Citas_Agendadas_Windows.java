package Ventanas;


import Clases.Citas;
import Clases.Utilidades;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hilda
 */
public class Citas_Agendadas_Windows extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String[] columnas = {"Id", "Fecha", "Hora"};
    String id_cliente;
    String nombre;
    String telefono;
    String correo;
    public Citas_Agendadas_Windows(String[] set) {
        initComponents();
        panel_transparent.setBackground(new Color (212,176,155,200));
        panel_Transparent1.setBackground(new Color (255,255,255,200));
        panel_Transparent2.setBackground(new Color (255,255,255,200));
        panel_Transparent3.setBackground(new Color (255,255,255,200));
        
        //Id_cita | Fecha | Hora
        this.id_cliente = set[0];
        this.nombre = set[1];
        this.telefono = set[2];
        this.correo = set[3];
        
        TFnombre.setText(set[1]);
        TFtel.setText(set[2]);
        
        String fecha = "";
            
        DCfecha.setMinSelectableDate(new Date());
        
        Tcitas.setModel(new DefaultTableModel(Utilidades.FiltrarCitas(new String[] {"", id_cliente}, Citas.citas), columnas));
        
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
        TFnombre = new javax.swing.JTextField();
        label_No_contacto = new javax.swing.JLabel();
        panel_Transparent1 = new javax.swing.JPanel();
        label_titulo1 = new javax.swing.JLabel();
        HOME_ICON = new javax.swing.JLabel();
        TFtel = new javax.swing.JTextField();
        Label_Fecha = new javax.swing.JLabel();
        Panel_Tab = new javax.swing.JPanel();
        Label_Lista_clientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tcitas = new javax.swing.JTable();
        DCfecha = new com.toedter.calendar.JDateChooser();
        btn_Buscar = new javax.swing.JLabel();
        label_Borered = new javax.swing.JLabel();
        panel_Transparent2 = new javax.swing.JPanel();
        panel_Transparent3 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        btn_Modificar_Cita = new javax.swing.JLabel();
        btn_Eliminar_Cita = new javax.swing.JLabel();
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
        panel_transparent.add(label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, -1));

        TFnombre.setEditable(false);
        TFnombre.setBackground(new java.awt.Color(255, 255, 255));
        TFnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TFnombre.setText(" ");
        TFnombre.setBorder(null);
        TFnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel_transparent.add(TFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 760, 40));

        label_No_contacto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_No_contacto.setText("NO. CONTACTO:");
        panel_transparent.add(label_No_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 120, -1));

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

        TFtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtelActionPerformed(evt);
            }
        });
        panel_transparent.add(TFtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 300, 40));

        Label_Fecha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Label_Fecha.setText("FECHA:");
        panel_transparent.add(Label_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 60, -1));

        Panel_Tab.setBackground(new java.awt.Color(128, 76, 46));

        Label_Lista_clientes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Label_Lista_clientes.setForeground(new java.awt.Color(255, 255, 255));
        Label_Lista_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Lista_clientes.setText("Lista de Citas agendadas");

        Tcitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente_nombre", "No_telefono", "Correo_electeronico", "Fecha", "Hora"
            }
        ));
        Tcitas.setToolTipText("");
        jScrollPane1.setViewportView(Tcitas);

        javax.swing.GroupLayout Panel_TabLayout = new javax.swing.GroupLayout(Panel_Tab);
        Panel_Tab.setLayout(Panel_TabLayout);
        Panel_TabLayout.setHorizontalGroup(
            Panel_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TabLayout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(Label_Lista_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        Panel_TabLayout.setVerticalGroup(
            Panel_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Label_Lista_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_transparent.add(Panel_Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 920, -1));

        DCfecha.setBackground(new java.awt.Color(255, 255, 255));
        DCfecha.setMaxSelectableDate(new java.util.Date(1717218081000L));
        DCfecha.setMinSelectableDate(new java.util.Date(1672549281000L));
        panel_transparent.add(DCfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 170, 40));

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_White.png"))); // NOI18N
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseExited(evt);
            }
        });
        panel_transparent.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, 40));

        label_Borered.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label_Borered.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Buscar cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Palatino Linotype", 0, 12))); // NOI18N
        panel_transparent.add(label_Borered, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 940, 380));

        panel_Transparent2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Transparent2Layout = new javax.swing.GroupLayout(panel_Transparent2);
        panel_Transparent2.setLayout(panel_Transparent2Layout);
        panel_Transparent2Layout.setHorizontalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        panel_Transparent2Layout.setVerticalGroup(
            panel_Transparent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panel_transparent.add(panel_Transparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 649, 1130, 70));

        panel_Transparent3.setBackground(new java.awt.Color(255, 255, 255));

        label_titulo.setBackground(new java.awt.Color(105, 87, 86));
        label_titulo.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(105, 87, 86));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText(" Citas Agendas");
        label_titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel_Transparent3Layout = new javax.swing.GroupLayout(panel_Transparent3);
        panel_Transparent3.setLayout(panel_Transparent3Layout);
        panel_Transparent3Layout.setHorizontalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Transparent3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel_Transparent3Layout.setVerticalGroup(
            panel_Transparent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Transparent3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_transparent.add(panel_Transparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 79, 400, 60));

        btn_Modificar_Cita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Modificar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Modificar_Cita_White_Cita.png"))); // NOI18N
        btn_Modificar_Cita.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Modificar_Cita.setMinimumSize(new java.awt.Dimension(200, 36));
        btn_Modificar_Cita.setPreferredSize(new java.awt.Dimension(204, 36));
        btn_Modificar_Cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Modificar_CitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Modificar_CitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Modificar_CitaMouseExited(evt);
            }
        });
        panel_transparent.add(btn_Modificar_Cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 200, -1));

        btn_Eliminar_Cita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Eliminar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Eliminar_Cita_White_Cita.png"))); // NOI18N
        btn_Eliminar_Cita.setMaximumSize(new java.awt.Dimension(204, 36));
        btn_Eliminar_Cita.setMinimumSize(new java.awt.Dimension(200, 36));
        btn_Eliminar_Cita.setPreferredSize(new java.awt.Dimension(204, 36));
        btn_Eliminar_Cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Eliminar_CitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Eliminar_CitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Eliminar_CitaMouseExited(evt);
            }
        });
        panel_transparent.add(btn_Eliminar_Cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 200, -1));

        getContentPane().add(panel_transparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 720));

        bgImage.setBackground(new java.awt.Color(212, 176, 155));
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds_Fondo/bg_Registros.jpg"))); // NOI18N
        bgImage.setText("jLabel1");
        bgImage.setMaximumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setMinimumSize(new java.awt.Dimension(1000, 2000));
        bgImage.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void panel_transparentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();

	int y = evt.getYOnScreen();

	Citas_Agendadas_Windows.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panel_transparentMouseDragged

    private void panel_transparentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_transparentMousePressed
        // TODO add your handling code here:\
        xx = evt.getX();
        xy = evt.getY();  
    }//GEN-LAST:event_panel_transparentMousePressed

    private void TFtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFtelActionPerformed

    private void btn_Modificar_CitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modificar_CitaMouseEntered
        // TODO add your handling code here:
        btn_Modificar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Modificar_Cita_Brown_Cita.png"))); 
    }//GEN-LAST:event_btn_Modificar_CitaMouseEntered

    private void btn_Modificar_CitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modificar_CitaMouseExited
        // TODO add your handling code here:
        btn_Modificar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Modificar_Cita_White_Cita.png"))); 

    }//GEN-LAST:event_btn_Modificar_CitaMouseExited

    private void btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseEntered
        // TODO add your handling code here:
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_Brown.png")));
    }//GEN-LAST:event_btn_BuscarMouseEntered

    private void btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseExited
        // TODO add your handling code here:
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Buscar_White.png")));
    }//GEN-LAST:event_btn_BuscarMouseExited

    private void HOME_ICONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseEntered
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON_LIGHTBROWN.png")));
    }//GEN-LAST:event_HOME_ICONMouseEntered

    private void HOME_ICONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseExited
        // TODO add your handling code here:
        HOME_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/HOME_ICON.png")));
    }//GEN-LAST:event_HOME_ICONMouseExited

    private void HOME_ICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_ICONMouseClicked
        SQL.Guardar.guardar();
        new Home_Windows().setVisible(true);
        dispose();
    }//GEN-LAST:event_HOME_ICONMouseClicked

    private void btn_Eliminar_CitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Eliminar_CitaMouseEntered
        // TODO add your handling code here:
        btn_Eliminar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Eliminar_Cita_Brown_Cita.png")));
    }//GEN-LAST:event_btn_Eliminar_CitaMouseEntered

    private void btn_Eliminar_CitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Eliminar_CitaMouseExited
        // TODO add your handling code here:
        btn_Eliminar_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btn_Eliminar_Cita_White_Cita.png")));
    }//GEN-LAST:event_btn_Eliminar_CitaMouseExited

    private void btn_Modificar_CitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modificar_CitaMouseClicked
        if(Tcitas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una cita");
        }else{
            int sl = Tcitas.getSelectedRow();
            String id = Tcitas.getValueAt(sl, 0).toString();
            
            new Servicios_Window(new String[] {id_cliente, nombre, telefono, correo, id}).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btn_Modificar_CitaMouseClicked

    private void btn_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseClicked
        String fecha = "";
            
        LocalDate com = DCfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
        int year = com.getYear();
        int month = com.getMonthValue();
        int day = com.getDayOfMonth();
            
        String hora = "00:00";
            
        fecha += year +"-";
            
        if(month < 10){
            fecha += "0" + month + "-";
        }else{
            fecha += month + "-";
        }
            
        if(day < 10){
            fecha += "0" + day; 
        }else{
            fecha += day;
        }
            
        fecha += " " + hora;
        
        Tcitas.setModel(new DefaultTableModel(Utilidades.FiltrarCitas(new String[] {fecha, id_cliente}, Citas.citas), columnas));
    }//GEN-LAST:event_btn_BuscarMouseClicked

    private void btn_Eliminar_CitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Eliminar_CitaMouseClicked
        if(Tcitas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una cita");
        }else{
            int o = JOptionPane.showConfirmDialog(null, "Esta seguro de que quiere eliminar esta cita?");
            
            if(o == JOptionPane.YES_OPTION){
                new Citas().eliminar(new String[] {Tcitas.getValueAt(Tcitas.getSelectedRow(), 0).toString()});
                Tcitas.setModel(new DefaultTableModel(Utilidades.FiltrarCitas(new String[] {"", id_cliente}, Citas.citas), columnas));
            }
        }
    }//GEN-LAST:event_btn_Eliminar_CitaMouseClicked

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
            java.util.logging.Logger.getLogger(Citas_Agendadas_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas_Agendadas_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas_Agendadas_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas_Agendadas_Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Citas_Agendadas_Windows(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCfecha;
    private javax.swing.JLabel HOME_ICON;
    private javax.swing.JLabel Label_Fecha;
    private javax.swing.JLabel Label_Lista_clientes;
    private javax.swing.JPanel Panel_Tab;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTextField TFtel;
    private javax.swing.JTable Tcitas;
    private javax.swing.JLabel bgImage;
    private javax.swing.JLabel btn_Buscar;
    private javax.swing.JLabel btn_Eliminar_Cita;
    private javax.swing.JLabel btn_Modificar_Cita;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Borered;
    private javax.swing.JLabel label_No_contacto;
    private javax.swing.JLabel label_Nombre;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JPanel panel_Transparent1;
    private javax.swing.JPanel panel_Transparent2;
    private javax.swing.JPanel panel_Transparent3;
    private javax.swing.JPanel panel_transparent;
    // End of variables declaration//GEN-END:variables
    private int xx, xy;
}
