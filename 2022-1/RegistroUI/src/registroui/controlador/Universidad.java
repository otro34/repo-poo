/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroui.controlador;

import java.util.ArrayList;
import registroui.modelo.Alumno;

/**
 *
 * @author ProfL3401
 */
public class Universidad {
    private ArrayList<Alumno> alumnos;

    public Universidad() {
        this.alumnos = new ArrayList();
    }
    
    public Alumno insertar(Alumno alumno) {
        alumno.setCodigo(((Integer)(alumnos.size()+1)).toString());
        alumnos.add(alumno);
        return alumno;
    }
    
    public Alumno buscar(String codigo) {
        for(Alumno alm:alumnos) {
            if (alm.getCodigo().equals(codigo))
                return alm;
        }
        return null;
    }
    
    public Alumno modificar(Alumno alumnoModificado) {
        Alumno alumnoBuscado = this.buscar(alumnoModificado.getCodigo());
        int index = 0;
        if (alumnoBuscado != null) {
            index = alumnos.indexOf(alumnoBuscado);
            alumnos.set(index,alumnoModificado);
            return alumnos.get(index);
        }
        
        return null;
    }
    
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    
}
