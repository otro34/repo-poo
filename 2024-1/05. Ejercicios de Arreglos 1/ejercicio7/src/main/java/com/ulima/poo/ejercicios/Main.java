package com.ulima.poo.ejercicios;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] arrn = new int[arr.length + 1];

        int position = 2;
        int valorAgregar = 100;

        for (int i = 0; i < arrn.length; i++) {
            if (i < position) {
                arrn[i] = arr[i];
            } else if (i == position) {
                arrn[i] = valorAgregar;
            } else if (i > position) {
                arrn[i] = arr[i - 1];
            }            
        }

        System.out.println("Arreglo Original: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nArreglo nuevo: ");

        for (int i : arrn) {
            System.out.print(i + " ");
        }
    }
}