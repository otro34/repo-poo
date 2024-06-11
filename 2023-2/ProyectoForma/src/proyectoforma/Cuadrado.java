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
public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }
      
    @Override
    public double area() {
        return lado*lado;
    }
    
    
    
}
