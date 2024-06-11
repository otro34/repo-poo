/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import extensiones.TipoEmpleado;

/**
 *
 * @author otro3
 */
public abstract class Empleado {
    protected TipoEmpleado tipo; //P, E, A
    protected String nombreCompleto;
    protected String direccion;
    protected double sueldoBasico;
    protected double sueldoFinal;

    public Empleado(String nombreCompleto, String direccion, double sueldoBasico) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.sueldoBasico = sueldoBasico;
    }
    
    public abstract void calcularSueldo();
   
    @Override
    public String toString() {
        return this.nombreCompleto + " - " +
                this.direccion + " - " +
                this.tipo + " - " +
                "SB: " + this.sueldoBasico + " - " + 
                "SF: " + this.sueldoFinal;
    }

}
