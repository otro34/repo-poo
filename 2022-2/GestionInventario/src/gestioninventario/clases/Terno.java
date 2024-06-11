/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventario.clases;
import gestioninventario.helper.HelperAleatorio;
import java.util.Random;

/**
 *
 * @author profo1601
 */
public class Terno extends Vestimenta implements CalculadorDeCostos {
    private float costoConfeccion;
    
    public Terno(String talla, String color) {
        super(talla, color);
        this.cantidad = this.calcularInventario();
        this.costoConfeccion = this.calcularCostoConfeccion();
    }

    @Override
    protected int calcularInventario() {
        return HelperAleatorio.getNumeroAleatorioPar(120, 270);
    }

    @Override
    public float calcularCostoConfeccion() {
        Random rand = new Random();
        
        return MIN_COSTO + rand.nextInt((MAX_COSTO-MIN_COSTO)/7)*7;
    }
    
        
    @Override
    public String getDatos() {
        return super.getDatos() + ", TIPO: TERNO, COSTO CONFECCION: " + this.costoConfeccion;
    }
    
}
