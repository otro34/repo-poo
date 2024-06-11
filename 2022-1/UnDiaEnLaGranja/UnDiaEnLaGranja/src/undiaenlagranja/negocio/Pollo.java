/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja.negocio;

/**
 *
 * @author ProfL3401
 */
public class Pollo {
    private String nombre;
    private float peso;
    private int tiempoDias;
    
    //Constructor
    
    public Pollo(String paramNombre, float paramPeso, int paramTiempo) {
        nombre = paramNombre;
        peso = paramPeso;
        tiempoDias = paramTiempo;
    }
    
    //Getters y Setters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String paramNombre) {
        nombre = paramNombre;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float paramPeso) {
        peso = paramPeso;
    }
    
    public int getTiempoDias() {
        return tiempoDias;
    }
    
    public void setTiempoDias(int paramTiempoDias) {
        tiempoDias = paramTiempoDias;
    }
}
