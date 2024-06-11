/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz;
import miprimerainterfaz.clases.*;
        
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
        
        AsistenteVirtual objasistente = new AsistenteVirtual();
        Loro objLoro = new Loro();
        Persona objPersona = new Persona();
        
        Hablador[] habladores = new Hablador[3];
        
        habladores[0] = objasistente;
        habladores[1] = objLoro;
        habladores[2] = objPersona;
        
        for (Hablador hablador : habladores) {
            hablador.hablar();
        }
    }
    
}
