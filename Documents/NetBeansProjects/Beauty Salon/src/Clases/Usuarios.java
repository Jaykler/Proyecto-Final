/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

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
    
    public void agregar(){
    
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(String[] set) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
