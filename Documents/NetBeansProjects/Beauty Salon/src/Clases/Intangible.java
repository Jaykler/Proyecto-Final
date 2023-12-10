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
public class Intangible extends Productos implements IgestionRUD{
    
    public static ArrayList<Intangible> intangibles = new ArrayList<>();
    private int tipo_servicio;

    public Intangible(int Id, String nom, int prec, int ts) {
        super(Id, nom, prec);
        this.tipo_servicio = ts;
    }
    
    public Intangible(String nom, int prec, int ts) {
        super(nom, prec);
        this.tipo_servicio = ts;
    }
    
    public Intangible(){
        super(1, "", 1);
    }

    @Override
    public void cargar() {
        String[][] Servi = SQL.Getters.getServicios();
        intangibles.clear();
        for (String[] Servicio : Servi) {
            intangibles.add(new Intangible(Integer.parseInt(Servicio[0]), Servicio[1], Integer.parseInt(Servicio[2]), Integer.parseInt(Servicio[3])));
            Id_count = Integer.parseInt(Servicio[0]);
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

    public int getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(int tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
}
