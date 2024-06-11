/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovivalibre.modelo;

/**
 *
 * @author otro3
 */
public class Inmueble {
    protected float area;
    
    public Inmueble(float area) {
        this.area = area;
    }
   
    public String toString() {
        return "Area: " + this.area + "m2";
    }
    
    public float getTotal() {
        return 0;
    }
}
