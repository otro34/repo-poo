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
public class EjerciciosDeArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {1,2,3,4,5};
        
        int suma = 0;
        
        for (int i = 0; i < arr.length; i++ ){
            suma = suma + arr[i];
        }
        
        System.out.println(suma);
    }
    
}
