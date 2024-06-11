/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmorasedano;

public class DocenteOrdinario extends Docente{
    
    public DocenteOrdinario(int correlativo){
        super();
        this.codigo = "DO-" + correlativo;
    }
    
    public String[] cursos;
    
    public String[] getCursos(){
        return this.cursos;
    }
    
    public void setCursos(String[] cursos){
        this.cursos = cursos;
    }
    
    public void asignarSueldo(){
        this.sueldo = this.sueldo - 100;
    }
    
    
}
