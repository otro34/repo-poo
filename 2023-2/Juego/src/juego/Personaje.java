/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author otro3
 */
public class Personaje {
    private String nombre;
    private float ataque;
    private float defensa;
    private float vida;

    public Personaje(String nombre, String tipo) {
        this.nombre = nombre;
        
        switch (tipo) {
            case "Ninja":
                this.ataque = 140;
                this.defensa = 45;
                this.vida = 650;
                break;
            case "Guerrero":
                this.ataque = 90;
                this.defensa = 60;
                this.vida = 850;
                break;
            case "Monstruo":
                this.ataque = 100;
                this.defensa = 60;
                this.vida = 850;
                break;
        }
    }
    
    public void atacar(Personaje personaje) {
        personaje.vida =  personaje.vida - (this.ataque - personaje.defensa);
    }
    
        public void atacar(Personaje personaje, Personaje personajeAdicional) {
        personaje.vida =  personaje.vida - (this.ataque - personaje.defensa) + (personajeAdicional.ataque / 2);
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(float defensa) {
        this.defensa = defensa;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }
    
    
    
}
