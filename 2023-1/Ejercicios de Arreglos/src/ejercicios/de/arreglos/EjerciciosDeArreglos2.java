/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.arreglos;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class EjerciciosDeArreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {1,50,43,23,10,34};
        
        Arrays.sort(arr);
        
        for(int i: arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println("\n");
        
        String[] arrS = {"Juan", "Felipe", "Sancho", "Lucile","Ru"};
        
        Arrays.sort(arrS);
        
        for(String s: arrS) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
    
}
