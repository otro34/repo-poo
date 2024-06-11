/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja;
import modelo.Granja;
import modelo.Pollo;

/**
 *
 * @author profl3302
 */
public class UnDiaEnLaGranja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Granja objGranja = new Granja("Granja Pollitos Felices",100);
        
        Pollo objPollo = new Pollo("Luis", 12, 20);
        
        objGranja.insertar(objPollo);
        
        Pollo objPollo2 = new Pollo("Paco", 11, 20);
        
        objGranja.insertar(objPollo2);
        
        //objGranja.insertarTodos();
        
        objGranja.imprimirPollos();
        
        System.out.println("Sorteo de pollo aleatorio: ");
        
        Pollo polloAleatorio = objGranja.sortearPollo();
        
        if (polloAleatorio != null) {
            System.out.println(polloAleatorio.toString());
        } else {
            System.out.println("No se encontró pollo. ");
        }   
        
        System.out.println("Buscando pollo por nombre 1: ");
        
        Pollo polloBuscado1 = objGranja.buscar("Paco");
        
        if (polloBuscado1 != null) {
            System.out.println("Se encontró a: " + polloBuscado1.toString());
        }
        
        System.out.println("Buscando pollo por nombre 2: ");
        
        Pollo polloBuscado2 = objGranja.buscar("Alejandro");
        
        if (polloBuscado2 != null) {
            System.out.println("Se encontró a: " + polloBuscado2.toString());
        }
        
        System.out.println(objGranja.toString());
    } 
}
