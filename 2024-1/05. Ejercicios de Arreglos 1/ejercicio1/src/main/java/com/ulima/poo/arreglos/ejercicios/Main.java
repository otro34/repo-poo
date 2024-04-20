package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        //1.	Escribir un programa en Java que sume los valores en un arreglo.

        int[] arr = { 10,20,30,40,50 };

        int suma = 0;
        
        for (int i=0; i < arr.length; i++) {
            suma += arr[i];
        }

        System.out.println("El total es: " + suma);
    }
}