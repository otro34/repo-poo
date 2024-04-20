package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,12,54,32,1};

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            }
        }

        System.out.println("El 2do valor menor eS: " + min2);
    }


}