/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divercity.gestion;
import divercity.clases.Ciudadano;
import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class Divercity {
    private int MAX_CIUDADANOS = 3;
    
    private String pais;
    private Ciudadano[] personas;
    private int nroPersonas;

    public Divercity(String pais) {
        this.pais = pais;
        this.personas = new Ciudadano[MAX_CIUDADANOS];
        this.nroPersonas = 0;
    }
    
    public void ingresarCiudadano(Ciudadano ciudadano){
        if (ciudadano != null &&
            this.buscar(ciudadano.getCui()) == null &&
            this.nroPersonas < MAX_CIUDADANOS) {
                this.personas[this.nroPersonas] = ciudadano;
                this.nroPersonas++;
        } else {
            System.out.println("ERROR INGRESANDO CIUDADANO.");
        }
    }
    
    public void printTodosLosCiudadanos() {
        for(Ciudadano ciudadano:this.personas){
            if (ciudadano != null) {
                System.out.println(ciudadano.getDetalleC());
            }
        }
    }
    
    public Ciudadano buscarPorTeclado() {
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Ingrese CUI para la búsqueda: ");
        int cui = objScanner.nextInt();
        
        return this.buscar(cui);
    }
    
    public Ciudadano buscar(int cui) {
                
        for(Ciudadano ciudadano:this.personas) {
            if (ciudadano != null && ciudadano.getCui() == cui) return ciudadano;
        }
        return null;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPersonas(Ciudadano[] personas) {
        this.personas = personas;
    }

    public void setNroPersonas(int nroPersonas) {
        this.nroPersonas = nroPersonas;
    }
    
    public String getPais() {
        return pais;
    }

    public Ciudadano[] getPersonas() {
        return personas;
    }

    public int getNroPersonas() {
        return nroPersonas;
    }
    
    
    
}
