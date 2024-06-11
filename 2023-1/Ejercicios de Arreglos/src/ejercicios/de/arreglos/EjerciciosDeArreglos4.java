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
public class EjerciciosDeArreglos4 {
    
    public static void main(String[] args){
        String[] nombres = {"Juan", "Carlos", "Pedro", "Julio", "Sancho"};
        
        String nombreBuscado = "Maria";
        
        boolean encontrado = false;
        
//        for(String nombre : nombres) {
//            if (nombre == nombreBuscado) {
//                encontrado = true;
//            } 
//        }
        
        for(int i = 0; i < nombres.length; i++ ) {
            if(nombres[i] == nombreBuscado) {
                encontrado = true;
                break;
            }
            
        }
        
        if (encontrado == true) {
            System.out.println(nombreBuscado + " Fue encontrado!");
        } else 
            System.out.println(nombreBuscado + " no se encuentra en el arreglo");
    }
    
}
