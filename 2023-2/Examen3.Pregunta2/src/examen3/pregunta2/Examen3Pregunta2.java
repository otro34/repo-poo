/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3.pregunta2;

import examen3.pregunta2.gestion.TiendaDeMusica;
import examen3.pregunta2.modelo.Album;
import examen3.pregunta2.modelo.Single;
import examen3.pregunta2.modelo.Venta;

/**
 *
 * @author otro3
 */
public class Examen3Pregunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TiendaDeMusica tienda = new TiendaDeMusica("Amazon Music");
        
        Single single1 = new Single("I want i that way", "Backstreet Boys", 1999, null, 19.99f, true);
        Single single2 = new Single("Its My Life", "Jon Bon Jovi", 2000, null, 14.99f, true);
        Single single3 = new Single("I don't want to miss a thing", "Aerosmith", 1997, null, 12.99f, true);
        Single single4 = new Single("Domitila", "Gianmarco", 1989, null, 10.99f, true);
        Single single5 = new Single("Bye,Bye,Bye", "NSync", 2000, null, 18.99f, false);
        
        Album album1 = new Album("Millenium", "Backstreet Boys", 1999, null, 20.99f, false);
        Album album2 = new Album("Mizzundastood", "Pink", 1999, null, 20.99f, false);
        Album album3 = new Album("Crazy", "Aerosmith", 1992, null, 20.99f, false);
        Album album4 = new Album("Westlife", "Westlife", 1999, null, 21.99f, true);
        Album album5 = new Album("Backstreets Back", "Backstreet Boys", 1998, null, 20.99f, false);
        
        tienda.agregarProducto(single1);
        tienda.agregarProducto(single2);
        tienda.agregarProducto(single3);
        tienda.agregarProducto(single4);
        tienda.agregarProducto(single5);
        
        tienda.agregarProducto(album1);
        tienda.agregarProducto(album2);
        tienda.agregarProducto(album3);
        tienda.agregarProducto(album4);
        tienda.agregarProducto(album5);
        
        Venta venta1 = new Venta("Juan Perez", "00998877", single2, true);
        Venta venta2 = new Venta("Rosangela Lopez", "11334411", single2, true);
        Venta venta3 = new Venta("Luis Marin", "22334455", album4, false);
        Venta venta4 = new Venta("Felipe Sanchez", "11223377", album4, false);
        Venta venta5 = new Venta("Ricardo Peralta", "44556677", album1, false);
        
        tienda.agregarVenta(venta1);
        tienda.agregarVenta(venta2);
        tienda.agregarVenta(venta3);
        tienda.agregarVenta(venta4);
        tienda.agregarVenta(venta5);
        
        System.out.println("----------------------");
        
        System.out.println("El total de las ventas es: " + tienda.getTotalVentas());
        System.out.println("El single mas caro es: " + tienda.getSingleMasCaro().toString());
        System.out.println("El album con mas ventas es: " + tienda.getAlbumConMasVentas().toString());
        
    }
    
}
