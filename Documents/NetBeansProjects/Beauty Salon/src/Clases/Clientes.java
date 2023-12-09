/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author vladi
 */
public class Clientes implements IgestionRUD{
    
    int id_cliente;
    String nombre;
    String Telefono;
    String Correo;
    
    static int Id_count = 0;
    
    public Clientes(int Id_cliente, String nom, String tel, String mail){
        Id_count = Id_cliente;
        this.id_cliente = Id_count;
        this.nombre = nom;
        this.Telefono = tel;
        this.Correo = mail;
    }
    
    public void agregar(){
    
    }
    
    @Override
    public void cargar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(String[] set) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(String[] set) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
