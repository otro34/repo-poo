package com.ulima.poo.clases;

public class Perro {
 
    private int edad;
    private String nombre;

    // GETTERS y SETTERS

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    //COMPORTAMIENTO

    public void ladrar() {
        System.out.println("guau guau");
    }
}

