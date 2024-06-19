package com.example;

public class Ordinario extends Docente {

    private double montoFijoMensual;

    public Ordinario(String codigo, String nombre, String apellido, double montoFijoMensual) {
        super(codigo, nombre, apellido);
        //TODO Auto-generated constructor stub
        this.montoFijoMensual = montoFijoMensual;
    }

    @Override
    public double getSueldo() {
        return montoFijoMensual;
    }
    
}
