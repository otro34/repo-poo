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
public class ArticuloBazar extends Producto implements Etiquetador{
    
    private String descripcion;
    private String marca;
    private boolean esBiodegradable;
    private String etiqueta = "";

    public ArticuloBazar(String descripcion, String marca, boolean esBiodegradable,float precio, int stock, String pais) {
        super(precio, stock, pais);
        this.descripcion = descripcion;
        this.marca = marca;
        this.esBiodegradable = esBiodegradable;
    }

    @Override
    public void generarEtiqueta() {
        if (this.esBiodegradable == false) {
            this.etiqueta = "ESTE ARTICULO NO USA MATERIALES BIODEGRADABLES.";
        }
    }
    
    
    
}
