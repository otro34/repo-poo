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
public class EjerciciosDeProgramacion4 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese el valor: ");
        
        int valor = sc.nextInt();
        
        if (valor >= 1 && valor<=100) {
            System.out.println("OK");
        } else {
            System.out.println("Fuera de Rango");
        }
        
    }
}
