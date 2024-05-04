package com.ulima.poo.ejercicios2;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }   

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return lado * 4;
    }
}
