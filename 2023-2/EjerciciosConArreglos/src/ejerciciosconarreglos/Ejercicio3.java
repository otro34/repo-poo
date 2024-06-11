/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos;

/**
 *
 * @author otro3
 * 3.	Escribir un programa en Java que 
 * calcule el promedio del valor de los elementos en un arreglo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arr = {20,18,10,11,15,9};
        
        int suma = 0;
        
        for(int n:arr) {
            suma += n;
        }
        
        float promedio = suma / arr.length;
        
        System.out.println(promedio);
    }
}
