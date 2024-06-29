package com.examen3;

public class Producto {
    protected String codigo;
    protected String nombreArtista;
    protected String nombreAlbum;
    protected String fechaLanzamiento;
    protected double precio;
    protected int stock;

    public Producto(String nombreArtista, String nombreAlbum, String fechaLanzamiento, double precio,
            int stock) {
        this.codigo = generarCodigo();
        this.nombreArtista = nombreArtista;
        this.nombreAlbum = nombreAlbum;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
        this.stock = stock;
    }

    protected String generarCodigo() {
        int ran = (int) (Math.random() * 4999 - 4000) + 4000;
        
        return "" + ran;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        return "\nCodigo:" + codigo + 
            "\nNombre de Artista: " + nombreArtista + 
            "\nNombre de Album: " + nombreAlbum + 
            "\nFecha de Lanzamiento: " + fechaLanzamiento + 
            "\nPrecio: " + precio + 
            "\nStock: " + stock;
    }

    
}
