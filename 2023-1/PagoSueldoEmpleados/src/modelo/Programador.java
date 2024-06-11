/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import extensiones.TipoEmpleado;
import extensiones.Grado;

/**
 *
 * @author otro3
 */
public class Programador extends Empleado {
    
    private Grado grado;
    private String[] especialidades;
    
    public Programador(String nombreCompleto, String direccion, 
                        double sueldoBasico, Grado grado,
                        String[] especialidades) {
        super(nombreCompleto, direccion, sueldoBasico);
        this.tipo = TipoEmpleado.P;
        this.grado = grado;
        this.especialidades = especialidades;
    }

    @Override
    public void calcularSueldo() {
        double bono = 0;
        
        switch(grado) {
            case Bachillerato:
                bono = 50;
                break;
            case Técnico:
                bono = 100;
                break;
            case Licenciado:
                bono = 250;
                break;
            case Magister:
                bono = 500;
                break;
        }
        
        this.sueldoFinal = this.sueldoBasico + bono;
    }
    
}
