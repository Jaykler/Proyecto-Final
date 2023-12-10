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
}
