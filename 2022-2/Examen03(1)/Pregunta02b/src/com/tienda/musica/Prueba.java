/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tienda.musica;
import com.tienda.musica.clases.Cancion;
import com.tienda.musica.gestion.Tienda;
/**
 *
 * @author jromaina
 */
public class Prueba {

    public static void main(String[] args) {
        Cancion objCancion1 = new Cancion("BTS","Dynamite",2020,1700);
        Cancion objCancion2 = new Cancion("BTS","Butter",2020,3200);
        Cancion objCancion3 = new Cancion("Twice","What is love",2018,512);
        Cancion objCancion4 = new Cancion("Girls Generation","Genie",2009,9345);
        Cancion objCancion5 = new Cancion("Black Pink","How you like that",2015,5341);
        
        Cancion[] canciones = new Cancion[]{objCancion1,objCancion2,objCancion3,objCancion4,objCancion5};
        
        Tienda objtienda = new Tienda("K-POP CRAZY", "www.kpcrazy.com",canciones);
        
        //USAR METODOS DE TIENDA
        
    }
}
