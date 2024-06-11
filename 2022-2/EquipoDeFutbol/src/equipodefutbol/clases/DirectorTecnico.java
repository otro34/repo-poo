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
public class DirectorTecnico extends Persona {

    private String estiloDeJuego;
    private int campeonatos;
    
    public DirectorTecnico(String nombres, String apellidos, int edad, String nacionalidad, 
                            int aniosExperiencia, String Equipo, float sueldo,
                            String estiloDeJuego, int campeonatos) {
        super(nombres, apellidos, edad, nacionalidad, aniosExperiencia, Equipo, sueldo);
        
        this.estiloDeJuego = estiloDeJuego;
        this.campeonatos = campeonatos;
        
    }
    
    @Override
    public String getDatos(){
        return super.getDatos() + "\nRol: DIRECTOR TECNICO.";
    }

    public void setEstiloDeJuego(String estiloDeJuego) {
        this.estiloDeJuego = estiloDeJuego;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    
    public String getEstiloDeJuego() {
        return estiloDeJuego;
    }

    public int getCampeonatos() {
        return campeonatos;
    }
    
   
    
}
