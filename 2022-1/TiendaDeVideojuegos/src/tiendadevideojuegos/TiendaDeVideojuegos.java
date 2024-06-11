/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadevideojuegos;

import java.util.Scanner;
import tiendadevideojuegos.negocio.Tienda;
import tiendadevideojuegos.negocio.Videojuego;

/**
 *
 * @author otro3
 */
public class TiendaDeVideojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Videojuego[] arrVideojuegos = new Videojuego[10];
        
        arrVideojuegos[0] = new Videojuego(1,"Metal Gear Solid 4: Guns of the patriots","Konami",10,39,"Playstation 3");
        arrVideojuegos[1] = new Videojuego(2,"Super Mario Galaxy","Nintendo",11,29,"Nintendo Wii");
        arrVideojuegos[2] = new Videojuego(3,"Chrono Trigger","Square",1,499,"Super Nintendo");
        arrVideojuegos[3] = new Videojuego(4,"Donkey Kong Country","Rare",3,199,"Super Nintendo");
        arrVideojuegos[4] = new Videojuego(5,"Super Mario Odissey","Nintendo",4,59,"Nintendo Switch");
        arrVideojuegos[5] = new Videojuego(6,"The Legen Of Zelda: A Link To The Past","Nintendo",1,399,"Super Nintendo");
        arrVideojuegos[6] = new Videojuego(7,"Elden Ring","FromSoftware",20,59,"Playstation 5");
        arrVideojuegos[7] = new Videojuego(8,"Fifa 22","EA Sports",50,59,"Playstation 5");
        arrVideojuegos[8] = new Videojuego(9,"God Of War","Sony",5,89,"Playstation 2");
        arrVideojuegos[9] = new Videojuego(10,"The Last Of Us 2","Naughty Dog",20,59,"Playstation 4");
        
        Tienda objTienda = new Tienda("Mi Tiendita De Juegos", "Arenales 123", arrVideojuegos);
        
        System.out.println(objTienda.concatenarDatos());
        
        System.out.println("BUSCAR JUEGO:");
        Scanner objScanner = new Scanner(System.in);
        String nombreJuego = objScanner.nextLine();
        Videojuego juegoBuscado = objTienda.buscarJuego(nombreJuego);
        
        System.out.println("JUEGO ENCONTRADO!");
        System.out.println(juegoBuscado.concantenarDatos());        
        System.out.println("JUEGO MAS CARO:");
        System.out.println(objTienda.buscarJuegoMasCaro().concantenarDatos());
        
        System.out.println("Juegos Disponibles para el Super Nintendo:" + objTienda.titulosPorPlataforma("Super Nintendo"));
        System.out.println("Juegos Disponibles para el Playstation 5:" + objTienda.titulosPorPlataforma("Playstation 5"));
        System.out.println("Juegos Disponibles para el Nintendo Switch:" + objTienda.titulosPorPlataforma("Nintendo Switch"));
        
    }
    
}
