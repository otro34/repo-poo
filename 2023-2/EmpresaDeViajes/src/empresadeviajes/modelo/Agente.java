/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadeviajes.modelo;

/**
 *
 * @author otro3
 */
public class Agente {
    private String nombre;
    private String codigo;
    private String fechaIngreso;

    public Agente(String nombre, String codigo, String fechaIngreso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
    }
    
    public String toString() {
        return codigo + " - " + nombre + "(Fecha de Ingreso: " + fechaIngreso + ")";
    }
}
