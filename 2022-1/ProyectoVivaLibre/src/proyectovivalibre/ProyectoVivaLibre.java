/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovivalibre;

import proyectovivalibre.negocio.Casa;
import proyectovivalibre.negocio.Departamento;
import proyectovivalibre.negocio.Inmueble;
import proyectovivalibre.negocio.Inmobiliaria;

/**
 *
 * @author otro3
 */
public class ProyectoVivaLibre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inmobiliaria objInmobiliaria = new Inmobiliaria ("Viva-Libre");
        
        Inmueble[] ventas = new Inmueble[30];
        
        ventas[0] = new Departamento(120000,13,120);
        ventas[0] = new Casa(1200,120);
        
        objInmobiliaria.imprimirVentas();
        objInmobiliaria.imprimirTotalVentas();
    }
    
}
