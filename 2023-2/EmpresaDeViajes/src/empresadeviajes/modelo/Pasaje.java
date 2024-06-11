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
public class Pasaje extends Producto{
    private String lineaAerea;
    private String aeropuertoLlegada;
    private boolean esAerolineaExtranjera;

    public Pasaje(int codigo, String fechaInicio, String fechaFin, 
            float montoSeguro, float montoProducto, float descuento, 
            int cantidadPersonas, Agente agente, 
            String lineaAerea, String aeropuertoLlegada, boolean esAerolineaExtranjera) {
        
        super(codigo, fechaInicio, fechaFin, montoSeguro, montoProducto, 
                descuento, cantidadPersonas, agente);
        
        this.lineaAerea = lineaAerea;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.esAerolineaExtranjera = esAerolineaExtranjera;
    }
    
    @Override
    public String toString() {
        return "Tipo: PASAJE " + "\n" + super.toString();
    }
    
    @Override
    protected float getDescuento() {
        if (!esAerolineaExtranjera) {
            return (float) (Math.random() * (350-200+1) + 200);
        }
        return 0;
    }
    
    
}
