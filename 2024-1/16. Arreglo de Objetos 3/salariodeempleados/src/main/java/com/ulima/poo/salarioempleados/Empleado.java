package com.ulima.poo.salarioempleados;

public class Empleado {
    private String codigo;
    private String nombre;
    private int cantidadDeHorasTrabajadas;
    private double sueldoPorHora;
    private int cantidadHorasExtra;
    private double pagoPorHorasExtra;

    public Empleado(String codigo, String nombre, int cantidadDeHorasTrabajadas, double sueldoPorHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;

        calcularHorasExtra();
    }

    private void calcularHorasExtra() {
        if (cantidadDeHorasTrabajadas > 40) {
            cantidadHorasExtra = cantidadDeHorasTrabajadas - 40;
            if (cantidadDeHorasTrabajadas >= 41 &&
                cantidadDeHorasTrabajadas <= 45) {
                    pagoPorHorasExtra = cantidadHorasExtra * 2;
                } else {
                    pagoPorHorasExtra = cantidadHorasExtra * 3;
                }
        }
    }

    @Override
    public String toString() {

        return "\nCodigo: " + codigo + 
                "\nNombre: " + nombre +
                "\nCantidad De Horas trabajadas: " + cantidadDeHorasTrabajadas + 
                "\nSueldo por Hora: " + sueldoPorHora + 
                "\nCantidad de Horas Extra: " + cantidadHorasExtra + 
                "\nMonto por horas Extra: " + pagoPorHorasExtra + 
                "\nTotal a Pagar: " + getTotal(); 
    }

    public double getTotal() {
        return cantidadDeHorasTrabajadas * sueldoPorHora + pagoPorHorasExtra;
    }

    
}
