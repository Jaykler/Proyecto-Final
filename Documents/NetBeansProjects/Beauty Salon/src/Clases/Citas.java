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
    private ArrayList<Intangible> Lista_servicios = new ArrayList<>();
    static int id_count = 0;
    private int precio_total;
    private int id;
    private int id_cliente;
    private String fecha;

    public Citas(ArrayList<Intangible> set, int id_cliente, String fecha){
        this.Lista_servicios =  new ArrayList<>(set);
        this.id_cliente = id_cliente;
        id_count++;
        this.fecha = fecha;
        this.id = id_count;
    }
    public Citas(ArrayList<Intangible> set, int id_cliente, int ID, String fecha){
        this.Lista_servicios = new ArrayList<>(set);
        this.id_cliente = id_cliente;
        id_count = ID;
        this.fecha = fecha;
        this.id = id_count;
    }

    public ArrayList<Intangible> getLista_servicios() {
        return Lista_servicios;
    }

    public void setLista_servicios(ArrayList<Intangible> Lista_servicios) {
        this.Lista_servicios = Lista_servicios;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
