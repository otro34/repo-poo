/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja;
import undiaenlagranja.clases.Pollo;
import undiaenlagranja.gestion.Granja;
import java.util.Scanner;

/**
 *
 * @author profo1601
 */
public class UnDiaEnLaGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("CREANDO NUEVA GRANJA:");
        System.out.println("----------------------");
        Granja objGranja = new Granja("Mi villa",1000.0f);
        objGranja.insertarTodos();
        System.out.println("Proceso finalizado! La granja tiene: " + objGranja.getNroDePollos() + " pollos.");
        System.out.println("");
        System.out.println("POLLO ALEATORIO: ");
        Pollo polloAleatorio = objGranja.getAleatorio();
        polloAleatorio.print();
        System.out.println("BUSCAR POLLO POR NOMBRE: ");
        String nombre = objScanner.next();
        Pollo polloBuscado = objGranja.buscarPollo(nombre);
        if (polloBuscado != null) {
            polloBuscado.print();
        } else {
            System.out.println("NO SE ENCONTRO POLLO");
        }
        
        System.out.println(objGranja.getDatos());
       
        
        
    }
    
}
