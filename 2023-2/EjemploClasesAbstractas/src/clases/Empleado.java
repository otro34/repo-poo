/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author otro3
 */
public abstract class Empleado {
    protected String nombres;
    protected String genero;
    protected String cargo;
    protected int numeroGrados;
    protected int aniosServicio;
    protected float sueldoBasico;
    protected float bonificacion;
    protected float sueldoTotal;

    public Empleado(String nombres, String genero, String cargo, int numeroGrados, int aniosServicio, float sueldoBasico) {
        this.nombres = nombres;
        this.genero = genero;
        this.cargo = cargo;
        this.numeroGrados = numeroGrados;
        this.aniosServicio = aniosServicio;
        this.sueldoBasico = sueldoBasico;
        this.bonificacion = 0;
        this.sueldoTotal = 0;
    }
    
    public void calcularSueldoTotal(){
        
        this.calcularBonificacion();
        
        this.sueldoTotal = this.sueldoBasico + this.bonificacion;
    }
    
    @Override
    public String toString() {
        return "Nombres: " + nombres + " - Sueldo: " + sueldoTotal;
    }
    
    public abstract void calcularBonificacion();
}
