package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
    // 3.	Escribir un programa en Java que calcule el promedio del valor de los elementos en un arreglo.
    
    int[] arr = {14,15,11,12,13,9,7,5,2,20};

    int suma = 0;
    
    for (int i = 0; i < arr.length; i++) {
        //suma = suma + arr[i];
        suma += arr[i];
    }

    float promedio = suma / arr.length;

    System.out.println("El promedio es: " + promedio);

    }
}