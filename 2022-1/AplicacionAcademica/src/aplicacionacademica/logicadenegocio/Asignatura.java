/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionacademica.logicadenegocio;

/**
 *
 * @author otro3
 */
public class Asignatura {

    private String nombre;
    private Alumno[] alumnos;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.alumnos = new Alumno[30];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }
    
    public Alumno buscar(int codigo){
        
        for(Alumno alumno:alumnos) {
            if (alumno != null) {
                if (alumno.getCodigo() == codigo ) {
                    return alumno;
                }
            }
        }
        
        return null;
    }
    
    
    
    
    
    
    
}
