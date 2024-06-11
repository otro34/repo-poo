/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeducativa.clases;
import entidadeducativa.interfaces.CalculadorSeguro;
/**
 *
 * @author otro3
 */
public class DocenteOrdinario extends Docente implements CalculadorSeguro {

    private String[] cursos;
    
    public DocenteOrdinario(String nombres, String dni, int aniosEmpresa, int edad, boolean esActivo) {
        super(nombres,dni,aniosEmpresa,edad,esActivo);
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public void asignarCodigo(int correlativo) {
        super.codigo = "DO-"+correlativo;
    }

    @Override
    public void calcularSueldoConSeguro() {
        this.sueldo = this.sueldo - 100;
    }
    
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\nTipo: Docente Ordinario";
    }
    
    
    
}
