package ulima.poo.java.estructura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese número del mes: ");
        int m = scn.nextInt();

        switch(m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10: 
            case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 2: 
                System.out.println("El mes tiene 28 ó 29 días.");
                break;
            case 4:
            case 6:
            case 9:
            case 11: 
                System.out.println("El mes tiene 30 días.");
                break;
            default:
                System.out.println("El número no corresponde a un mes del año. ");
        }

    }
}