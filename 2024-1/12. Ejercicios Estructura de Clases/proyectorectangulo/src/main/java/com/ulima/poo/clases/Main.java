package com.ulima.poo.clases;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(10,5);

        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Diagonal: " + rectangulo1.calcularDiagonal());

        rectangulo1.setLongitud(15);
        rectangulo1.setAncho(7);
        
        System.out.println("Area: " + rectangulo1.calcularArea());
        System.out.println("Perimetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Diagonal: " + rectangulo1.calcularDiagonal());
    }
}