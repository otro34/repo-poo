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
public class RopaParaAdolescentes extends Categoria implements CalculadorDeCosto {

    private float costo;

    public RopaParaAdolescentes(Talla talla, String color) {
        super(talla, color);
    }
    
    public float getCosto() {
        return costo;
    }
    
    @Override
    public void generarCantidadDeInventario() {
        super.cantidadEnInventario = Aleatorio.obtenerNumeroAleatorio(220, 380);
    }

    @Override
    public void calcularCosto() {
        
        int costo = 1;
        
        while(costo%6!=0) {
            costo = (int)(Math.random()*50+250);
        }
        
        this.costo = costo;
    }

    @Override
    public String ToString() {
        return "Codigo: " + super.codigo + ", Tipo: Ropa para Adolescentes, Cantidad en Stock: " + super.cantidadEnInventario;
    }
    
}
