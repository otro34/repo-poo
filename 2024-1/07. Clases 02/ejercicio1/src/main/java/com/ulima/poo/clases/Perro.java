package com.ulima.poo.clases;

public class Perro {

    private String raza = "Akita";
 
    private int edad;
    private String nombre;

    public Perro(String nombre) {
        this.edad = 0;
        this.nombre = nombre;    
    }

    // GETTERS y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public String getDatos() {
        return "\nEdad: " + edad + "\nNombre: " + nombre;
    }
}

