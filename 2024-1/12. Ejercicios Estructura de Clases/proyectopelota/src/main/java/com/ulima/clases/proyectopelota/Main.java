package com.ulima.clases.proyectopelota;

public class Main {
    public static void main(String[] args) {
        Pelota pelota1 = new Pelota(12, "azul");
        Pelota pelota2 = new Pelota(10, "rosado");

        System.out.println("Volumen de pelota1: " + pelota1.getVolumen());
        System.out.println("Genero de pelota1: " + pelota1.getGenero());
        System.out.println("Volumen de pelota2: " + pelota2.getVolumen());
        System.out.println("Genero de pelota2: " + pelota2.getGenero());

    }
}