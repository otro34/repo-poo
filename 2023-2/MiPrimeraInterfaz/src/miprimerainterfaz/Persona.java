/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz;

/**
 *
 * @author otro3
 */
public class Persona implements Hablador {

    @Override
    public void hablar() {
        System.out.println("Soy una persona hablando!");
    }
    
    public void hablarEspañol() {
        System.out.println("HOLA");
    }
    
}
