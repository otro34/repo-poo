/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosconarreglos2;

/**
 *
 * @author otro3
 */
public class EjerciciosConArreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarando un arreglo simple
         int[] arr = {1,2,3,4};
         
         for(int elemento:arr) {
             System.out.println(elemento);
         }
         
         for (int i = 0; i< arr.length; i++){
             System.out.println(arr[i]);
         }
         
         //Guardar las ventas de una tienda
         //Articulo vendido, cantidad, precio, fecha
         
         String[] venta = {"Azucar", "1","2","2022-02-02"};
         String[] venta2 = {"Leche", "1","2","2022-02-02"};
         
         String[][] ventas = {venta,venta2};
         
         System.out.println("VENTAS EN LA TIENDA: ");

         for(int i=0; i< ventas.length; i++){
             System.out.println("Venta (" + i + ") " +
                           ventas[i][0] + " "
                         + ventas[i][1] + " "
                         + ventas[i][2] + " "
                         + ventas[i][3] + " ");
         }
         
         System.out.println("PROBANDO ORDENAMIENTO BURBUJA");
         
         int[] arregloDesordenado = {33,55,4,2,77,8,21};
         
         print(arregloDesordenado);
         OrdenarArregloAscendente(arregloDesordenado);
         print(arregloDesordenado);
         
         System.out.println("ENCONTRANDO VALOR MAXIMO:");
         int[] arregloMax = {5,7,2,3,1,9,3,10};
         
         print(arregloMax);
         System.out.println("El valor maximo es:");
         System.out.println(EncontrarMax(arregloMax));
         System.out.println("El valor minimo es: ");
         System.out.println(EncontrarMin(arregloMax));
         
         System.out.println("ARREGLOS DE OBJETOS");
         
         Venta objventa1 = new Venta("Leche", 1,2,"2022-02-02");
         Venta objventa2 = new Venta("Azucar", 2,3,"2022-02-01");
         Venta objventa3 = new Venta("Aceite", 3,3,"2022-02-01");
         Venta objventa4 = new Venta("Arroz", 4,3,"2022-02-01");
         
         Venta[] arrVentas = new Venta[4];
         
         arrVentas[0] = objventa1;
         arrVentas[1] = objventa2;
         arrVentas[2] = objventa3;
         arrVentas[3] = objventa4;
         
         for(Venta objVenta:arrVentas) {
             System.out.println(objVenta.ToString());
         }
        
    }
   
    private static void print(int[] arr) {
        for(int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    private static void OrdenarArregloAscendente(int[] arr) {
        for (int i = 0; i < arr.length - 1;i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    private static int EncontrarMax(int[] arr){
        int max = -1;
        for(int i=0; i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        
        return max;
    }
    
    private static int EncontrarMin(int[] arr){
        int min = Integer.MAX_VALUE; //2147483647
        for(int i=0; i< arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        
        return min;
    }
    
}
