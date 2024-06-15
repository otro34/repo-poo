package com.example;

public class Creep {
    protected String nombre;
    protected double vida;
    protected double daño;
    protected TipoCreep tipo;

    public Creep(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public TipoCreep getTipo() {
        return tipo;
    }

    public void setTipo(TipoCreep tipo) {
        this.tipo = tipo;
    }

    public void golpear(Heroe heroe) {
        double golpe = 0;
        
        if(tipo == TipoCreep.MELEE) {
            golpe = daño * 2; 
        } else if (tipo == TipoCreep.RANGO) {
            golpe = daño * 1.5;
        } else if (tipo == TipoCreep.CATAPULTA) {
            golpe = daño * 3;
        }

        heroe.recibirGolpe(golpe);
    }

    public void recibirGolpe(double golpe) {
        vida -= golpe;
    }

}
