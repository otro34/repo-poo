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
public class Ejercicio8 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        double librasXKg = 2.2d;
        
        System.out.println("KILOGRAMOS  -  LIBRAS");
        
        for (int i = 1; i<200;i+=2) {
            double enLibras = i * librasXKg;
            System.out.println(i + "             " + enLibras);            
        }
        
        
    }
}
