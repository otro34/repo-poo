/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeducativa.clases;

/**
 *
 * @author otro3
 */
public class DocenteInvestigador extends Docente{

    private String[] proyectos;
    
    public DocenteInvestigador(String nombres, String dni, int aniosEmpresa, int edad, boolean esActivo) {
        super(nombres,dni,aniosEmpresa,edad,esActivo);
    }

    public String[] getProyectos() {
        return proyectos;
    }

    public void setProyectos(String[] proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public void asignarCodigo(int correlativo) {
        super.codigo = "IN-"+correlativo;
    }
    
    @Override
    public void asignarSueldo() {
        super.asignarSueldo();
        
        this.sueldo = this.sueldo*1.05f;
    }
    
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\nTipo: Docente Investigador";
    }
    
    
    
}
