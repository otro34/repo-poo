/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.tiendaonline.clases;

/**
 *
 * @author otro3
 */
public abstract class Producto {
    private String codigoInventario;
    private float precio;
    private int stock;
    private String pais;

    public Producto(float precio, int stock, String pais) {
        this.codigoInventario = this.generarCodigo();
        this.precio = precio;
        this.stock = stock;
        this.pais = pais;
    }

    public String getCodigoInventario() {
        return codigoInventario;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getPais() {
        return pais;
    }
    
    private String generarCodigo() {
        int random =  (int) Math.floor(Math.random()*1000+100);
        return "INT-"+random;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + this.codigoInventario + ", Precio: " + this.precio + ""
                + ", Stock: " + this.stock + ", Pais: " + this.pais;
    }
}
