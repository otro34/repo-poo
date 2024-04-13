package ulima.poo.java.estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (!DevolverDiasDelMes()) {
            DevolverDiasDelMes();
        }
        
    }

    public static boolean DevolverDiasDelMes() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el mes del año (número): ");
        int m = scn.nextInt();

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.println("El mes tiene 31 días.");
        } else if (m == 2) {
            System.out.println("El mes tiene 28 ó 29 días.");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("El mes tiene 30 días.");
        } else {
            System.out.println("El número no corresponde a un mes del año. ");
            return false;
        }

        return true;
    }


}