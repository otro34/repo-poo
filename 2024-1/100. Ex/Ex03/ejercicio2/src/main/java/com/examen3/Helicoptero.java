package com.examen3;

public class Helicoptero extends Aeronave {

    private double fuerzaHelice;

    public Helicoptero(String apodo, String marca, double peso, double fuerzaMotor, double pesoAdicional, double fuerzaHelice) {
        super(apodo, marca, peso, fuerzaMotor, pesoAdicional);

        this.fuerzaHelice = fuerzaHelice;
    }

    @Override
    public double getFuerzaMotor() {
        return (fuerzaMotor * 1.5) + (fuerzaHelice * 4);
    }
    
}
