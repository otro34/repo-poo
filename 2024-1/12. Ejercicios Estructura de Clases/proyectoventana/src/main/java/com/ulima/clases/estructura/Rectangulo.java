package com.ulima.clases.estructura;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base * altura;
    }
}
