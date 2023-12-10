/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class Clientes implements IgestionRUD{

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    private int id_cliente;
    private String nombre;
    private String Telefono;
    private String Correo;
    
    static int Id_count = 0;
    
    public static ArrayList<Clientes> clientes = new ArrayList<>();
    
    public Clientes(int Id_cliente, String nom, String tel, String mail){
        Id_count = Id_cliente;
        this.id_cliente = Id_count;
        this.nombre = nom;
        this.Telefono = tel;
        this.Correo = mail;
    }
    
    public Clientes(String nom, String tel, String mail){
        Id_count++;
        this.id_cliente = Id_count;
        this.nombre = nom;
        this.Telefono = tel;
        this.Correo = mail;
    }
    
    public Clientes(){
        
    }
    
    public void agregar(String[] set){
        clientes.add(new Clientes(set[0], set[1], set[2]));
        
        SQL.Conexion.Queries.offer(String.format("INSERT INTO Cliente VALUES('%s', '%s', '%s')", set[0], set[1], set[2]));
        
        JOptionPane.showMessageDialog(null, String.format("Cliente %s, con numero de telefono %s y correo %s agregado con exito", set[0], set[1], set[2]));
    }
    
    @Override
    public void cargar() {
        String[][] clients = SQL.Getters.getClientes();
        clientes.clear();
        for (String[] Cliente : clients) {
            clientes.add(new Clientes(Integer.parseInt(Cliente[0]), Cliente[1], Cliente[2], Cliente[3]));
            Id_count = Integer.parseInt(Cliente[0]);
        }
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
