/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadevideojuegos.negocio;

/**
 *
 * @author otro3
 */
public class Tienda {
    
    private String nombre;
    private String direccion;
    private Videojuego[] listaDeJuegos;

    public Tienda(String nombre, String direccion, Videojuego[] listaDeJuegos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaDeJuegos = listaDeJuegos;
    }
    
    public Videojuego buscarJuego(String nombre) {
        for(Videojuego juego:listaDeJuegos) {
            if (juego != null) {
                if (juego.getTitulo().equals(nombre)) return juego;
            }
        }
        
        return null;
    }
    
    public Videojuego buscarJuegoMasCaro() {
        Videojuego juegoMasCaro = null;
        
        for(Videojuego juego:listaDeJuegos) {
            if (juegoMasCaro == null) {
                juegoMasCaro = juego;
            } else if (juego.getPrecio() > juegoMasCaro.getPrecio()) {
                juegoMasCaro = juego;
            }
        }
        return juegoMasCaro;
    }
    
    public int titulosPorPlataforma(String plataforma) {
        int contador = 0;
        
        for(Videojuego juego:listaDeJuegos) {
            if (juego.getPlataforma().equals(plataforma)) {
                contador++;
            }
        }
        
        return contador;
    }
    
    public String concatenarDatos() {
        return "Nombre: " + this.nombre + "\n" +
                "Direccion: " + this.direccion + "\n" +
                "Titulos Disponibles: " + this.listaDeJuegos.length + "\n";
    }
    
}
