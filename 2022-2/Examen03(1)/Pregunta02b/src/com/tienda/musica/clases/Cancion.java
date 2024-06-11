/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.musica.clases;

/**
 *
 * @author jromaina
 */
public class Cancion {
    public String autor;
    public String titulo;
    public int anio;
    public int nroVentas;

    public Cancion(String autor, String titulo, int anio, int nroVentas) {
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
        this.nroVentas = nroVentas;
    }
}
