package ulima.poo.java.estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a,b;

        System.out.println("Ingrese primer número (a) : ");
        a = scn.nextInt();

        System.out.println("Ingrese segundo número (b) : ");
        b = scn.nextInt();

        if (a > b) {
            System.out.println("a es mayor que b.");
        } else if (b > a) {
            System.out.println("b es mayor que a.");
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}