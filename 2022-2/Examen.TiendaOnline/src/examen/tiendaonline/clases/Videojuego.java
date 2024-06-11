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
public class Videojuego extends Producto {
    
    private String titulo;
    private String publicador;
    private String anio;
    private String plataforma;


    public Videojuego(String titulo, String publicador, String anio, String plataforma,float precio, int stock, String pais) {
        super(precio, stock, pais);
        this.titulo = titulo;
        this.publicador = publicador;
        this.anio = anio;
        this.plataforma = plataforma;
    }
    
}
