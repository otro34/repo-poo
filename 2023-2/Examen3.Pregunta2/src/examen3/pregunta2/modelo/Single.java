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
public class Single extends Producto {

    private boolean tienePistasAdicionales;
    
    public Single(String titulo, String artista, int anio, 
            String[] listaDeCanciones, float precio, boolean tienePistasAdicionales) {
        super(titulo, artista, anio, listaDeCanciones, precio);
        this.tienePistasAdicionales = tienePistasAdicionales;
        this.tipo = "Single";
    }
    
    @Override
    public float getDescuento() {
        if (this.anio != this.anioEnCurso) {
            return this.precio * 0.10f;
        } else 
            return this.precio * 0.05f;
    }
    
}
