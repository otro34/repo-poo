package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = new int[8];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int e : arr1) {
            System.out.println(e);
        }

        for (int e : arr2) {
            System.out.println(e);
        }
    }
}