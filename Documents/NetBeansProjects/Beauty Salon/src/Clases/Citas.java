/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class Citas {
    private ArrayList<Intangible> Lista_servicios = new ArrayList<>();
    static int id_count = 0;
    private int precio_total;
    private int id;
    private int id_cliente;
    private String fecha;
    
    public static ArrayList<Citas> citas = new ArrayList<>();

    public Citas(ArrayList<Intangible> set, int id_cliente, String fecha){
        this.Lista_servicios =  new ArrayList<>(set);
        this.id_cliente = id_cliente;
        id_count++;
        this.fecha = fecha;
        this.id = id_count;
        
        this.precio_total = 0;
        
        for(int i = 0; i < set.size(); i++){
            this.precio_total += set.get(i).getPrecio();
        }
    }
    public Citas(ArrayList<Intangible> set, int id_cliente, int ID, String fecha){
        this.Lista_servicios = new ArrayList<>(set);
        this.id_cliente = id_cliente;
        id_count = ID;
        this.fecha = fecha;
        this.id = id_count;
        
        this.precio_total = 0;
        
        for(int i = 0; i < set.size(); i++){
            this.precio_total += set.get(i).getPrecio();
        }
    }
    
    public Citas(){
        
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
    
    public void concretar(){
    
    }
    
    public void cancelar(){
    
    }
    
    public void crear(ArrayList<Intangible> set, int id_cliente, String fecha, int PrecTotal){
        citas.add(new Citas(set, id_cliente, fecha));
        
        String servicios = "";
        
        servicios += set.get(0).getNombre();
        
        for(int i = 1; i < set.size(); i++){
            servicios += ","+set.get(i).getNombre();
        }
        
        String Query = String.format("INSERT INTO Citas VALUES (%d, '%s', '%s', %d)", id_cliente, servicios, fecha, PrecTotal);
        
        SQL.Conexion.Queries.offer(Query);
        
        JOptionPane.showMessageDialog(null, "Cita agendada para " + fecha + " por valor de " + PrecTotal);
    }
    
    public void cargar() {
        String[][] Cit = SQL.Getters.getCitas();
        citas.clear();
        for (String[] Cita : Cit) {
            ArrayList<Intangible> set = new ArrayList<>();
            
            String servs = Cita[2];
            
            String[] servicios = servs.split(",");
            
            for(int i = 0; i < servicios.length; i++){
                for(int y = 0; y < Intangible.intangibles.size(); y++){
                    if(Intangible.intangibles.get(y).getNombre().equals(servicios[i])){
                        Intangible con = Intangible.intangibles.get(y);
                        set.add(new Intangible(con.getId_producto(), con.getNombre(), con.getPrecio(), con.getTipo_servicio()));
                        break;
                    }
                }
            }
            
            citas.add(new Citas(set, Integer.parseInt(Cita[1]), Integer.parseInt(Cita[0]), Cita[3]));
            id_count = Integer.parseInt(Cita[0]);
        }
    }

    public void modificar(Object[] set, ArrayList<Intangible> septus) {
        
        int id_cita = Integer.parseInt(set[0].toString());
        String Fecha = set[1].toString();
        ArrayList<Intangible> servicios = new ArrayList<>(septus);
        int PrecTotal = Integer.parseInt(set[2].toString());
        
        Citas cita = new Citas();
        
        for(int i = 0; i > citas.size(); i++){
            if(citas.get(i).getId() == id_cita){
                cita = citas.get(i);
                break;
            }
        }
        
        cita.setFecha(Fecha);
        cita.setLista_servicios(servicios);
        cita.setPrecio_total(PrecTotal);
        
        String serviciosS = "";
        
        serviciosS += septus.get(0).getNombre();
        
        for(int i = 1; i < septus.size(); i++){
            serviciosS += ","+septus.get(i).getNombre();
        }
        
        String Query = String.format("UPDATE citas SET Servicios = '%s', Fecha_Horas = '%s', Precio_Total = %d WHERE Id_Cita = %d", serviciosS, Fecha, PrecTotal, id_cita);
        
        SQL.Conexion.Queries.offer(Query);
        JOptionPane.showMessageDialog(null, "Cita modificada con exito");
    }

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
