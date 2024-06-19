package com.example;

public class Administrativo extends Docente {

    private String cargo;
    private double montoFijoMensual;

    public Administrativo(String codigo, String nombre, String apellido, double montoFijoMensual, String cargo) {
        super(codigo, nombre, apellido);
        //TODO Auto-generated constructor stub
        this.montoFijoMensual = montoFijoMensual;
        this.cargo = cargo;
    }

    @Override
    public double getSueldo() {
        double total = 0 ;

        if (cargo.equals("Jefe de Oficina")) {
            total = montoFijoMensual * 1.10;
        } else if (cargo.equals("Asistente"))
            total = montoFijoMensual * 1.03;
        else if (cargo.equals("Autoridad"))
            total = montoFijoMensual * 1.22;
        
        return total;
    }
    
}
