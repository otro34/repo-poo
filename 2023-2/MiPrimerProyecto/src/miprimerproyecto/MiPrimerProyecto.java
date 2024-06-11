/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class MiPrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner objetoScanner = new Scanner(System.in); 
        
        System.out.println("Ingrese Nombre de Usuario: ");
        
        String nombreUsuario = objetoScanner.next();
        
        System.out.println("Bienvenido " + nombreUsuario);
        
        System.out.println("Ingrese edad de usuario: ");
        
        int edad = objetoScanner.nextInt();
       
        System.out.println("Gracias " + nombreUsuario + ", su edad ingresada"
                + " es: " + edad);
        
        int edadMasDiez = edad + 10;
        
        System.out.println("Estimado " + nombreUsuario + " su edad  en 10 "
                + "años será: " + (edad+=10) );
        
    }
    
}
