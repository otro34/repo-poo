/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen4.gestion;

import examen4.modelo.Videojuego;
import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class GestionVideojuegos {
    private ArrayList<Videojuego> videojuegos;
    private int nroVideojuegos;

    public GestionVideojuegos() {
        this.nroVideojuegos = 0;
        this.videojuegos = new ArrayList<Videojuego>();
    }
    
    public ArrayList<Videojuego> getVideojuegos() {
        return this.videojuegos;
    }
    
    public void agregar(Videojuego videojuego) {
        
        this.nroVideojuegos++;
        videojuego.setId(nroVideojuegos);
        this.videojuegos.add(videojuego);
    }
    
    public void eliminar(Videojuego videojuego) {
        if (videojuego != null) {
            this.videojuegos.remove(videojuego);
        }
    }
    
    public Videojuego buscar(int id) {
        for(Videojuego videojuego: this.videojuegos) {
            if (videojuego.getId() == id) {
                return videojuego;
            }
        }
        
        return null;
    }
}
