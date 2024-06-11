/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoadministracionlugarespublicos.models;

/**
 *
 * @author otro3
 */
public abstract class Construccion {
    private String fechaConstruccion;
    protected double areaTotal;
    private String distrito;

    public Construccion(String fechaConstruccion, double areaTotal, String distrito) {
        this.fechaConstruccion = fechaConstruccion;
        this.areaTotal = areaTotal;
        this.distrito = distrito;
    }

    public String getFechaConstruccion() {
        return fechaConstruccion;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public String getDistrito() {
        return distrito;
    }
    
    public abstract double getFactorAreaVerde(); 
    
    
    
}
