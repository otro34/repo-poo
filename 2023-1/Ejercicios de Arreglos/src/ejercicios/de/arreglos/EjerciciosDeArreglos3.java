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
public class EjerciciosDeArreglos3 {
    public static void main(String[] args) {
    
        int[] notas = {10,11,20,19,18,15,5,14};
        
        int suma = 0;
        
        for(int i : notas) {
            suma = suma + notas[i];
        }
        
        double promedio = suma / notas.length;
        
        System.out.println("El promedio es: " + promedio);
        
    }
}
