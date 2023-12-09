/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author vladi
 */
public abstract class Productos {
    private int Id_producto;
    private String nombre;
    private int precio;
    static int Id_count = 0;
    
    Productos(String nom, int prec){
        Id_count++;
        this.Id_producto = Id_count;
        this.nombre = nom;
        this.precio = prec;
    }
    
    Productos(int Id, String nom, int prec){
        Id_count = Id;
        this.Id_producto = Id_count;
        this.nombre = nom;
        this.precio = prec;
    }

    public int getId_producto() {
        return Id_producto;
    }

    public void setId_producto(int Id_producto) {
        this.Id_producto = Id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
