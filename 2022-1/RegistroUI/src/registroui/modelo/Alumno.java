/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroui.modelo;
import java.util.ArrayList;
import jdk.nashorn.internal.codegen.CompilerConstants;
import registroui.helpers.Validacion;
/**
 *
 * @author ProfL3401
 */
public class Alumno extends Persona {
    
    protected String codigo;
    protected String carrera;
    protected Boolean estadoBeca;
    
    public Alumno(String nombres, String apellidos, int edad, 
                    String direccion, String carrera,
                    Boolean estadoBeca,
                    String codigo) {
        super(nombres, apellidos, edad, direccion);
        
        this.carrera = carrera;
        this.estadoBeca = estadoBeca;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Boolean getEstadoBeca() {
        return estadoBeca;
    }

    public void setEstadoBeca(Boolean estadoBeca) {
        this.estadoBeca = estadoBeca;
    }
    
    public Validacion validar() {
        boolean result = true;
        
        ArrayList<String> mensajes = new ArrayList<String>();
        
        if (this.carrera.isEmpty()) {
            result = false;
            mensajes.add("Debe seleccionar una carrera.");            
        }
        
        if (super.nombres.isEmpty()) {
            result = false;
            mensajes.add("Debe ingresar nombres del Alumno.");            
        }
        
        if (super.apellidos.isEmpty()) {
            result = false;
            mensajes.add("Debe ingresar apellidos del Alumno.");            
        }
                
        return new Validacion(result,mensajes);
    }
    
}
