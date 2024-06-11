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
public class ArticuloBelleza extends Producto implements Etiquetador {
    private String descripcion;
    private String marca;
    private String fechaVencimiento;
    private String etiqueta;

    public ArticuloBelleza(String descripcion, String marca, String fechaVencimiento,float precio, int stock, String pais) {
        super(precio, stock, pais);
        this.descripcion = descripcion;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public void generarEtiqueta() {
        this.etiqueta = "ITEM APROBADO POR MINSA. Fecha de Vencimiento: " + this.fechaVencimiento;
    }
    
    
}
