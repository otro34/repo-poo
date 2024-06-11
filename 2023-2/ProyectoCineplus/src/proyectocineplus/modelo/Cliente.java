/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocineplus.modelo;

/**
 *
 * @author otro3
 */
public class Cliente {
     protected int codigoUnico;
    protected String nombre;
    protected String direccion;
    protected float montoMaximoDescuento;
    protected String distrito;

    public Cliente(String nombre, String direccion, float montoMaximoDescuento, String distrito) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.montoMaximoDescuento = montoMaximoDescuento;
        this.distrito = distrito;
        
        generarCodigoUnico();
    }
    
    protected void generarCodigoUnico() {
        this.codigoUnico = 0;
    }
    
    public float getMontoMaximoDescuento() {
        return montoMaximoDescuento;
    }
    
    public String getMembrete() {
        return codigoUnico + "-" + nombre;
    }
           
}
