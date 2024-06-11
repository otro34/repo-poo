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
public class Electronico extends Empleado{

    private int aniosAntiguedad;
    
    public Electronico(String nombreCompleto, String direccion, 
                        double sueldoBasico, int aniosAntiguedad) {
        super(nombreCompleto, direccion, sueldoBasico);
        this.tipo = TipoEmpleado.E;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    
    @Override
    public void calcularSueldo() {
        double bono = 0;
        
        if (this.aniosAntiguedad < 3) {
            bono = this.sueldoBasico * 0.005;
            
        } else if (this.aniosAntiguedad >= 3 && this.aniosAntiguedad < 5) {
            bono = this.sueldoBasico * 0.05;
        } else if (this.aniosAntiguedad >= 5 && this.aniosAntiguedad < 7) {
            bono = this.sueldoBasico * 0.07;
        } else if (this.aniosAntiguedad >= 7) {
            bono = this.sueldoBasico * 0.11;
        }
        
        this.sueldoFinal = this.sueldoBasico + bono;
    }
    
}
