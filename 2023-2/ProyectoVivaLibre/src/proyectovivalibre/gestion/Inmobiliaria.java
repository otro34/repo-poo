/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovivalibre.gestion;
import proyectovivalibre.modelo.*;

/**
 *
 * @author otro3
 */
public class Inmobiliaria {
    private final int MAX = 5;
    private String nombre;
    private Inmueble[] inmuebles;
    private int nroInmuebles;

    public Inmobiliaria(String nombre) {
        this.nombre = nombre;
        inmuebles = new Inmueble[this.MAX];
        nroInmuebles = 0;
    }
    
    public void vender(Inmueble inmueble){
        if (this.nroInmuebles < this.MAX) {
            this.inmuebles[this.nroInmuebles] = inmueble;
            this.nroInmuebles++;
        } else {
            System.out.println("El arreglo está lleno.");
        }
    }
    
    public void mostrarVentas() {
        System.out.println("VENTAS DE INMOBILIARIA: " + this.nombre);
        for (int i = 0; i < this.nroInmuebles; i++) {
            System.out.println("Inmueble Nro. " + i);
            System.out.println(this.inmuebles[i].toString());
            System.out.println("Total Venta: $" + this.inmuebles[i].getTotal());
            System.out.println("----------------");
        }
    }
    
    public float getTotalVentas() {
        float suma = 0;
        for (int i = 0; i < this.nroInmuebles; i++) {
            suma += this.inmuebles[i].getTotal();
        }
        
        return suma;
    }
}
