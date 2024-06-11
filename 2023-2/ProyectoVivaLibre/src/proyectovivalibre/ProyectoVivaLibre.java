/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovivalibre;
import proyectovivalibre.modelo.Casa;
import proyectovivalibre.modelo.Departamento;
import proyectovivalibre.gestion.Inmobiliaria;

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
        Casa casa1 = new Casa(170, 1200);
        Casa casa2 = new Casa(200,1000);
        Casa casa3 = new Casa(140,850);
        Departamento dpto1 = new Departamento(200, 250000, 3);
        Departamento dpto2 = new Departamento(180, 210000, 3);

        //Crear un objeto gestion
        
        Inmobiliaria inmoVivaLibre = new Inmobiliaria("Viva-Libre");
        
        inmoVivaLibre.vender(casa1);
        inmoVivaLibre.vender(casa2);
        inmoVivaLibre.vender(casa3);
        inmoVivaLibre.vender(dpto1);
        inmoVivaLibre.vender(dpto2);
        
        inmoVivaLibre.mostrarVentas();
        
        System.out.println("TOTAL DE VENTAS: $" + inmoVivaLibre.getTotalVentas());
    }
    
}
