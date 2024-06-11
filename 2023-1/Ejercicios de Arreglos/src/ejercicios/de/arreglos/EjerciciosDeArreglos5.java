/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.arreglos;

/**
 *
 * @author otro3
 * 5.	Escriba un programa en Java para encontrar el índice de un elemento en un arreglo.
 */
public class EjerciciosDeArreglos5 {
    public static void main(String[] args) {
    
    String[] nombres = {"Maria", "Henry", "Patty", "Rosa", "Ana"};
    
    String elementoBuscado = "Ana";
    
    int indice = -1;
    
    for (int i = 0; i < nombres.length; i++){
        if (elementoBuscado == nombres[i]){
            indice = i;
            break;
        }
    }
    
    if (indice > -1)
        System.out.println("El índice del elemento es: " + indice);
    else
        System.out.println("No se encuentra el elemento.");
    }
    
}
