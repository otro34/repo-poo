/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja.clases;

/**
 *
 * @author profo1601
 */
public class Pollo {
    private String nombre;
    private float peso;
    private int tiempoEnDias;

    public Pollo(String nombre, float peso, int tiempoEnDias) {
        this.nombre = nombre;
        this.peso = peso;
        this.tiempoEnDias = tiempoEnDias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTiempoEnDias(int tiempoEnDias) {
        this.tiempoEnDias = tiempoEnDias;
    }
    
    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public int getTiempoEnDias() {
        return tiempoEnDias;
    }
    
    public void print() {
        System.out.println("Pollo - "
                + "Nombre: " + this.nombre
                + ", Peso: " + this.peso
                + ", Tiempo en Dias " + this.tiempoEnDias);
    }
    
    public String getDatos(){
        return "Pollo - "
                + "Nombre: " + this.nombre
                + ", Peso: " + this.peso
                + ", Tiempo en Dias " + this.tiempoEnDias;
    }
    

    
    
    
    
}
