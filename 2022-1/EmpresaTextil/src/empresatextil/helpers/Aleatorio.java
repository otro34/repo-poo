/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatextil.helpers;

import java.util.Random;

/**
 *
 * @author otro3
 * Esta clase helper con métodos estáticos se han creado para poder reutilizar su 
 * comportamiento en las diferentes clases que tenemos en nuestra solución.
 * 
 */
public class Aleatorio {
   
    public static int obtenerNumeroParAleatorio(int min, int max){
        Random rand = new Random();

        return min +  rand.nextInt((max-min)/2)*2;
    }
    
    public static int obtenerNumeroImparAleatorio(int min, int max){
        int aleatorio = obtenerNumeroParAleatorio(min,max);
        
        return aleatorio % 2 == 0 ? aleatorio + 1 : aleatorio;
    }
    
    public static int obtenerNumeroAleatorio(int min, int max){
        Random rand = new Random();

        return min +  rand.nextInt((max-min));
    }
}
