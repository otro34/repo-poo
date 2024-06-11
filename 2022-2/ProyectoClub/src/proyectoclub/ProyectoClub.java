/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclub;
import proyectoclub.clases.NoSocio;
import proyectoclub.clases.Socio;
import proyectoclub.gestion.GestionClub;

/**
 *
 * @author otro3
 */
public class ProyectoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionClub objClub = new GestionClub("Club de Verano"); 
        
        Socio objSocio1 = new Socio(1,"Juan Sanchez","01234567","VISA", 500, 3);
        Socio objSocio2 = new Socio(2,"Felipe Scolari","01234568","Diners", 600, 11);
        NoSocio objNoSocio1 = new NoSocio("Luis Gonzales","01277567","VISA", 1200, 1);
        NoSocio objNoSocio2 = new NoSocio("Raul Jimenez","01239068","Efectivo", 1500, 7);
        
        objClub.ingresar(objSocio1);
        objClub.ingresar(objSocio2);
        objClub.ingresar(objNoSocio1);
        objClub.ingresar(objNoSocio2);
        
        objClub.imprimirMontoFinal();
        objClub.imprimirPersonas();
    }
    
}
