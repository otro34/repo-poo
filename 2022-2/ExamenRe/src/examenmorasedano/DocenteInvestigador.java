/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmorasedano;

public class DocenteInvestigador extends Docente{
    
    public DocenteInvestigador(int correlativo){
        super();
        this.codigo = "IN-" + correlativo;
    }
    
    public String[] proyectos;
    
    public String[] getProyectos(){
        return this.proyectos;
    }
    
    public void setProyectos(String[] proyectos){
        this.proyectos = proyectos;
    }
    
    public void asignarSueldo(){
        this.sueldo = this.sueldo + 0.05 * this.sueldo;
    }
    
}
