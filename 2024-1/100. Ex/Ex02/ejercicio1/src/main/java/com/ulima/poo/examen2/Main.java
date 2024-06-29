package com.ulima.poo.examen2;

public class Main {
    public static void main(String[] args) {
        double[] adicionales1 = { 100, 200, 300, 400, 500 };
        Venta venta1 = new Venta("Chevrolet", "Camaro", "00112233", 189000,adicionales1);

        double[] adicionales2 = { 100, 100, 90, 200, 100 };
        Venta venta2 = new Venta("Ford", "Territory", "77885522", 120000,adicionales2);

        double[] adicionales3 = { 1000, 100, 90, 400, 100 };
        Venta venta3 = new Venta("BMW", "X5", "66554411", 210000,adicionales3);

        System.out.println("Total Venta 1: S/" + venta1.getTotal());

        System.out.println("Total Venta 2: S/" + venta2.getTotal());

        System.out.println("Total Venta 3: S/" + venta3.getTotal());

        venta1.imprimir();
        venta2.imprimir();
        venta3.imprimir();


    }
}