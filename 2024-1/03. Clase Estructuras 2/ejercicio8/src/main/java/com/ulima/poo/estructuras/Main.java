package com.ulima.poo.estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int n = 0;
        int i = 0;

        do {
            i++;
            System.out.println("Ingrese valor (" +i + "):");
            n = scn.nextInt();
            max = n > max ? n : max;
        } while (i < 5);

        System.out.println("El numero mayor es: " + max);

    }
}