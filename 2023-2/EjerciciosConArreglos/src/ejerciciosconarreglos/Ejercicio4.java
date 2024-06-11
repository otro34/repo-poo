/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos;

/**
 *
 * @author otro3
 * 4.	Escribir un programa en Java que evalúe si un arreglo contiene un valor específico.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String[] carros = {"Audi", "BMW", "Mazda", "Chevrolet", "Fiat"};
        
        String valorDeBusqueda = "Audi";
        
        boolean encontrado = false;
        
        for (int i = 0; i < carros.length; i++){
            if (carros[i].equals(valorDeBusqueda)) {
                encontrado = true; 
                break;
            }
             System.out.println(i);
        }
        
        if (encontrado) {
            System.out.println("Valor Encontrado!");
        } else
            System.out.println("No se encuentra el valor");
    }
}
