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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        String[] nombres = {"Esteban", "Adriana", "Rodrigo", "Angelo", "Diego"};
        
        String nombreDeBusqueda = "dsfsdfsdf";
        
        for(int i = 0; i<nombres.length; i++) {
            if (nombres[i].equals(nombreDeBusqueda)){
                System.out.println("El índice es: " + i);
            }
        }
    }
    
}
