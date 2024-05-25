package com.ulima.poo.examen2;

public class Circulo {
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return 3.1416 * radio * radio;
    }
}
