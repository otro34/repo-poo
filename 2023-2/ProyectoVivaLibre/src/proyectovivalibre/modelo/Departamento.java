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
public class Departamento extends Inmueble {
    private float precioBase;
    private float impuestoSobrePrecioBase = 0.25f;
    private int nroPiso;
    private float descuentoDelTotal = 0.07f;
    
    public Departamento(float area, float precioBase, int nroPiso) {
        super(area);
        
        this.precioBase = precioBase;
        this.nroPiso = nroPiso;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nPrecio Base: $" + this.precioBase + 
                "\nNro de Piso: " + this.nroPiso + 
                "\nTipo: Departamento";
    }
    
    @Override
    public float getTotal() {
        
        this.precioBase = this.area > 170 ? this.precioBase * 1.20f : this.precioBase;
        float total = this.precioBase + (this.precioBase * this.impuestoSobrePrecioBase);
        float descuento = this.nroPiso >=3 ? total * this.descuentoDelTotal : 0;
        
       /*
        La linea 35 es igual a las lineas de mas abajo. 
        float descuento = 0;
        if (this.nroPiso >=3){
            descuento = total * this.descuentoDelTotal;
        }
        */
        
        return total - descuento;
        
        
    }
}
