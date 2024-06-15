package com.example;

public class GeneradorDeCreeps {
    
    public Creep generar() {
        int random = (int)(Math.random() * (3) + 1);

        if (random == 1) {
            System.out.println("Ha aparecido un creep Meele!");
            return new CreepMelee("George");
        } else if (random == 2) {
            System.out.println("Ha aparecido un creep de Rango!");
            return new CreepRango("Elizabeth");
        } else {
            System.out.println("Ha aparecido un creep Catapulta!");
            return new CreepCatapulta("Felipe");
        }
    }
}
