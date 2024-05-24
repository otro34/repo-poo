package com.ulima.clases.estructura;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio,2);
    }
}
