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
public abstract class Categoria {
    protected Talla talla;
    protected String color;
    protected String codigo;
    protected int cantidadEnInventario;

    public Categoria(Talla talla, String color) {
        this.talla = talla;
        this.color = color;
        this.codigo = this.generarCodigo();
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Talla getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }
    
    private String generarCodigo(){
        return "INV-" + (int)(Math.random()*60+80);
    }
    
    public void ajustarCantidadDeInventario() {
        int divisor = Aleatorio.obtenerNumeroParAleatorio(10, 20);
        
        this.cantidadEnInventario = (int) this.cantidadEnInventario/divisor;
        
    }
    
    public abstract void generarCantidadDeInventario();
    
    public abstract String ToString();  
}
