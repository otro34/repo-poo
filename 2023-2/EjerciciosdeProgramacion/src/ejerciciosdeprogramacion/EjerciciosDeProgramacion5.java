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
public class EjerciciosDeProgramacion5 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        
        int min = 0;
        int max = 0;
        
        while (i<=5) {
            System.out.println("Ingrese un valor("+i+") : ");
            int valor = sc.nextInt();
            
            if (i == 1) {
                min = valor;
                max = valor;
            } else {
                if (valor < min) {
                    min = valor;
                }
                
                if (valor > max) {
                    max = valor;
                }
            }
            
            i++;
        }
        
        System.out.println("MAX = " + max + ", MIN = " + min);
    }
}
