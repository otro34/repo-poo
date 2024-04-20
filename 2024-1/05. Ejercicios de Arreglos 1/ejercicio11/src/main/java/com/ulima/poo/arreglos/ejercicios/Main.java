package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        //11.	Escribir un programa en Java que permita encontrar los elementos comunes entre 2 arreglos.

        int[] arr1 = {1,3,5,7,10,11};
        int[] arr2 = {2,3,5,6,12,13};

        int[] arrComunes = new int[10];
        int n = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arrComunes[n] = arr1[i];
                    n++;
                }
            }
        }

        for (int i : arrComunes) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}