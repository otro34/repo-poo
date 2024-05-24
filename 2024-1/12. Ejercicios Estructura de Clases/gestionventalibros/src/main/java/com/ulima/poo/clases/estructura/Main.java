package com.ulima.poo.clases.estructura;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1, "El principito", "Antoine de Saint-Exupéry", 50.0);

        libro1.vender();

        System.out.println(libro1);
    }
}