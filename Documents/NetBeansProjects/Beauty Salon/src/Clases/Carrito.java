/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author vladi
 */
public class Carrito {
    private ArrayList<Productos> lista_compra = new ArrayList<>();
    private int precio_total;
    private int Id_cliente;
    private LocalDateTime fecha;
    
    public ArrayList<Productos> getLista_compra() {
        return lista_compra;
    }

    public void setLista_compra(ArrayList<Productos> lista_compra) {
        this.lista_compra = lista_compra;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    void agregar(){
        
    }
    
    void eliminar(){
        
    }
}
