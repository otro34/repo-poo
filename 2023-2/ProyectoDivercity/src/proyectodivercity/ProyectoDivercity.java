/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodivercity;

import proyectodivercity.gestion.Divercity;
import proyectodivercity.modelo.Ciudadano;

/**
 *
 * @author otro3
 */
public class ProyectoDivercity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ciudadano ciudadano1 = new Ciudadano(1,17,"Perez");
        Ciudadano ciudadano2 = new Ciudadano(2,20,"Gomez");
        Ciudadano ciudadano3 = new Ciudadano(3,30,"Sanchez");
        Ciudadano ciudadano4 = new Ciudadano(3,45,"Lopez");
        
        Divercity gestion = new Divercity("Perú");
        
        gestion.ingresarCiudadano(ciudadano1);
        gestion.ingresarCiudadano(ciudadano2);
        gestion.ingresarCiudadano(ciudadano3);
        gestion.ingresarCiudadano(ciudadano4);
        
        gestion.listarCiudadanos();
    }
    
}
