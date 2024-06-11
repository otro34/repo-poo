/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeprogramacion;

import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class EjerciciosDePrgramacion3 {
        public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculo de Hipotenusa");
            
        System.out.println("Ingrese el valor de b (base)");
        
        double base = sc.nextDouble();
        
        System.out.println("Ingrese el valor de h (altura)");
        
        double altura = sc.nextDouble();
        
        double h = Math.sqrt( Math.pow(base, 2) + Math.pow(altura, 2));
        
        System.out.println("El valor de la hipotenusa es : " + h);
        
        
    }
}
