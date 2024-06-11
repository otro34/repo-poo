/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.musica.gestion;

import com.tienda.musica.clases.Cancion;

/**
 *
 * @author jromaina
 */
public class Tienda {
    private String nombre;
    private String web;
    private Cancion[] canciones;

    public Tienda(String nombre, String web, Cancion[] canciones) {
        this.nombre = nombre;
        this.web = web;
        this.canciones = canciones;
    }
    
    
}
