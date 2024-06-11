/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaciodeclase;

import mi.clase.variable.SerHumano;

/**
 *
 * @author otro3
 */
public class CreacioDeClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SerHumano objetoSerHumano1 = new SerHumano();
        
        SerHumano objetoSerHumano2 = new SerHumano("Juan", "Cafe", 20);
        
        String nombreobjSH1 = objetoSerHumano1.getNombre();
        
        System.out.println("El nombre del SH1 es: " + nombreobjSH1);
        
        System.out.println("El nombre del SH2 es: " + objetoSerHumano2.getNombre());
    }
    
}
