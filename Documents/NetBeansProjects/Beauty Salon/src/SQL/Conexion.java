/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class Conexion {
    
    public static LinkedList<String> Queries = new LinkedList<>();
    public static int acceso = 0;
    
    public static Connection getConexion(){
        String URL = "jdbc:sqlserver://localhost:1433;database=BeutyS;integratedSecurity=true;Encrypt=false";
        
        try{
            Connection con = DriverManager.getConnection(URL);
            return con;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
}
