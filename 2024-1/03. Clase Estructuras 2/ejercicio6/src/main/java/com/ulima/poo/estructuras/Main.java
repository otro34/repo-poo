package com.ulima.poo.estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ingresar 5 numeros por teclado y determinar cual es el mayor
        Scanner scn = new Scanner(System.in);

        int n = Integer.MIN_VALUE, i, max;
        i = 1;
        max = 0;

        while(n!=0) {
            System.out.println("Ingrese numero ("+ i + "):");
            n = scn.nextInt();

            if (n == 0){
                break;
            }

            if (n > max) {
                max = n;
            }

            i++;
        }

        System.out.println("El numero mayor es: " + max);
    }
}