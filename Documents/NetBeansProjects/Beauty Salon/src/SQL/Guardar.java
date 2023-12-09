/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import static SQL.Conexion.Queries;
import static SQL.Conexion.getConexion;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class Guardar extends Conexion{
    public static void guardar(){
            try{
                Statement operador = getConexion().createStatement();
                
                while(Queries.peek() != null){
                    operador.executeUpdate(Queries.poll());
                }
                
                JOptionPane.showMessageDialog(null, "Todos los cambios han sido aplicados");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
       }
}
