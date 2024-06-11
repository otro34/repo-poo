/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3.pregunta2.gestion;

import examen3.pregunta2.modelo.Album;
import examen3.pregunta2.modelo.Producto;
import examen3.pregunta2.modelo.Venta;

/**
 *
 * @author otro3
 */
public class TiendaDeMusica {
    private final int MAX_VENTAS = 10;
    private final int MAX_PRODUCTOS = 30;
    private String nombre;
    private Producto[] productos;
    private int nroProductos;
    private Venta[] ventas;
    private int nroVentas;

    public TiendaDeMusica(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.nroProductos = 0;
        this.ventas = new Venta[MAX_VENTAS];
        this.nroVentas = 0;
    }
    
    public void agregarProducto(Producto producto){
        if (nroProductos < MAX_PRODUCTOS) {
            this.productos[nroProductos] = producto;
            this.nroProductos++;
            System.out.println("Agregado Producto " + nroProductos + ": " + producto.toString());
        }
    }
    
    public void agregarVenta(Venta venta){
        if (nroVentas < MAX_VENTAS) {
            this.ventas[nroVentas] = venta;
            this.nroVentas++;
            
            Producto productoComprado = venta.getProducto();
            
            for(int i = 0; i < nroProductos ; i++) {
                if (this.productos[i].getTitulo().equals(productoComprado.getTitulo())) {
                    productoComprado.registrarVenta();
                    this.productos[i] = productoComprado;
                }
            }
            
            System.out.println("Venta Registrada!: " + productoComprado.toString());
        }
    }
    
    public float getTotalVentas() {
        
        float suma = 0;
        for(int i = 0; i<nroVentas; i++) {
            suma += this.ventas[i].getTotalAPagar();
        }
        return suma;
    }
    
    public Producto getSingleMasCaro() {
        
        float max = 0;
        Producto productoMasCaro = null;
        
        for(Producto producto: productos) {
            if (producto != null && producto.getTipo().equals("Single")) {
                if (producto.getPrecio() > max) {
                    productoMasCaro = producto;
                    max = producto.getPrecio();
                }
            }
        }
        return productoMasCaro;
    }
    
    public Producto getAlbumConMasVentas() {
        int maxVentas = 0;
        Producto albumConMasVentas = null;
        
        for(Producto producto: productos) {
            if (producto != null &&
                    producto.getTipo().equals("Album")) {
                if (producto.getVentas() > maxVentas) {
                    maxVentas = producto.getVentas();
                    albumConMasVentas = producto;
                }
            }
        }
        
        return albumConMasVentas;

    }
    
    
}
