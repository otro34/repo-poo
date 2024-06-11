/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos;

/**
 *
 * @author otro3
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] arr = {3,54,67,89,43};
        int[] arr2 = new int[5];
        
        for(int i = 0; i<arr.length;i++) {
            arr2[i] = arr[i];
        }
        
        for(int val: arr) {
            System.out.print(val);
            System.out.print(" ");
        }
        
        System.out.println("");
        
        for(int val: arr2) {
            System.out.print(val);
            System.out.print(" ");
        }
    }
}
