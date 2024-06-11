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
public class Album extends Producto {

    private boolean tieneCards;
    
    public Album(String titulo, String artista, int anio, 
            String[] listaDeCanciones, float precio, boolean tieneCards) {
        super(titulo, artista, anio, listaDeCanciones, precio);
        
        this.tieneCards = tieneCards;
        this.tipo = "Album";
    }
    
    @Override
    public float getDescuento() {
        if (!tieneCards) {
            return this.precio * 0.10f;
        } else
            return 0;
    }
    
}
