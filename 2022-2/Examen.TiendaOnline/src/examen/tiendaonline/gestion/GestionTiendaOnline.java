/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.tiendaonline.gestion;
import examen.tiendaonline.clases.Producto;
import examen.tiendaonline.clases.Venta;
import examen.tiendaonline.clases.ItemVenta;

/**
 *
 * @author otro3
 */
public class GestionTiendaOnline {
    private int MAX_PRODUCTOS = 1000;
    private int MAX_VENTAS = 10;
    private Producto[] productosEnInventario;
    private Venta[] ventas;
    private int nroProductos = 0;
    private int nroVentas = 0;
    
    public GestionTiendaOnline() {
        this.productosEnInventario = new Producto[MAX_PRODUCTOS];
        this.ventas = new Venta[MAX_VENTAS];
    }
    
    public void registrarProducto(Producto producto) {
        if (producto != null && this.nroProductos < this.MAX_PRODUCTOS) {
            this.productosEnInventario[this.nroProductos] = producto;
            this.nroProductos++;
        }
    }
    
    public void registrarVenta(Venta venta){
        if (venta != null && this.nroVentas < this.MAX_VENTAS) {
            this.ventas[this.nroVentas] = venta;
            this.nroVentas++;
        }
    }
    
    public void registrarItemVenta(Venta venta, ItemVenta item) {
        Producto producto = this.verificarStock(item.getCodigo());
        
        if (producto != null) {
            venta.agregarItem(item);
        } else System.out.println("ITEM NO ENCONTRADO! - " + item.getCodigo());
    }
    
    public Producto verificarStock(String codigo) {
        for(Producto producto: this.productosEnInventario){
            if (producto != null) {
                if (producto.getCodigoInventario().equals(codigo))
                    return producto;
            }
        }
        return null;
    }
    
    public void printProductos() {
        for(Producto producto: this.productosEnInventario) {
            if (producto != null) {
                System.out.println(producto.toString());
            }
        }
    }
    
    public void printVentas() {
        for(Venta venta: this.ventas) {
            if (venta != null) {
                System.out.println(venta.toString());
            }
        }
    }
}
