/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatextil.negocio;
import empresatextil.helpers.Aleatorio;
/**
 *
 * @author otro3
 */
public class Terno extends Categoria implements CalculadorDeCosto {

    private float costo;
    
    public Terno(Talla talla, String color) {
        super(talla, color);
    }

    @Override
    public void generarCantidadDeInventario() {
        this.cantidadEnInventario = Aleatorio.obtenerNumeroParAleatorio(120, 270);
    }

    @Override
    public void calcularCosto() {    
        int costo = 1;
        
        while(costo%7!=0) {
            costo = (int)(Math.random()*50+250);
        }
        
        this.costo = costo;
    }
    
    @Override
    public String ToString() {
        return "Codigo: " + super.codigo + ", Tipo: Terno, Cantidad en Stock: " + super.cantidadEnInventario;
    }
    
}
