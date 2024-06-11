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
public class Producto {
    protected int codigo;
    protected String fechaInicio;
    protected String fechaFin;
    protected float montoSeguro;
    protected float montoProducto;
    protected int cantidadPersonas;
    protected float descuento;
    protected Agente agente;

    public Producto(int codigo, String fechaInicio, String fechaFin, float montoSeguro, float montoProducto, float descuento, 
                    int cantidadPersonas, Agente agente) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoSeguro = montoSeguro;
        this.montoProducto = montoProducto;
        this.descuento = descuento;
        this.cantidadPersonas = cantidadPersonas;
        this.agente = agente;
    }
    
    public String toString() {
        return "Codigo: " + codigo +
                "\nFecha de Inicio: " + fechaInicio + 
                "\nFecha de Fin: " + fechaFin +
                "\nMonto de Seguro: " + montoSeguro + 
                "\nMonto de Producto: " + montoProducto + 
                "\nCantidad de Personas: " + cantidadPersonas + 
                "\nDescuento: " + getDescuento() + 
                "\nAgente: " + agente.toString();
    }
    
    protected float getDescuento() {
        return 0;
    }
    
    public float getMontoAPagar() {
        return this.montoProducto - getDescuento();
    }
    
}
