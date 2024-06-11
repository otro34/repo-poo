/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja;
import undiaenlagranja.negocio.Pollo;
import undiaenlagranja.negocio.Granja;
import java.util.Scanner;

/**
 *
 * @author ProfL3401
 */
public class UnDiaEnLaGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declarar el scanner
        Scanner objScanner = new Scanner(System.in);
        
        Granja objGranja = new Granja("De mi abuelito", 1000.0f);
        
        //objGranja.ingresarTodosLosPollos();
        
        //Creando pollos
        System.out.println("Creando pollitos...");
        Pollo pollo = new Pollo("Hugo", 10, 100);
        Pollo pollo2 = new Pollo("Paco", 11, 100);
        Pollo pollo3 = new Pollo("Luis", 12, 100);
        
        System.out.println("Ingresando pollitos a la granja...");
        objGranja.ingresarUnPollo(pollo);
        objGranja.ingresarUnPollo(pollo2);
        objGranja.ingresarUnPollo(pollo3);
        
        System.out.println("Ingrese nombre de pollo a buscar: ");
        String nombrePollo = objScanner.next();
        
        System.out.println("Bucando pollito... ");
        
        Pollo objPolloBusqueda = objGranja.buscar(nombrePollo);
        
        if (objPolloBusqueda != null) {
           System.out.println("Se encontró al pollo " + objPolloBusqueda.getNombre() + " de peso " + objPolloBusqueda.getPeso()); 
        } else {
            System.out.println("No se encontró al pollo"); 
        }
        
        System.out.println("---Datos de la granja ---");
        String strDatosGranja = objGranja.concatenarDatos();
        
        System.out.println(strDatosGranja);
        
        
        
        
        
        
    }
    
}
