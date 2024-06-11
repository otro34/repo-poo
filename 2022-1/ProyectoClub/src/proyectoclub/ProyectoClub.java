/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclub;

import proyectoclub.negocio.Club;
import proyectoclub.negocio.Persona;
import proyectoclub.negocio.Socio;
import proyectoclub.negocio.NoSocio;

/**
 *
 * @author ProfL3401
 */
public class ProyectoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Club objClub = new Club("La Arboleda");
        
        Persona personas[] = new Persona[50];
        
        personas[0] = new Socio("Juan Perez", "14235687", "213546");
        
        personas[0].consumirServicio("Hospedaje", 100f);
        personas[0].consumirServicio("Discoteca", 100f);
        personas[0].consumirServicio("Restaurante", 100f);
        
        personas[1] = new NoSocio("Jhon Doe", "14235687");
        
        personas[1].consumirServicio("Hospedaje", 100f);
        personas[1].consumirServicio("Discoteca", 100f);
        personas[1].consumirServicio("Restaurante", 100f);

        objClub.setPersonas(personas);
        
        objClub.imprimirTotalMontoFacturados();
        objClub.imprimirPersonas();
    }
    

    
}
