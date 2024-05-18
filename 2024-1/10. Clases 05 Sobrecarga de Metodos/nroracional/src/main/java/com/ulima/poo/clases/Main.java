package com.ulima.poo.clases;

public class Main {
    public static void main(String[] args) {
        NumeroRacional nr = new NumeroRacional();
        System.out.println(nr.toString());

        NumeroRacional nr2 = new NumeroRacional(1,2);
        System.out.println(nr2.toString());

        NumeroRacional nr3 = new NumeroRacional(10,60);

        System.out.println(nr3.toString());
        nr3.simplificar();
        System.out.println(nr3.toString());

        System.out.println("SUMA: ");
        NumeroRacional nr4 = new NumeroRacional(2,3);
        NumeroRacional nr5 = new NumeroRacional(4,5);

        nr4.sumar(nr5);

        System.out.println(nr4.toString());

        System.out.println("SUMA CON 2 NUMEROS");

        NumeroRacional nr6 = new NumeroRacional();
        NumeroRacional nr7 = new NumeroRacional(6,3);
        NumeroRacional nr8 = new NumeroRacional(9,2);

        nr6.sumar(nr7, nr8);

        System.out.println("SUMANDO " + nr7.toString() + " + " + nr8.toString());
        System.out.println("Resultado: " + nr6.toString());

    }
}