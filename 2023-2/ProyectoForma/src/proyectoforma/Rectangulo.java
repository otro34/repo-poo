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
public class Rectangulo extends Forma{
    private double ancho;
    private double largo;

    public Rectangulo(String nombre, double ancho, double largo) {
        super(nombre);
        this.ancho = ancho;
        this.largo = largo;
    }
    
    @Override
    public double area() {
        return ancho*largo;
    }
    

    
}
