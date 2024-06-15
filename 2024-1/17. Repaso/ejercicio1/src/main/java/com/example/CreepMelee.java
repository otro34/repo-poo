package com.example;

public class CreepMelee extends Creep {

    public CreepMelee(String nombre) {
        super(nombre);
        this.daño = 10;
        this.vida = 50;
        this.tipo = TipoCreep.MELEE;
    }
    
}
