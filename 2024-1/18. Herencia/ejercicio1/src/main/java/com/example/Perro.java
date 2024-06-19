package com.example;

public class Perro extends Mascota  {

    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hablar() {
        System.out.println("GUAUUUU");
    }

    
}
