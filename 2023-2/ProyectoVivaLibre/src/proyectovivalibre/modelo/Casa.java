/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovivalibre.modelo;

/**
 *
 * @author otro3
 */
public class Casa extends Inmueble {
    private float precioMetroCuadrado;
    private final float recargoPorMantenimientoDelTotal = 0.20f;
    
    public Casa(float area, float precioMetroCuadrado) {
        super(area);
        this.precioMetroCuadrado = precioMetroCuadrado;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                "\nPrecio x metro cuadrado: $" + this.precioMetroCuadrado + 
                "\nTipo: Casa";
    }
    
    @Override
    public float getTotal() {
        
        this.precioMetroCuadrado = this.area > 170 ? this.precioMetroCuadrado * 1.07f : this.precioMetroCuadrado;
        
        float total = this.precioMetroCuadrado * this.area;
        float totalConRecargo = total + (total * this.recargoPorMantenimientoDelTotal);
        
        return totalConRecargo;
    }
    
}
