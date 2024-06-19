package com.example;

public class Gato extends Mascota {

    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hablar() {
        System.out.println("MIAUUUU");
    }
    
}
