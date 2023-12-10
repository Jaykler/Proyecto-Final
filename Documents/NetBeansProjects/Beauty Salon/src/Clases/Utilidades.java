/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author vladi
 */
public class Utilidades {
    
    public static String[][] FiltrarClientes(int[] filtros, String[] values ,ArrayList<Clientes> set){
        
        String[][] FR = null;
        ArrayList<Clientes> rs = new ArrayList<>(set);
        
        System.out.println(values[0]);
        
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
            System.out.println("1DS");
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
            System.out.println("2DS");
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
            System.out.println("3DS");
        }
        
        FR = new String[rs.size()][4];
        
        for(int i = 0; i < rs.size(); i++){
            FR[i][0] = String.valueOf(rs.get(i).getId_cliente());
            FR[i][1] = rs.get(i).getNombre();
            FR[i][2] = rs.get(i).getTelefono();
            FR[i][3] = rs.get(i).getCorreo();
            System.out.println(i);
        }
        
        return FR;
    }
    
    public static Object[][] Filtrarservicios(int sl){
        
        return null;
    }
}
