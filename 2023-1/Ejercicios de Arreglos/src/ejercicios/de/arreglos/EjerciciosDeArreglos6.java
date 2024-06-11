/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.arreglos;

/**
 *
 * @author otro3
 * 6.	Escriba un programa en Java que copie un arreglo iterando sobre este.
 */
public class EjerciciosDeArreglos6 {
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,8,9};
        int[] arrCopy = new int[arr.length];
        
        for(int i: arr) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for(int i: arrCopy) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < arr.length;i++){
            arrCopy[i] = arr[i];
        }
        
        for(int i: arr) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for(int i: arrCopy) {
            System.out.print(i + " ");
        }
        
        
    }
}
