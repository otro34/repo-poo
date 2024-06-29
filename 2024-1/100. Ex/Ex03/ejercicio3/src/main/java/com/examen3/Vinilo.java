package com.examen3;

public class Vinilo extends Producto {

    protected VelocidadVinilo velocidad;

    public Vinilo(String nombreArtista, String nombreAlbum, String fechaLanzamiento, double precio,
            int stock, VelocidadVinilo velocidad) {
        super(nombreArtista, nombreAlbum, fechaLanzamiento, precio, stock);
        this.velocidad = velocidad;
    }

    protected String generarCodigo() {
        return "VIN-" + super.generarCodigo();
    }

    public String toString() {
        return super.toString() + "\nTipo: " + "Vinilo";
    }
     
    
}
