/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipodefutbol;
import equipodefutbol.clases.Persona;
import equipodefutbol.clases.DirectorTecnico;
import equipodefutbol.clases.Jugador;
import equipodefutbol.clases.Gerente;

import equipodefutbol.gestion.GestionDeEquipo;
/**
 *
 * @author otro3
 */
public class EquipoDeFutbolPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionDeEquipo equipo = new GestionDeEquipo("Bayern Munchen");
        
        DirectorTecnico dt = new DirectorTecnico("Juan","Flores",20,"Argentino",4,"PSV",10000.00f,"Defensivo",5);
        Jugador j = new Jugador("Arjen","Robben",30,"Holandés",15,"Bayern Munchen",15000.00f,"Extremo Derecho", 1000,7);
        Jugador j2 = new Jugador("Frank","Ribery",30,"Francés",15,"Bayern Munchen",15000.00f,"Extremo Derecho", 1000,7);
        Gerente g = new Gerente("John", "Doe",57,"Holandés",20,"PSV",25000.00f,true);
        
        equipo.insertar(dt);
        equipo.insertar(j);
        equipo.insertar(j2);
        equipo.insertar(g);
        
        System.out.println("EL EQUIPO TIENE " + equipo.getNroPersonas() + " miembros.");
        System.out.println("");
        
        equipo.imprimirPersonas();
        
        
        
        
    }
    
}
