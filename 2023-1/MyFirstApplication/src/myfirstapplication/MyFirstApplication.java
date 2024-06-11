/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication;

import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class MyFirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese nombre de Usuario: ");
        
        String nombreUsuario = entrada.next();
        
        System.out.println("Bienvenido " + nombreUsuario);
        
        System.out.println("Ahora, ingrese su edad: ");
        
        int edad = entrada.nextInt();
        
        System.out.println("Gracias " + nombreUsuario + ", su edad ingresada es " + edad);
        
        int nuevaEdad = 10 + edad;
        
        System.out.println("Estimado " + nombreUsuario + " su edad en 10 años será " + nuevaEdad);
               
    }
    
}
