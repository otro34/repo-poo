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
public class Aparato {
    protected String marca;
    protected float precio;

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Aparato(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }
    
    
}
