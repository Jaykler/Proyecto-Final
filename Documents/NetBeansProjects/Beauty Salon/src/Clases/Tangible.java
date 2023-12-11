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
public class Tangible extends Productos implements IgestionRUD{
    
    public static ArrayList<Tangible> tangibles = new ArrayList<>();
    private int cantidad;
    
    public Tangible(String nom, int prec, int cant) {
        super(nom, prec);
        this.cantidad = cant;
    }
    
    public Tangible(int Id, String nom, int prec, int cant){
        super(Id, nom, prec);
        this.cantidad = cant;
    }
    
    public Tangible(){
        super("", 1);
    }

    @Override
    public void cargar() {
        String[][] produc = SQL.Getters.getProductos();
        tangibles.clear();
        for (String[] producto : produc) {
            tangibles.add(new Tangible(Integer.parseInt(producto[0]), producto[1], Integer.parseInt(producto[2]), Integer.parseInt(producto[3])));
            Id_count = Integer.parseInt(producto[0]);
        }
    }

    @Override
    public void modificar(Object[] set) {
        if(set.length == 2){
            for(int i = 0; i < tangibles.size(); i++){
                if(tangibles.get(i).getId_producto() == Integer.parseInt(set[0].toString())){
                    int resta = tangibles.get(i).getCantidad() - Integer.parseInt(set[1].toString());
                    tangibles.get(i).setCantidad(resta);
                    
                    String Query = String.format("UPDATE Productos SET Cantidad = %d WHERE Id_producto = %d", resta,Integer.parseInt(set[0].toString()));
                    
                    SQL.Conexion.Queries.offer(Query);
                }
            }
        }
    }

    @Override
    public void eliminar(String[] set) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
