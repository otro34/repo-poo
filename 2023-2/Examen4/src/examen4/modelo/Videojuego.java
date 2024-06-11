/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen4.modelo;

/**
 *
 * @author otro3
 */
public class Videojuego {
    private int id;
    private String titulo;
    private String publicador;
    private String fechaLanzamiento;
    private Genero genero;

    public Videojuego(String titulo, String publicador, String fechaLanzamiento, Genero genero) {
        this.titulo = titulo;
        this.publicador = publicador;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
    }
    
    public Videojuego(int id, String titulo, String publicador, String fechaLanzamiento, Genero genero) {
        
        this.id = id;
        this.titulo = titulo;
        this.publicador = publicador;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPublicador() {
        return publicador;
    }

    public void setPublicador(String publicador) {
        this.publicador = publicador;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
    
}
