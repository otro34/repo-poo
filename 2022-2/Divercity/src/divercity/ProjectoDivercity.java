/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divercity;
import divercity.gestion.Divercity;
import divercity.clases.Ciudadano;

/**
 *
 * @author otro3
 */
public class ProjectoDivercity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Divercity objDivercity = new Divercity("Peru");

        //crear 3 cuidadanos
        
        System.out.println("CREANDO 3 NUEVOS CIUDADANOS: ");
        Ciudadano objCiudadano0 = new Ciudadano(1,15,"LOPEZ SANCHEZ");
        Ciudadano objCiudadano1 = new Ciudadano(2,15,"FLORES PEREZ");
        Ciudadano objCiudadano2 = new Ciudadano(3,16,"ARENAS SALAS");
        
        objDivercity.ingresarCiudadano(objCiudadano0);
        objDivercity.ingresarCiudadano(objCiudadano1);
        objDivercity.ingresarCiudadano(objCiudadano2);
        
        System.out.println("CIUDADANOS CREADOS: ");
        objDivercity.printTodosLosCiudadanos();
        
        System.out.println("CREANDO CIUDADANO REPETIDO");
        Ciudadano objCiudadano4 = new Ciudadano(3,16,"ARENAS SALAS");
        
        objDivercity.ingresarCiudadano(objCiudadano4);
        
        System.out.println("BUSCAR CIUDADANO POR TECLADO");
        
        Ciudadano ciudadanoBuscado = objDivercity.buscarPorTeclado();
        
        if (ciudadanoBuscado != null) {
            System.out.println("CIUDADANO ENCONTRADO: " + ciudadanoBuscado.getDetalleC());
        } else {
            System.out.println("CIUDADANO NO ENCONTRADO. ");
        }
        
    }
    
}
