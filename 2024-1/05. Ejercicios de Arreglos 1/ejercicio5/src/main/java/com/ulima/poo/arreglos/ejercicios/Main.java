package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        //5.	Escriba un programa en Java para encontrar el índice de un elemento en un arreglo.

        int[] arr = {10,52,87,65,8,9,41,52,75,11};

        int valorBusqueda = 65;

        int indice = -1 ;

        for (int i = 0; i < arr.length; i++) {
            if (valorBusqueda == arr[i]) {
                indice = i;
            }
        }

        if (indice > -1) {
            System.out.println("Valor encontrado en el índice: " + indice);
        } else {
            System.out.println("Valor no encontrado");
        }
    }
}