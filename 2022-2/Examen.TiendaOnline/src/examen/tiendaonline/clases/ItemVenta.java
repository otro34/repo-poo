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
public class ItemVenta {
    private String codigo;
    private float precio;
    private int cantidad;

    public ItemVenta(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "Codigo: " + this.codigo + " ,Precio: " + this.precio + " ,Cantidad:" + this.cantidad;
    }
    
    
}
