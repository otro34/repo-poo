package com.ulima.poo.arreglos.ejercicios;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2.	Escribir un programa en Java que ordene de manera ascendente un arreglo numérico y uno de strings.

        int[] arr = {5,4,6,33,7,2,88,90,43,23,76};
        String[] arr2 = {"Juan", "Felipe", "John", "Guillermo", "Liz", "Sandra", "Max"};
        
        System.out.println("Antes de Ordenar: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("");
        System.out.println("Después de Ordenar: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}