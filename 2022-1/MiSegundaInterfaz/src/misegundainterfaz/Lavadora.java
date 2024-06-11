/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misegundainterfaz;

/**
 *
 * @author otro3
 */
public class Lavadora extends Aparato{
    private float alto;
    private float ancho;

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public Lavadora(float alto, float ancho, String marca, float precio) {
        super(marca, precio);
        this.alto = alto;
        this.ancho = ancho;
    }
    
    
}
