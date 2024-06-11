/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynewapp2;

/**
 *
 * @author otro3
 */
public class MyNewApp2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java.util.Scanner scanner = new java.util.Scanner(System.in);
        
       // Dado el número de mes indicar su cantidad de días
    java.util.Scanner entrada = new java.util.Scanner(System.in);
    
    System.out.println("Ingresa tu nombre: ");
    
    String nombre = entrada.nextLine();
    
    System.out.println("Bienvenido " + nombre + ". Ahora ingresa tu edad: ");
    
    int edad = entrada.nextInt();
    
    System.out.println("Gracias " + nombre + " su edad ingresada es " + edad);
    
    int edadfutura = edad + 10;
    
    System.out.println("Estimado " + nombre + " su edad dentro de 10 años será " + edadfutura);     
    }
    
}




