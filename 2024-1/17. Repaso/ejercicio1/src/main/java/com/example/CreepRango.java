package com.example;

public class CreepRango extends Creep {

    public CreepRango(String nombre) {
        super(nombre);
        this.daño = 15;
        this.vida = 40;
        this.tipo = TipoCreep.RANGO;
    }
    
}
