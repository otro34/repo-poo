/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ESTO ES UN COMENTARIO

package miprimeraaplicacion;
import java.util.Scanner;

public class MiPrimeraAplicacion {

    /**
     * Programa que reciba 2 números por teclado, realice 4 operaciones(+,-,*,/)
     * E imprima los valores
     */
    public static void main(String[] args) {
       Scanner objScanner = new Scanner(System.in);
       int a = 0;
       int b = 0;
       
       System.out.println("Ingrese Primer Numero: ");
       a = objScanner.nextInt();  
       System.out.println("Ingrese Segundo Numero: ");
       b = objScanner.nextInt();
       
       if (b > a) {
           System.out.println(b + " es mayor a " + a);
       } else {
           System.out.println(a + " es mayor a " + b);
       }
    }
    
}


