/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadeviajes.gestion;
import empresadeviajes.modelo.Producto;
/**
 *
 * @author otro3
 */
public class Empresa {
    private int MAX = 10;
    private String nombre;
    private Producto[] productos;
    private int nroProductos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[MAX];
        this.nroProductos = 0;
    }
    
    public void registro(Producto producto) {
        if (nroProductos < MAX) {
            this.productos[nroProductos] = producto;
            this.nroProductos++;
        }
    }
    
    public void imprimirProductos() {
        System.out.println("PRODUCTOS REGISTRADOS");
        System.out.println("---------------------");
        for(int i = 0; i < nroProductos; i++){
            System.out.println(this.productos[i].toString());
            System.out.println("*********************");
        }
    }
    
    public float getMontoTotalAcumulado() {
        float acumulado = 0;
        
        for(int i = 0; i < nroProductos; i++){
            acumulado += this.productos[i].getMontoAPagar();
        }
        
        return acumulado;
    }
}
