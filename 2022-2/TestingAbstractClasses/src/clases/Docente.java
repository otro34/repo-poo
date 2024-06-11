/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author otro3
 */
public class Docente extends Persona {

    public Docente(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    @Override
    public void print() {
        System.out.println("Nombre: " +  super.nombre + ", Apellido: " + super.apellido);
    }
    
}
