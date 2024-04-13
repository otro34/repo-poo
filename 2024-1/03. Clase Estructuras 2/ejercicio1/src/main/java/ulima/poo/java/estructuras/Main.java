package ulima.poo.java.estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a;
        int b;
        int temp;

        System.out.println("Ingrese el valor de a: ");
        a = scn.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = scn.nextInt();

        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Intercambio realizado!");
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);

    }
}