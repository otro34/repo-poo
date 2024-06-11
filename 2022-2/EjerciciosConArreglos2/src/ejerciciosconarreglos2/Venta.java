/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos2;

/**
 *
 * @author otro3
 */
public class Venta {
    private String articulo;
    private int cantidad;
    private float precio;
    private String fecha;
    
    public Venta (String articulo, int cantidad, float precio, String fecha) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    public String ToString(){
        return "---------"
                + "Venta"
                + "--------" +
                "\nArticulo: " + this.articulo +
                "\nCantidad: " + this.cantidad +
                "\nPrecio: " + this.precio +
                "\nFecha: " + this.fecha;
    }
}
