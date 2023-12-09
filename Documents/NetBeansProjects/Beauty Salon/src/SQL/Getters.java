/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
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
}
