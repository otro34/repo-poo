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
public class Gerente extends Persona {
    private boolean tieneMBA;
    
    public Gerente(String nombres, String apellidos, int edad, String nacionalidad, 
            int aniosExperiencia, String Equipo, float sueldo,
            boolean tieneMBA) {
        super(nombres, apellidos, edad, nacionalidad, aniosExperiencia, Equipo, sueldo);
        
        this.tieneMBA = tieneMBA;
    }
    
    public void contratar() {
        System.out.println("HE CONTRATADO UN JUGADOR");
    }
    
    @Override
    public String getDatos(){
        return super.getDatos() + "\nRol: GERENTE.";
    }
    
}
