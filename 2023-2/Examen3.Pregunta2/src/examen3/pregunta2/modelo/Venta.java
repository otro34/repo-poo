/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3.pregunta2.modelo;

/**
 *
 * @author otro3
 */
public class Venta {
    private String nombreCliente;
    private String dni;
    private Producto producto;
    private boolean esSemanaDeEstreno;

    public Venta(String nombreCliente, String dni, Producto producto, 
            boolean esSemanaDeEstreno) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.producto = producto;
        this.esSemanaDeEstreno = esSemanaDeEstreno;
    }
    
    public float getTotalAPagar() {
        float totalAPagar = producto.precio - producto.getDescuento();
        return totalAPagar;
    }
    
    public Producto getProducto() {
        return producto;
    }
    
    
}
