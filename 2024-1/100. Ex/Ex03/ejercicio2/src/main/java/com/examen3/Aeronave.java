package com.examen3;

public class Aeronave {
    protected String apodo;
    protected String marca;
    protected double peso; 
    protected double fuerzaMotor;
    protected double pesoAdicional;

    public Aeronave(String apodo, String marca, double peso, double fuerzaMotor, double pesoAdicional) {
        this.apodo = apodo;
        this.marca = marca;
        this.peso = peso;
        this.fuerzaMotor = fuerzaMotor;
        this.pesoAdicional = pesoAdicional;
    }

    public double getFuerzaMotor() {
        return fuerzaMotor;
    }

    public double getVelocidadDeVuelo() {
        double resistenciaAire = peso / 20;

        return getFuerzaMotor() - resistenciaAire;
    }

    
}
