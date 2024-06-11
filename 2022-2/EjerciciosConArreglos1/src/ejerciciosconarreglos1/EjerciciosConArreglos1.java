/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos1;

/**
 *
 * @author otro3
 */
public class EjerciciosConArreglos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sumar Valores de un Areglo:");
        Ejercicio1.SumarValoresArreglo();
        
        System.out.println("Remover item de un arreglo");
        int[] arr = {1,2,3,4,5,6,7};
        
        System.out.println("Arreglo original:");
        Ejercicio1.print(arr);
        System.out.println("Arreglo despues de remover item");
        Ejercicio1.print(Ejercicio1.remove(2, arr));
        
        System.out.println("Ordenar un arrgle (bubble sort");
        
        int[] arr2 = {55,77,64,93,21,4,5};
        
        System.out.println("arreglo original:");
        Ejercicio1.print(arr2);
        System.out.println("Ordenado:");
        Ejercicio1.OrdenarAscendenteArregloInt(arr2);
        Ejercicio1.print(arr2);
        
    }
    
}
