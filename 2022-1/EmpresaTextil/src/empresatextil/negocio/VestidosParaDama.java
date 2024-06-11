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
public class VestidosParaDama extends Categoria {

    private boolean requiereCobertor;
    
    public VestidosParaDama(Talla talla, String color) {
        super(talla, color);
        
        this.requiereCobertor = this.requiereCobertor();
    }

    @Override
    public void generarCantidadDeInventario() {
        super.cantidadEnInventario = Aleatorio.obtenerNumeroImparAleatorio(160, 290);
    }
    
    private boolean requiereCobertor() {
        return super.getTalla().equals(Talla.L);
    }
    
    @Override
    public String ToString() {
        return "Codigo: " + super.codigo + ", Tipo: Vestido Para Damas, Cantidad en Stock: " + super.cantidadEnInventario;
    }
    
}
