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
public class Tv extends Aparato implements Receptor{
    private int pulgadas;
    private int antiguedad;

    public Tv(int pulgadas, int antiguedad, String marca, float precio) {
        super(marca, precio);
        this.pulgadas = pulgadas;
        this.antiguedad = antiguedad;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void recibir() {
        System.out.println("Estoy recibiendo senal");
    }
    
    
}
