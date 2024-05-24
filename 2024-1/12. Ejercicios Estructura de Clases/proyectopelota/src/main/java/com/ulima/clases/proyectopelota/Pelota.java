package com.ulima.clases.proyectopelota;

public class Pelota {
    private double radio;
    private String color;

    public Pelota(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getVolumen() {
        return (4.0/3.0) * Math.PI * Math.pow(radio,3);
    }

    public String getGenero() {
        if (color.equals("rosado")) {
            return "Niña";
        } else {
            return "Niño";
        }
    }
}
