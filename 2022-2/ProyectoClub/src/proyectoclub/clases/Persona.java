/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclub.clases;

/**
 *
 * @author otro3
 */
public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected String medioDePago;
    protected float totalConsumido;
    protected float montoFacturado;
    
    public Persona(String nombre, String dni, String medioDePago, float totalConsumido) {
        this.nombre = nombre;
        this.dni = dni;
        this.medioDePago = medioDePago;
        this.totalConsumido = totalConsumido;
    }
    
    public float getMontoFacturado() {
        return this.montoFacturado;
    }
    
    public abstract void calcularTotalFacturado();
    
    public String getDatos() {
        return "\nNombre: " + this.nombre + ""
                + "\nDNI: " + this.dni + ""
                + "\nMedio de Pago: " + this.medioDePago + ""
                + "\nTotal Consumido: " + this.totalConsumido + ""
                + "\n Monto Facturado: " + this.montoFacturado;
    }
}
