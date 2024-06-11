/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author otro3
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personaje personaje1 = new Personaje("Kitana", "Ninja");
        Personaje personaje2 = new Personaje("Liu Kang", "Guerrero");
        Personaje personaje3 = new Personaje("Baraka", "Monstruo");
        
        personaje1.atacar(personaje2);
        int turno = 1;
        while (personaje1.getVida() > 0 && personaje2.getVida() > 0) {
            System.out.println("Inicia Turno " + turno);
            System.out.println("Personaje 1 Ataca!");
            if (turno % 2 == 0) {
                personaje1.atacar(personaje2);
            } else
                personaje1.atacar(personaje2, personaje3);
            
            System.out.println("Vida de Personaje 2: " + personaje2.getVida());
            
            System.out.println("Personaje 2 Ataca!");
            if (turno % 2 == 0) {
                personaje2.atacar(personaje1);
            } else
                personaje2.atacar(personaje1, personaje3);
            
            System.out.println("Vida de Personaje 1: " + personaje1.getVida());
            turno++;
        }
        
        if (personaje1.getVida() > 0 )
            System.out.println("Gana personaje 1!");
        else
            System.out.println("Gana personaje 2!");
        
        System.out.println("GAME OVER");
    }
    
}
