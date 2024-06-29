package com.examen3;

public class Avion extends Aeronave {

    public Avion(String apodo, String marca, double peso, double fuerzaMotor, double pesoAdicional) {
        super(apodo, marca, peso, fuerzaMotor, pesoAdicional);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getFuerzaMotor() {
        return fuerzaMotor * 2;
    }
    
}
