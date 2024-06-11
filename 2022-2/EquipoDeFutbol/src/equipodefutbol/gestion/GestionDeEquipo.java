/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipodefutbol.gestion;
import equipodefutbol.clases.Persona;
        
/**
 *
 * @author otro3
 */
public class GestionDeEquipo {
    private Persona[] personas;
    private int nroPersonas;
    private String equipo;
    private int MAXX=4;

    public GestionDeEquipo(String equipo) {
        this.equipo = equipo;
        this.personas = new Persona[this.MAXX];
        this.nroPersonas = 0;
    }
    
    public void insertar (Persona objPersona){
        if (this.nroPersonas < this.MAXX){
            this.personas[this.nroPersonas] = objPersona;
            this.nroPersonas++;
        } else System.out.println("MAXIMO DE PERSONAS ALCANZADO");
            
    }
    
    public void imprimirPersonas() {
        for(Persona objPersona:personas) {
            System.out.println(objPersona.getDatos());
            System.out.println("");
        }
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public int getNroPersonas() {
        return nroPersonas;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getMAXX() {
        return MAXX;
    }
    
    
    
    
    
    
}
