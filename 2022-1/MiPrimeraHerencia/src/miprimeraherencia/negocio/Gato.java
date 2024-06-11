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
public class Gato extends Animal {
    
    private boolean tieneCascabel;

    public Gato(String nombre, int nroPatas) {
        super(nombre, nroPatas);
        this.tieneCascabel = true;
    }
    
    public void atacar() {
        System.out.println("El gato arañó!!");
    }
    
    public void atacar(int multiplicador) {
        System.out.println("El gato arañó " + "x" + multiplicador + " !!!!" );
    }
    
    //Override - sobreescritura
    @Override
    public void hacerSonido() {
        System.out.println("MIAUUUUUUUUU!!!!");
    }

}
