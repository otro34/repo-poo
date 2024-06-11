/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayuda;

/**
 *
 * @author otro3
 */
public class Ayuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int suma = AyudanteMatematico.Suma(2, 2);
        
        System.out.println(suma);
        
        int resta = AyudanteMatematico.Resta(5, 1);
        
        System.out.println(resta);
        
        int multi = AyudanteMatematico.Multiplicacion(10, 2);
        
        System.out.println(multi);
        
        int div = AyudanteMatematico.Divison(10, 2);
        
        System.out.println(div);
    }
    
}
