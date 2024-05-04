package com.ulima.poo.clases;


public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();

        perro1.ladrar();

        perro1.setEdad(5);

        System.out.println(perro1.getEdad());
    }
}