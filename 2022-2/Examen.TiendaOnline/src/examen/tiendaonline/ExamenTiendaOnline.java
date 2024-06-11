/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.tiendaonline;
import examen.tiendaonline.gestion.GestionTiendaOnline;
import examen.tiendaonline.clases.*;

/**
 *
 * @author otro3
 */
public class ExamenTiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionTiendaOnline tienda = new GestionTiendaOnline();
        
        for(int i = 0; i<250; i++) {
            Producto objProducto1 = new ArticuloBazar("Secadora de cabello"+i,"Xiaomi",false,100.0f,10,"China");
            tienda.registrarProducto(objProducto1);
            Producto objProducto2 = new ArticuloBelleza("Shampoo","Loreal"+i,"22-02-2024",90.0f,10,"Estados Unidos");
            tienda.registrarProducto(objProducto2);
            Producto objProducto3 = new Libro("La odisea"+i,"Homero","70",100.0f,20,"Grecia");
            tienda.registrarProducto(objProducto3);
            Producto objProducto4 = new Videojuego("God of War Ragnarok","Sony", "2022","PS5",100.0f,30,"Japón");
            tienda.registrarProducto(objProducto4);
        }
        
        tienda.printProductos();
        
        Venta venta1 = new Venta("Juan", "Romaina", "AV S/N 123", "10-11-2022");
        ItemVenta item1 = new ItemVenta("INT-870",1);
        ItemVenta item2 = new ItemVenta("INT-601",2);
       
        
        tienda.registrarItemVenta(venta1, item1);
        tienda.registrarItemVenta(venta1, item2);
        
        tienda.registrarVenta(venta1);
        
        tienda.printVentas();
                
    }
    
}
