/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraherencia.negocio;

/**
 *
 * @author otro3
 */
public class Animal {
    protected String nombre;
    protected int nroPatas;
    
    public Animal(String nombre, int nroPatas) {
        this.nombre = nombre;
        this.nroPatas = nroPatas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }
    
    public void hacerSonido() {
        System.out.println("JASDJASDJUASKJFGHAJSD!!!!");
    }
}
