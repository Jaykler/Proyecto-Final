/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class Usuarios implements IgestionRUD {
    private int Id_usuario;
    private String nombre;
    private String telefono;
    private String correo;
    private int Sueldo;
    private String Rol;
    
    public static ArrayList<Usuarios> Lista_usuarios = new ArrayList<>();
    static int Id_count = 0;
    
    public Usuarios(int Id, String nom, String tel, String correo, int sueldo, String rol){
        Id_count = Id;
        this.Id_usuario = Id_count;
        this.nombre = nom;
        this.telefono = tel;
        this.correo = correo;
        this.Sueldo = sueldo;
        this.Rol = rol;
    }
    
    public Usuarios(String nom, String tel, String correo, int sueldo, String rol){
        Id_count++;
        this.Id_usuario = Id_count;
        this.nombre = nom;
        this.telefono = tel;
        this.correo = correo;
        this.Sueldo = sueldo;
        this.Rol = rol;
    }
    
    public Usuarios(){
        
    }
    
    public void agregar(String[] set){
        boolean[] gold = new boolean[3];
        
        for(int i = 0; i < Lista_usuarios.size(); i++){
            gold[0] = false;
            gold[1] = false;
            gold[2] = false;
            if(Lista_usuarios.get(i).getNombre().equals(set[0])) gold[0] = true;
            
            if(Lista_usuarios.get(i).getTelefono().equals(set[1])) gold[1] = true;
            
            if(Lista_usuarios.get(i).getCorreo().equals(set[2])) gold[2] = true;
            
            if(gold[0] == true && gold[1] == true && gold[2] == true) break;
        }
        
        
        if(gold[0] == false || gold[1] == false || gold[2] == false){
            Lista_usuarios.add(new Usuarios(set[0], set[1], set[2], Integer.parseInt(set[3]), set[4]));
        
            SQL.Conexion.Queries.offer(String.format("INSERT INTO Empleados VALUES('%s', '%s', '%s', '%s', %d)", set[0], set[1], set[2], set[5], Integer.parseInt(set[6])));
        
            JOptionPane.showMessageDialog(null, String.format("Usuario %s, con numero de telefono %s y correo %s agregado con exito", set[0], set[1], set[2]));
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ya existente");
        }
    }

    @Override
    public void cargar() {
        String[][] user = SQL.Getters.getUsuarios();
        Lista_usuarios.clear();
        for (String[] users : user) {
            Lista_usuarios.add(new Usuarios(Integer.parseInt(users[0]), users[1], users[2], users[3], Integer.parseInt(users[5]), users[4]));
            Id_count = Integer.parseInt(users[0]);
        }
    }

    @Override
    public void modificar(Object[] set) {
        int id = Integer.parseInt(set[0].toString());
        String nom = set[1].toString();
        String tel = set[2].toString();
        String correo = set[3].toString();
        String rol = set[4].toString();
        String sueldo = set[5].toString();
        String id_rol = set[6].toString();
        
        for(int i = 0; i < Lista_usuarios.size(); i++){
            if(Lista_usuarios.get(i).getId_usuario() == id){
                Usuarios com = Lista_usuarios.get(i);
                com.setNombre(nom);
                com.setTelefono(tel);
                com.setCorreo(correo);
                com.setSueldo(Integer.parseInt(sueldo));
                break;
            }
        }
        
        SQL.Conexion.Queries.offer(String.format("UPDATE cliente SET Nombre = '%s', telefono = '%s', Correo = '%s' WHERE Id_Cliente = %d", nom, tel, correo, id));
        JOptionPane.showMessageDialog(null, "Usuario " + id + " Modificado");
    }

    @Override
    public void eliminar(String[] set) {
        int id = Integer.parseInt(set[0]);
        
        String Query = "DELETE FROM Empleados WHERE Id_Empleado = " + id;
        
        for(int i = 0; i < Lista_usuarios.size(); i++){
            if(Lista_usuarios.get(i).getId_usuario() == id){
                Lista_usuarios.remove(i);
            }
        }
        
        SQL.Conexion.Queries.offer(Query);
        JOptionPane.showMessageDialog(null, "Usuario eliminado con exito");
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
