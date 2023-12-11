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
    String nombre;
    String telefono;
    String correo;
    private int Sueldo;
    private String Rol;
    
    static ArrayList<Usuarios> Lista_usuarios = new ArrayList<>();
    static int Id_count = 0;
    
    public Usuarios(int Id, String nom, String tel, String correo, int sueldo){
        Id_count = Id;
        this.Id_usuario = Id_count;
        this.nombre = nom;
        this.telefono = tel;
        this.correo = correo;
        this.Sueldo = sueldo;
    }
    
    public Usuarios(String nom, String tel, String correo, int sueldo){
        Id_count++;
        this.Id_usuario = Id_count;
        this.nombre = nom;
        this.telefono = tel;
        this.correo = correo;
        this.Sueldo = sueldo;
    }
    
    public void agregar(){
    
    }

    @Override
    public void cargar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
}
