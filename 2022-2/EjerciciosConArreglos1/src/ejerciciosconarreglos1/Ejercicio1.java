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
public class Ejercicio1 {
    
    public static void SumarValoresArreglo() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        int suma = 0;
        for(int i = 0;i < arr.length;i++){
            suma += arr[i];
        }
        
        System.out.println("La suma es: "+suma);
    }
    
    public static void PromedioValoresArreglo() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        int suma = 0;
        for(int i = 0;i < arr.length;i++){
            suma += arr[i];
        }
        
        System.out.println("La suma es: "+suma/arr.length);
    }
    
    public static boolean encontrar(int x, int[] arr){
        for(int i = 0; i<arr.length;i++) {
            if (x == arr[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static int encontrarInt(int x, int[] arr){
        for(int i = 0; i<arr.length;i++) {
            if (x == arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }
    
    public static int encontrarIndice(int x, int[] arr){
        for(int i = 0; i<arr.length;i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void print(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static int[] remove(int value, int[] arr){
        
        int[] newarr = new int[arr.length - 1];
        int jindex = 0;
        for(int i = 0; i<arr.length;i++){
            if (value != arr[i]) {
                newarr[jindex] = arr[i];
                jindex++;
            }
        }
        return newarr;
    }
    
    public static void OrdenarAscendenteArregloInt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;        
                }
            }
        }
    }
}
