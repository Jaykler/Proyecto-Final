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
public class Citas implements IgestionRUD{
    private ArrayList<Productos> Lista_productos = new ArrayList<>();
    static int id_count = 0;
    private int precio_total;
    private int id;
    private int id_cliente;

    public Citas(ArrayList<Productos> set, int id_cliente){
        this.Lista_productos =  new ArrayList<>(set);
        this.id_cliente = id_cliente;
        id_count++;
        this.id = id_count;
    }
    public Citas(ArrayList<Productos> set, int id_cliente, int ID){
        this.Lista_productos = new ArrayList<>(set);
        this.id_cliente = id_cliente;
        id_count = ID;
        this.id = id_count;
    }

    public ArrayList<Productos> getLista_productos() {
        return Lista_productos;
    }

    public void setLista_productos(ArrayList<Productos> Lista_productos) {
        this.Lista_productos = Lista_productos;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
     void concretar(){
    
    }
    
    void cancelar(){
    
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
