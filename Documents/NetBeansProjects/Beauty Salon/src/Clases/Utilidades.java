/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vladi
 */
public class Utilidades {
    
    public static String[][] FiltrarClientes(int[] filtros, String[] values ,ArrayList<Clientes> set){
        
        String[][] FR = null;
        ArrayList<Clientes> rs = new ArrayList<>(set);
        
        
        if(filtros[0] == 1){
            var data = rs.stream()
                    .filter(p -> p.getNombre().equals(values[0]))
                    .map(p -> new Object[] {p.getId_cliente(), p.getNombre(), p.getTelefono(), p.getCorreo()})
                    .collect(Collectors.toList());
            
            rs.clear();
            for(int i = 0; i < data.size(); i++){
                Object[] datap = data.get(i);
                rs.add(new Clientes(Integer.parseInt(datap[0].toString()), datap[1].toString(), datap[2].toString(), datap[3].toString()));
            }
        }
        
        if(filtros[1] == 1){
            var data = rs.stream()
                    .filter(p -> p.getTelefono().equals(values[1]))
                    .map(p -> new Object[] {p.getId_cliente(), p.getNombre(), p.getTelefono(), p.getCorreo()})
                    .collect(Collectors.toList());
            
            rs.clear();
            for(int i = 0; i < data.size(); i++){
                Object[] datap = data.get(i);
                rs.add(new Clientes(Integer.parseInt(datap[0].toString()), datap[1].toString(), datap[2].toString(), datap[3].toString()));
            }
        }
        
        if(filtros[2] == 1){
            var data = rs.stream()
                    .filter(p -> p.getCorreo().equals(values[2]))
                    .map(p -> new Object[] {p.getId_cliente(), p.getNombre(), p.getTelefono(), p.getCorreo()})
                    .collect(Collectors.toList());
            
            rs.clear();
            for(int i = 0; i < data.size(); i++){
                Object[] datap = data.get(i);
                rs.add(new Clientes(Integer.parseInt(datap[0].toString()), datap[1].toString(), datap[2].toString(), datap[3].toString()));
            }
        }
        
        FR = new String[rs.size()][4];
        
        for(int i = 0; i < rs.size(); i++){
            FR[i][0] = String.valueOf(rs.get(i).getId_cliente());
            FR[i][1] = rs.get(i).getNombre();
            FR[i][2] = rs.get(i).getTelefono();
            FR[i][3] = rs.get(i).getCorreo();
        }
        
        return FR;
    }
    
    public static String[][] Filtrarservicios(int sl, ArrayList<Intangible> set){
        String[][] FR = null;
        ArrayList<Intangible> rs = new ArrayList<>(set);
        
        var data = rs.stream()
                .filter(p -> p.getTipo_servicio() == sl)
                .map(p -> new Object[] {p.getId_producto(), p.getNombre(), p.getPrecio()})
                .collect(Collectors.toList());
        
        rs.clear();
        
        for(int i = 0; i < data.size(); i++){
            Object[] datap = data.get(i);
            rs.add(new Intangible(Integer.parseInt(datap[0].toString()), datap[1].toString(), Integer.parseInt(datap[2].toString()), sl));
        }
        
        FR = new String[rs.size()][3];
        
        for(int i = 0; i < rs.size(); i++){
            FR[i][0] = String.valueOf(rs.get(i).getId_producto());
            FR[i][1] = rs.get(i).getNombre();
            FR[i][2] = String.valueOf(rs.get(i).getPrecio());
        }
        
        return FR;
    }
    
    public static void Agregar_a_resumen(JTable set, JTable objetivo, JTextField Total){
        int sl = set.getSelectedRow();
        String mensaje = "Quiere agregar el servicio " + set.getValueAt(sl, 1) + " con precio " + set.getValueAt(sl, 2)+ "?";
        int o = JOptionPane.showConfirmDialog(null, mensaje);
        
        if(o == JOptionPane.YES_OPTION){
            if(objetivo.getRowCount() == 0){
                String[][] modelo = {{set.getValueAt(sl, 1).toString(), set.getValueAt(sl, 2).toString()}};
                objetivo.setModel(new DefaultTableModel(modelo, new String[] {"Servicio", "Precio"}));
            }else{
                String[][] modelo = new String[objetivo.getRowCount() + 1][2];
                
                for(int i = 0; i < objetivo.getRowCount(); i++){
                    modelo[i][0] = objetivo.getValueAt(i, 0).toString();
                    modelo[i][1] = objetivo.getValueAt(i, 1).toString();
                }
                
                modelo[objetivo.getRowCount()][0] = set.getValueAt(sl, 1).toString();
                modelo[objetivo.getRowCount()][1] = set.getValueAt(sl, 2).toString();
                
                objetivo.setModel(new DefaultTableModel(modelo, new String[] {"Servicio", "Precio"}));
            }
            
            int total = 0;
            
            for(int i = 0; i < objetivo.getRowCount(); i++){
                total += Integer.parseInt(objetivo.getValueAt(i, 1).toString());
            }
            
            Total.setText(String.valueOf(total));
        }
    }
}
