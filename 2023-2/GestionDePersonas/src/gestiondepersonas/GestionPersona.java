/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonas;

/**
 *
 * @author otro3
 */
public class GestionPersona {
    private static final int MAX = 10;
    private Persona[] arrPersonas;
    private int nroPersonas;
    
    public GestionPersona() {
        this.arrPersonas = new Persona[MAX];
        this.nroPersonas = 0;
    }
    
    public void mostrarPersonas() {
        /*
        for(Persona persona: arrPersonas) {
            if (persona != null)
                System.out.println(persona.toString());
        }*/
        for (int i = 0; i < this.nroPersonas; i++) {
            System.out.println(arrPersonas[i].toString());
        }
    }
    
    public void agregar(Persona persona) {
        if (this.nroPersonas < MAX) {
            this.arrPersonas[nroPersonas] = persona;
            this.nroPersonas++;
        }
    }
    
    public void eliminar(int pos) {
        if (pos >= 0 && pos < this.nroPersonas) {
            for (int i = pos; i < this.nroPersonas - 1; i++) {
                this.arrPersonas[i] = this.arrPersonas[i + 1];
            }
            this.nroPersonas--;
        }
    }
    
    /*Buscar a una persona por su DNI*/
    
    public int buscar(String dni) {
      for(int i = 0; i < this.nroPersonas; i++) {
          if (this.arrPersonas[i].getDni().equals(dni)) {
              return i;
          }
      }  
      return -1;
    }
    
    /* Método para ordenar por Ciudad de Nacimiento*/
    
    public void ordenarPorCiudadDeNacimiento() {
        for(int i = 0; i < this.nroPersonas -1; i++) {
            for (int j = 0; j < this.nroPersonas - 1; j++) {
                if (this.arrPersonas[j]
                        .getCiudadDeNacimiento()
                        .compareTo(this.arrPersonas[j+1].getCiudadDeNacimiento()) > 0){
                    Persona aux = this.arrPersonas[j];
                    this.arrPersonas[j] = this.arrPersonas[j+1];
                    this.arrPersonas[j+1] = aux;
                }
            }
        }
    }
    
    /* Método para ordenar por nombre */
    
    /* Método que devuelva el objeto en la posición i*/
    
    /* Método que muestre a las personas por su lugar de nacimiento*/
    
    /* Método que cuente el numero de personas por lugar de nacimiento */ 
}
