package com.ulima.poo.estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Utilizando un for, ingresar 10 números por teclado e imprimir el mayor

        Scanner scn = new Scanner(System.in);
       
        int max = Integer.MIN_VALUE;
        int n = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un número: (" + i + "): ");
            n = scn.nextInt();
            max = n > max ? n : max;

        }

        System.out.println("El numero mayor es: " + max);
    }
}