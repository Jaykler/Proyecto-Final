/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
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
    
    public static void Agregar_a_resumen2(JTable set, JTable objetivo, JTextField Total){
        int sl = set.getSelectedRow();
        String[][] modelo = new String[1][3];
        
        String mensaje = "Quiere agregar el producto " + set.getValueAt(sl, 1) + " con precio " + set.getValueAt(sl, 2)+ "?";
        int o = JOptionPane.showConfirmDialog(null, mensaje);
        
        
        
        
        if(o == JOptionPane.YES_OPTION){
            
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad: "));
            
            if(objetivo.getRowCount() != 0){
                for(int i = 0; i < objetivo.getRowCount(); i++){
                    if(objetivo.getValueAt(i, 0).toString().equals(set.getValueAt(sl, 1).toString())){
                        cantidad += Integer.parseInt(objetivo.getValueAt(i, 2).toString());
                    }
                }
            }
            
            int comp = objetivo.getRowCount() > 0? Integer.parseInt(set.getValueAt(sl, 3).toString()): 100;
            
            if(cantidad <= comp){
                
                if(objetivo.getRowCount() == 0){
                    modelo[0][0] = set.getValueAt(sl, 1).toString();
                    modelo[0][1] = set.getValueAt(sl, 2).toString();
                    modelo[0][2] = String.valueOf(cantidad);
                    objetivo.setModel(new DefaultTableModel(modelo, new String[] {"Producto", "Precio", "Cantidad"}));
                }else{
                    boolean val = false;
                    for(int i = 0; i < objetivo.getRowCount(); i++){
                        if(objetivo.getValueAt(i, 0).equals(set.getValueAt(sl, 1))){
                        
                            modelo = new String[objetivo.getRowCount()][3];
                        
                            for(int y = 0; y < objetivo.getRowCount(); y++){
                                if(y != i){
                                    modelo[y][0] = objetivo.getValueAt(y, 0).toString();
                                    modelo[y][1] = objetivo.getValueAt(y, 1).toString();
                                    modelo[y][2] = objetivo.getValueAt(y, 2).toString();
                                }else{
                                    modelo[y][0] = objetivo.getValueAt(y, 0).toString();
                                    modelo[y][1] = objetivo.getValueAt(y, 1).toString();
                                    modelo[y][2] = String.valueOf(cantidad);
                                }
                            }
                            System.out.println(1);
                            objetivo.setModel(new DefaultTableModel(modelo, new String[] {"Producto", "Precio", "Cantidad"}));
                            val = true;
                            break;
                        }
                    }
                
                
                if(val == false){
                    modelo = new String[objetivo.getRowCount() + 1][3];
                
                    for(int i = 0; i < objetivo.getRowCount(); i++){
                        modelo[i][0] = objetivo.getValueAt(i, 0).toString();
                        modelo[i][1] = objetivo.getValueAt(i, 1).toString();
                        modelo[i][2] = objetivo.getValueAt(i, 2).toString();
                    }
                
                    modelo[objetivo.getRowCount()][0] = set.getValueAt(sl, 1).toString();
                    modelo[objetivo.getRowCount()][1] = set.getValueAt(sl, 2).toString();
                    modelo[objetivo.getRowCount()][2] = String.valueOf(cantidad);
                    System.out.println(2);
                    objetivo.setModel(new DefaultTableModel(modelo, new String[] {"Producto", "Precio", "Cantidad"}));
                }
                
                
            }
            
            
            int total = 0;
            
            for(int i = 0; i < objetivo.getRowCount(); i++){
                total += Integer.parseInt(objetivo.getValueAt(i, 1).toString()) * Integer.parseInt(objetivo.getValueAt(i, 2).toString());
            }
            
            Total.setText(String.valueOf(total));
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
            }
        }
    }
    
    public static void Eliminar_de_resumen(JTable set, JTextField Total){
        int sl = set.getSelectedRow();
        String mensaje = "Quiere eliminar el servicio o producto " + set.getValueAt(sl, 0) + " con precio " + set.getValueAt(sl, 1)+ "?";
        int o = JOptionPane.showConfirmDialog(null, mensaje);
        
        if(o == JOptionPane.YES_OPTION){
            
            String[][] modelo = new String[set.getRowCount() - 1][2];
            
            int a = 0;
            for(int i = 0; i < set.getRowCount(); i++){
                if(i != sl){
                    modelo[a][0] = set.getValueAt(i, 0).toString();
                    modelo[a][1] = set.getValueAt(i, 1).toString();
                    a++;
                }
            }
                
            set.setModel(new DefaultTableModel(modelo, new String[] {"Servicio", "Precio"}));
            
            int total = 0;
            
            for(int i = 0; i < set.getRowCount(); i++){
                total += Integer.parseInt(set.getValueAt(i, 1).toString());
            }
            
            Total.setText(String.valueOf(total));
        }
    }
    
    public static void Eliminar_de_resumen2(JTable set, JTextField Total){
        int sl = set.getSelectedRow();
        String mensaje = "Quiere eliminar el servicio o producto " + set.getValueAt(sl, 0) + " con precio " + set.getValueAt(sl, 1)+ "?";
        int o = JOptionPane.showConfirmDialog(null, mensaje);
        
        if(o == JOptionPane.YES_OPTION){
            
            String[][] modelo = new String[set.getRowCount() - 1][3];
            
            int a = 0;
            for(int i = 0; i < set.getRowCount(); i++){
                if(i != sl){
                    modelo[a][0] = set.getValueAt(i, 0).toString();
                    modelo[a][1] = set.getValueAt(i, 1).toString();
                    modelo[a][2] = set.getValueAt(i, 2).toString();
                    a++;
                }
            }
                
            set.setModel(new DefaultTableModel(modelo, new String[] {"Servicio", "Precio", "Producto"}));
            
            int total = 0;
            
            for(int i = 0; i < set.getRowCount(); i++){
                total += Integer.parseInt(set.getValueAt(i, 1).toString()) * Integer.parseInt(set.getValueAt(i, 2).toString());
            }
            
            Total.setText(String.valueOf(total));
        }
    }
    
    public static String[][] FiltrarCitas(String values[] ,ArrayList<Citas> set){
        
        String[][] FR = null;
        if(values[0].equals("")){
            var data = set.stream()
                .filter(p -> p.getId_cliente() == Integer.parseInt(values[1]))
                .map(p -> new Object[] {p.getId(), p.getFecha()})
                .collect(Collectors.toList());
            
            FR = new String[data.size()][3];
        
            for(int i = 0; i < data.size(); i++){
                Object[] datap = data.get(i);
            
                FR[i][0] = datap[0].toString();
            
                String[] fh = datap[1].toString().split(" ");
            
                FR[i][1] = fh[0];
                FR[i][2] = fh[1];
            }
        }else{
            
            String[] fechahora = values[0].split(" ");
            String fecha = fechahora[0];
            
            var data = set.stream()
                .filter(p -> p.getFecha().split(" ")[0].equals(fecha) && p.getId_cliente() == Integer.parseInt(values[1]))
                .map(p -> new Object[] {p.getId(), p.getFecha()})
                .collect(Collectors.toList());
        
            FR = new String[data.size()][3];
        
            for(int i = 0; i < data.size(); i++){
                Object[] datap = data.get(i);
            
                FR[i][0] = datap[0].toString();
            
                String[] fh = datap[1].toString().split(" ");
            
                FR[i][1] = fh[0];
                FR[i][2] = fh[1];
            }
        }
        return FR;
    }
    
    public static String[][] FiltrarProductos(ArrayList<Tangible> set){
        String[][] FR = null;
        ArrayList<Tangible> rs = new ArrayList<>(set);
        
        var data = rs.stream()
                .map(p -> new Object[] {p.getId_producto(), p.getNombre(), p.getPrecio(), p.getCantidad()})
                .collect(Collectors.toList());
        
        rs.clear();
        
        for(int i = 0; i < data.size(); i++){
            Object[] datap = data.get(i);
            rs.add(new Tangible(Integer.parseInt(datap[0].toString()), datap[1].toString(), Integer.parseInt(datap[2].toString()), Integer.parseInt(datap[3].toString())));
        }
        
        FR = new String[rs.size()][4];
        
        for(int i = 0; i < rs.size(); i++){
            FR[i][0] = String.valueOf(rs.get(i).getId_producto());
            FR[i][1] = rs.get(i).getNombre();
            FR[i][2] = String.valueOf(rs.get(i).getPrecio());
            FR[i][3] = String.valueOf(rs.get(i).getCantidad());
        }
        
        return FR;
    }
}

