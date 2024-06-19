package com.example;

public class Investigador extends Docente {

    private double pagoPorHora;
    private String tipoDeProyecto;

    public Investigador(String codigo, String nombre, String apellido, 
    double pagoPorHora, String tipoDeProyecto) {
        super(codigo, nombre, apellido);
        //TODO Auto-generated constructor stub

        this.pagoPorHora = pagoPorHora;
        this.tipoDeProyecto = tipoDeProyecto;
    }

    @Override
    public double getSueldo() {
        double total = 0;
        if (tipoDeProyecto.equals("Ingenieria"))
            total = pagoPorHora * 160 * 3;
        else if (tipoDeProyecto.equals("Sociales"))
            total = pagoPorHora * 160 * 1.5;

        return total;
    }
    
}
