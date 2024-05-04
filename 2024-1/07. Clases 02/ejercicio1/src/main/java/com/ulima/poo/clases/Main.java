package com.ulima.poo.clases;


public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais");

        perro1.ladrar();

        System.out.println("La edad de mi perro es " + perro1.getEdad() + " años y su nombre es: " + perro1.getNombre());
        
        perro1.setEdad(5);

        System.out.println(perro1.getDatos());
    }
}