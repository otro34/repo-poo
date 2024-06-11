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
public class Producto {
    protected final int anioEnCurso = 2023;
    protected String titulo;
    protected String artista;
    protected int anio;
    protected String[] listaDeCanciones;
    protected float precio;
    protected String tipo;
    protected int nroVentas;

    public Producto(String titulo, String artista, int anio, String[] listaDeCanciones, float precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.anio = anio;
        this.listaDeCanciones = listaDeCanciones;
        this.precio = precio;
        this.tipo = "";
        this.nroVentas = 0;
    }
    
    public String toString() {
        return titulo + " - " + artista + " - " + anio + " - " + "S/ " + precio + " - " + "Ventas: " + nroVentas; 
    }
    
    public float getDescuento() {
        return 0;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void registrarVenta() {
        this.nroVentas++;
    }
    public int getVentas() {
        return nroVentas;
    }
   
}
