package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        //8.	Escriba un programa en Java que encuentre el valor máximo y el mínimo en un arreglo

        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;

        int[] arr = {2,5,4,7,14,8,5};

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > MAX) {
                MAX = arr[i];
            }

            if ( arr[i] < MIN ) {
                MIN = arr[i];
            }
        }

        System.out.println("El valor máximo es: " + MAX);
        System.out.println("El valor mínimo es: " + MIN);
    }
}