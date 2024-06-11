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
public class DocenteAdministrativo extends Docente implements CalculadorSeguro {

    private String cargoTiempoCompleto;
    
    public DocenteAdministrativo(String nombres, String dni, int aniosEmpresa, int edad, boolean esActivo, String cargoTiempoCompleto) {
        super(nombres,dni,aniosEmpresa,edad,esActivo);
        this.cargoTiempoCompleto = cargoTiempoCompleto;
    }

    @Override
    public void asignarCodigo(int correlativo) {
        super.codigo = "AD-"+correlativo;
    }
    
    @Override
    public void asignarSueldo() {
        super.asignarSueldo();
        
        this.sueldo = this.sueldo*1.07f;
    }
    
    @Override
    public void calcularSueldoConSeguro() {
        this.sueldo = this.sueldo - 100;
    }
    
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\nTipo: Docente Administrativo";
    }
    
}
