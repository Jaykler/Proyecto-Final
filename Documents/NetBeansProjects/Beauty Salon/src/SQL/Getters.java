/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import static SQL.Conexion.getConexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author vladi
 */
public class Getters extends Conexion {
    
    public static int Validation(String usuario, String Password){
        try {
            Statement consulta = getConexion().createStatement();
            String Query = "SELECT Cargos.Nivel_De_Acceso as NACC FROM Empleados inner join Cargos on Empleados.Id_Cargo = Cargos.Id_cargo WHERE Empleados.Nombre = '" + usuario + "' and Empleados.Passwords = '" + Password + "'";
            ResultSet datos = consulta.executeQuery(Query);
            
            if(!datos.next()){
               return -1;
            }else{
               return datos.getInt("NACC");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return -1;
        }
    }
    
    public static String[][] getClientes(){
        ArrayList<String[]> ClientesAp = new ArrayList<>();
        String[][] clientes = new String[1][1];
        
        try{
            Statement consultar = getConexion().createStatement();
            
            String Query = "SELECT * FROM Cliente";
            
            ResultSet consulta = consultar.executeQuery(Query);
            
            while(consulta.next()){
                ClientesAp.add(new String[] {consulta.getString("Id_Cliente"), consulta.getString("Nombre"), consulta.getString("telefono"), consulta.getString("Correo")});
            }
            
            clientes = new String[ClientesAp.size()][4];
            
            for(int i = 0; i < clientes.length; i++){
                clientes[i] = ClientesAp.get(i);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());            
        }
 
        return clientes;
    }
    
    public static String[][] getServicios(){
        String[][] Servicios = new String[1][1];
        ArrayList<String[]> ServiciosAp = new ArrayList<>();
        
        try{
            Statement consultar = getConexion().createStatement();
            
            String Query = "SELECT * FROM Servicios";
            
            ResultSet consulta = consultar.executeQuery(Query);
            
            while(consulta.next()){
                ServiciosAp.add(new String[] {consulta.getString("Id_Servicios"), consulta.getString("Nombre"), consulta.getString("Precio"), consulta.getString("Id_Tipo_Servicio")});
            }
            
            Servicios = new String[ServiciosAp.size()][4];
            
            for(int i = 0; i < Servicios.length; i++){
                Servicios[i] = ServiciosAp.get(i);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return Servicios;
    }
    
    public static String[][] getCitas(){
        String[][] Citas = new String[1][1];
        ArrayList<String[]> CitasAp = new ArrayList<>();
        
        try{
            Statement consultar = getConexion().createStatement();
            
            String Query = "SELECT * FROM citas";
            
            ResultSet consulta = consultar.executeQuery(Query);
            
            while(consulta.next()){
                CitasAp.add(new String[] {consulta.getString("Id_Cita"), consulta.getString("Id_Cliente"), consulta.getString("Servicios"), consulta.getString("Fecha_Horas"), consulta.getString("Precio_Total")});
            }
            
            Citas = new String[CitasAp.size()][5];
            
            for(int i = 0; i < Citas.length; i++){
                Citas[i] = CitasAp.get(i);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return Citas;
    }
    
    public static String[][] getProductos(){
        String[][] productos = new String[1][1];
        ArrayList<String[]> productosAp = new ArrayList<>();
        
        try{
            Statement consultar = getConexion().createStatement();
            
            String Query = "SELECT * FROM Productos";
            
            ResultSet consulta = consultar.executeQuery(Query);
            
            while(consulta.next()){
                productosAp.add(new String[] {consulta.getString("Id_producto"), consulta.getString("Nombre"), consulta.getString("Precio"), consulta.getString("Cantidad")});
            }
            
            productos = new String[productosAp.size()][4];
            
            for(int i = 0; i < productos.length; i++){
                productos[i] = productosAp.get(i);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return productos;
    }
}
