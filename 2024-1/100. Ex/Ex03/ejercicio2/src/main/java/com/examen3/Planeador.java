package com.examen3;

public class Planeador extends Aeronave {

    public Planeador(String apodo, String marca, double peso, double pesoAdicional) {
        super(apodo, marca, peso, 0 , pesoAdicional);

    }

    public double getVelocidadDeVuelo() {
        int ran = (int) (Math.random() * 200 - 100) + 100;
        return ran;
    }
    
}
