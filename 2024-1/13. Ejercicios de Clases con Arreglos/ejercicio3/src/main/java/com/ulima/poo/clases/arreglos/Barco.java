package com.ulima.poo.clases.arreglos;

public class Barco {
    private String nombre;
    private int vida = 5;

    public Barco(String nombre) { 
        this.nombre = nombre;
    }

    public void golpear(Barco barcoEnemigo) {
        int golpe = (int) (Math.floor(Math.random()*(100-1+1)+1));

        barcoEnemigo.recibirGolpe(golpe);
    }

    public void recibirGolpe(int valorGolpe) {
        if (valorGolpe >= 75) {
            System.out.println("Golpe Efectivo! Valor golpe: " + valorGolpe);
            vida--;
        }
    }

    public int getVida() {
        return this.vida;
    }

    public String getNombre() {
        return this.nombre;
    }
}
