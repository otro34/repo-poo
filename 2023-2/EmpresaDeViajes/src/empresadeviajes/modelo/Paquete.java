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
public class Paquete extends Producto{

    private int diasTotalesDuracion;
    private int cantidadPaises;
    
    public Paquete(int codigo, String fechaInicio, String fechaFin, float montoSeguro, 
            float montoProducto, float descuento, int cantidadPersonas, Agente agente,
            int diasTotalesDuracion, int cantidadPaises) {
        
        super(codigo, fechaInicio, fechaFin, montoSeguro, montoProducto, 
                descuento, cantidadPersonas, agente);
        
        this.diasTotalesDuracion = diasTotalesDuracion;
        this.cantidadPaises = cantidadPaises;
    }
    
    @Override
    public String toString() {
        return "Tipo: PAQUETE " + "\n" + super.toString();
    }
    
     @Override
    protected float getDescuento() {

        if (diasTotalesDuracion < 3) {
            return 0;
        } else if (diasTotalesDuracion >=4 && diasTotalesDuracion<= 8) {
            return (float) (Math.random() * (450-250+1) + 250);
        } else if (diasTotalesDuracion > 8) {
            return this.montoProducto * 1.35f;
        }
        return 0;
    }
    
}
