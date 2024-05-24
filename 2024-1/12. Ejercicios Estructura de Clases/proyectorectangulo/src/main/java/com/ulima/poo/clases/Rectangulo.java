package com.ulima.poo.clases;

public class Rectangulo {
    private float longitud;
    private float ancho;

    public Rectangulo() {
        this.longitud = 1;
        this.ancho = 1;
    }

    public Rectangulo(float longitud, float ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public float calcularArea() {
        return this.longitud * this.ancho;
    }

    public float calcularPerimetro() {
        return 2 * (this.longitud + this.ancho);
    }

    public float calcularDiagonal() {
        return (float) Math.sqrt(Math.pow(this.longitud, 2) + Math.pow(this.ancho, 2));
    }

    public float getLongitud() {
        return this.longitud;
    }

    public void setLongitud(float longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            System.out.println("Longitud fuera de rango");
        }

    }

    public float getAncho() {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        if (ancho > 0.0 && ancho < 20.0) {
            this.ancho = ancho;
        } else {
            System.out.println("Ancho fuera de rango");
        }
    }
}
