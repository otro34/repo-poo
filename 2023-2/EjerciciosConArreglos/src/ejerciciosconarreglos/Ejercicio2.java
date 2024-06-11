/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author otro3
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {10,20,45,1,3,20};
        
        String[] nombres = {"Juan", "Antonio", "Lucía", "Sandra", "Ana"};
        
        Arrays.sort(arr);
        Arrays.sort(nombres);
        
        for(int i:arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println(" ");
        
        for(String s: nombres) {
            System.out.print(s);
            System.out.print(" ");
        }
        
        System.out.println(" ");
        
        int[] arrDesc = new int[6];
        
        int n = 0;
        for (int i = 5; i >= 0; i--) {
            arrDesc[n] = arr[i];
            n++;
        }
        
        for(int i:arrDesc) {
            System.out.print(i);
            System.out.print(" ");
        }
        
        
        
    }
    
    
}
