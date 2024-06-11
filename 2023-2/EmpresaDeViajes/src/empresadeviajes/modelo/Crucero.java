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
public class Crucero extends Producto{

    private int diasEnAltamar;
    private int diasEnPuerto;
    
    public Crucero(int codigo, String fechaInicio, String fechaFin, 
            float montoSeguro, float montoProducto, float descuento, 
            int cantidadPersonas, Agente agente,
            int diasEnAltamar, int diasEnPuerto) {
        
        super(codigo, fechaInicio, fechaFin, montoSeguro, montoProducto, 
                descuento, cantidadPersonas, agente);
        
        this.diasEnPuerto = diasEnPuerto;
        this.diasEnAltamar = diasEnAltamar;
    }
    
    @Override
    public String toString() {
        return "Tipo: CRUCERO " + "\n" + super.toString();
    }
    
    @Override
    protected float getDescuento() {
       float promedio = (diasEnPuerto + diasEnAltamar) / 2;
       
       return promedio * (float) (Math.random() * (450-350+1) + 350);
    }
    
}
