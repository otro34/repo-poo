/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import extensiones.Cargo;
import extensiones.TipoEmpleado;

/**
 *
 * @author otro3
 */
public class Administrativo extends Empleado {

    private Cargo cargo;
    
    public Administrativo(String nombreCompleto, String direccion, 
            double sueldoBasico, Cargo cargo) {
        super(nombreCompleto, direccion, sueldoBasico);
        this.cargo = cargo;
        this.tipo = TipoEmpleado.A;
    }
    
    @Override
    public void calcularSueldo() {
        double bono = 0;
        
        switch(cargo) {
            case Secretaria:
                bono = 30;
                break;
            case JefeDeSeccion:
                bono = (this.sueldoBasico * 0.05) + 150;
                break;
            case Gerente:
                bono = (this.sueldoBasico * 0.1) + 300;
                break;
        }
        
        this.sueldoFinal = this.sueldoBasico + bono;
    }
    
}
