/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmorasedano;

public class DocenteAdministrativo extends Docente{
    
    public DocenteAdministrativo(int correlativo){
        super();
        this.codigo = "AD-" + correlativo;
    }
    
    public String cargo;
    
    public String getCargo(){
        return this.cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void asignarSueldo(){
        this.sueldo = this.sueldo + 0.07 * this.sueldo - 100;
    }
    
}
