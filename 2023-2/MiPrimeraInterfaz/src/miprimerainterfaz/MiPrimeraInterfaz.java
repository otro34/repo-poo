/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz;

import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class MiPrimeraInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hablador hablador1 = new Persona();
        Hablador hablador2 = new Loro();
        
        ArrayList<Hablador> lista = new ArrayList<Hablador>();
        
        lista.add(hablador1);
        lista.add(hablador2);
        
        for(Hablador hablador: lista) {
            hablador.hablar();
           
        }
        
        
    }
    
}
