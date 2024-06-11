/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.arreglos;

/**
 *
 * @author otro3
 */
public class EjerciciosDeArreglos7 {
    public static void main(String[] args) {
        int posicion = 3;
        
        int[] arr = {10,20,30,40,50};
        
        int valorAAgregar = 60;
        
        int[] arrTemporal = new int[arr.length + 1];
        
        imprimirArreglo(arr);
        
        for (int i = 0; i < arrTemporal.length; i++) {
            if (i < posicion) {
                arrTemporal [i] = arr[i];
            } else if (i == posicion) {
                arrTemporal[i] = valorAAgregar;
            } else if (i > posicion) {
                arrTemporal[i] = arr[i-1];
            }
        }
        
        arr = arrTemporal;
        
        imprimirArreglo(arr);
        
    }

    private static void imprimirArreglo(int[] arr) {
        for(int i : arr) {
            System.out.print(i +  " ");
        }
        System.out.println("");
    }
    
}
