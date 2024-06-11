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
public class Libro extends Producto {

    private String titulo;
    private String autor;
    private String anio;
    
    public Libro(String titulo, String autor, String anio,
                float precio, int stock, String pais) {
        super(precio, stock, pais);
        
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
     
}
