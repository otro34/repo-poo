package com.example;

public class CreepCatapulta extends Creep {

    public CreepCatapulta(String nombre) {
        super(nombre);
        this.daño = 25;
        this.vida = 100;
        this.tipo = TipoCreep.CATAPULTA;
    }
    
}
