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
public class Radio extends Aparato implements Receptor {
   private boolean casette;
   private int potencia;

    public boolean isCasette() {
        return casette;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setCasette(boolean casette) {
        this.casette = casette;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Radio(boolean casette, int potencia, String marca, float precio) {
        super(marca, precio);
        this.casette = casette;
        this.potencia = potencia;
    }

    @Override
    public void recibir() {
        System.out.println("Estoy recibiendo senal");    }
   
    
   
}
