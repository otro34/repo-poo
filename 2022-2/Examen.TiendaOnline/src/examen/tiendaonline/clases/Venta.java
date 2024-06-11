/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.tiendaonline.clases;

/**
 *
 * @author otro3
 */
public class Venta {
    private int MAX_ITEMS = 10;
    private String nombre;
    private String apellido;
    private String direccion;
    private String fecha;
    private ItemVenta[] items;
    private int nroItems;

    public Venta(String nombre, String apellido, String direccion, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha = fecha;
        this.items = new ItemVenta[MAX_ITEMS];
        this.nroItems = 0;
    }
    
    public void agregarItem(ItemVenta item){
        if (item != null && this.nroItems < this.MAX_ITEMS) {
            this.items[this.nroItems] = item;
            this.nroItems++;
        }
    }
    
    @Override
    public String toString() {
        String concat =  "Nombres: " + this.nombre + " " + this.apellido + " ,Direccion: " + this.direccion + ""
                + " ,Fecha: " + this.fecha + "\nItems: ";
        for(ItemVenta item: items) {
            if (item != null) {
                concat = concat + "\n" + item.toString();
            }
        }
       return concat;
    }
    
    
}
