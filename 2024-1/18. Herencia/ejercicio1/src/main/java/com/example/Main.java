package com.example;

public class Main {
    public static void main(String[] args) {
        Perro perrito1 = new Perro("Kenshin", "Akita", 6);
        Perro perrito2 = new Perro("Goki", "Akita", 11);
        Gato gatito1 = new Gato("Nina", "Siames", 7);

        Mascota[] mascotas = new Mascota[3];

        mascotas[0] = perrito1;
        mascotas[1] = perrito2;
        mascotas[2] = gatito1;

        for (Mascota mascota : mascotas) {
            mascota.comer();
            mascota.hablar();  
        }

        
    }
}