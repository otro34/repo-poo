/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz.clases;

/**
 *
 * @author otro3
 */
public class Loro implements Hablador, Volador {

    @Override
    public void hablar() {
        System.out.println("HOLA! SOY UN LOROOOO");
    }

    @Override
    public void volar() {
        System.out.println("ESTOY VOLANDO!");
    }
    
}
