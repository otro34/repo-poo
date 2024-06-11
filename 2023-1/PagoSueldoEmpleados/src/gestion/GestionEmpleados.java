/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import modelo.Empleado;

/**
 *
 * @author otro3
 */
public class GestionEmpleados {
    
    private int MAX_EMPLEADO = 3;
    private Empleado[] empleados;
    private int nroEmpleados;
    
    public GestionEmpleados() {
        this.empleados = new Empleado[MAX_EMPLEADO];
        this.nroEmpleados = 0;
    }
    
    public void insert(Empleado empleado) {
        if (empleado != null && 
                this.nroEmpleados < this.MAX_EMPLEADO) {
            this.empleados[this.nroEmpleados] = empleado;
            this.nroEmpleados++;
        }
    }
    
    public void calcularSueldoEmpleados() {
        for(Empleado empleado:empleados) {
            empleado.calcularSueldo();
            System.out.println(empleado.toString());
        }
    }
}
