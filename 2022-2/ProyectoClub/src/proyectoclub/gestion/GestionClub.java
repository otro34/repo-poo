/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclub.gestion;

import proyectoclub.clases.Persona;

/**
 *
 * @author otro3
 */
public class GestionClub {
    private int MAXX_PERSONAS = 30;
    private String nombre;
    private Persona[] personas;
    private int nroPersonas;
    private float montoFinal;
    
    
    public GestionClub(String nombre) {
        this.nombre = nombre;
        this.personas = new Persona[MAXX_PERSONAS];
    }

    public void ingresar(Persona persona) {
        
        persona.calcularTotalFacturado();
        
        if (persona != null 
                && this.nroPersonas < MAXX_PERSONAS) {
            this.personas[nroPersonas] = persona;
            nroPersonas++;
        }
        
        
    }
    
    private void calcularMontoFinal() {

        for(Persona persona : personas) {
            if (persona != null) {
                this.montoFinal += persona.getMontoFacturado();
            }
        }
        
    }

    public void imprimirMontoFinal() {
        this.calcularMontoFinal();
        
        System.out.println("Monto FINAL TOTAL: " + this.montoFinal);
    }

    public void imprimirPersonas() {
        
        System.out.println("LISTADO DE INGRESOS A CLUB");
        
        for(Persona persona : personas) {
            if (persona != null) {
                System.out.println(persona.getDatos());
            }
        }
    }
    
}
