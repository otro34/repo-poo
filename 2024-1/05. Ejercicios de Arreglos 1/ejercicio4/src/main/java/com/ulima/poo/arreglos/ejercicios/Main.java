package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        //4.	Escribir un programa en Java que evalúe si un arreglo contiene un valor específico. enteros

        int[] arr = {10,52,87,65,8,9,41,52,75,11};

        int valorBusqueda = 64;

        boolean resultado = false;

        for (int i = 0; i < arr.length; i++) {
            if (valorBusqueda == arr[i]) {
                resultado = true;
                break;
            }
        }

        if (resultado) {
            System.out.println("Se encontró el valor buscado: " + valorBusqueda);
        } else {
            System.out.println("No se encontró el valor buscado: " + valorBusqueda);
        }
    }
}