/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoforma;

/**
 *
 * @author otro3
 */
public class Circulo extends Forma {

    private double r;
    
    public Circulo(String nombre, double r) {
        super(nombre);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
    
}
