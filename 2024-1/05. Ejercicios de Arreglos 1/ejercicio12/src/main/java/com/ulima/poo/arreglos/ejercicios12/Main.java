package com.ulima.poo.arreglos.ejercicios12;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,10,20,3,5,6,6,11};

        int valorBusqueda = 12;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == valorBusqueda) {
                    System.out.println("Par encontrado: " + arr[i] + " y " + arr[j]);
                }
            }
        }
    }
}