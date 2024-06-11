/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz;
import miprimerainterfaz.interfaces.Hablador;

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
        
        Perro objPerro = new Perro("Firulais");
        
        objPerro.levatarLaParaParaOrinar();
        
        objPerro.darLaPata();
        
        Humano objHumano = new Humano("John");
        
        objHumano.trabajar();
        
        Hablador objHablador;
        
        objHablador = objHumano;
        
        objHablador.hablar();
        
        objHablador = objPerro;
        
        objHablador.hablar();
    }
    
}
