/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipodefutbol.clases;

/**
 *
 * @author otro3
 */
public class Jugador extends Persona {

    private String posicion;
    private int nroGoles;
    private int nroCamiseta;
    
    public Jugador(String nombres, String apellidos, int edad, String nacionalidad, 
                        int aniosExperiencia, String Equipo, float sueldo,
                        String posicion, int nroGoles, int nroCamiseta ) {
        super(nombres, apellidos, edad, nacionalidad, aniosExperiencia, Equipo, sueldo);
        
        this.posicion = posicion;
        this.nroGoles = nroGoles;
        this.nroCamiseta = nroCamiseta;
    }
    
    public void anotar() {
        System.out.println("GOOOL! HE ANOTADO!");
    }
    
    @Override
    public void celebrar(){
        System.out.println("HE ANOTADO UN GOL!!!!");
    }
    
    @Override
    public String getDatos(){
        return super.getDatos() + "\nRol: JUGADOR.";
    }
    
}
