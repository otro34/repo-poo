/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroui.helpers;
import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class Validacion {
    private boolean valido;
    private ArrayList<String> mensajes;

    public Validacion(boolean esValid, ArrayList<String> mensajes) {
        this.valido = esValid;
        this.mensajes = mensajes;
    }

    public boolean isValido() {
        return valido;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setEsValid(boolean valido) {
        this.valido = valido;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }
    
}
