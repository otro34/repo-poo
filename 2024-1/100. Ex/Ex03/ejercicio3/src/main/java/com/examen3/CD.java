package com.examen3;

public class CD extends Producto{

    private boolean tieneVideosParaPc;

    public CD(String nombreArtista, String nombreAlbum, String fechaLanzamiento, double precio,
            int stock, boolean tieneVideosParaPc) {
        super(nombreArtista, nombreAlbum, fechaLanzamiento, precio, stock);
        
        this.tieneVideosParaPc = tieneVideosParaPc;

    }

    protected String generarCodigo() {
        return "CD-" + super.generarCodigo();
    }

    public String toString() {
        return super.toString() + "\nTipo: " + "CD";
    }
    
}
