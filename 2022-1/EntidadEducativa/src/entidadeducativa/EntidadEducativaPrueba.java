/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeducativa;

import entidadeducativa.clases.DocenteOrdinario;
import entidadeducativa.clases.DocenteAdministrativo;
import entidadeducativa.clases.Docente;
import entidadeducativa.clases.EntidadEducativa;
import entidadeducativa.clases.DocenteInvestigador;
import entidadeducativa.interfaces.CalculadorSeguro;

/**
 *
 * @author otro3
 */
public class EntidadEducativaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntidadEducativa objEntidad = new EntidadEducativa("San Ignacio");
        
        
        for(int i = 0; i< 10; i++){
            Docente objDocente = new DocenteOrdinario("Juan Perez"+i,"1234567"+i,10,40,true);
            objDocente.asignarCodigo(i);
            objDocente.calcularVacaciones();
            objDocente.asignarSueldo();
            
            objEntidad.registrarDocente(objDocente);
            
            ((CalculadorSeguro)objDocente).calcularSueldoConSeguro();
            
            
        }
        
        for(int i = 10; i< 20; i++){
            Docente objDocente = new DocenteInvestigador("Juan Perez"+i,"1234567"+i,10,40,true);
            
            objDocente.asignarCodigo(i);
            objDocente.calcularVacaciones();
            objDocente.asignarSueldo();
            
            objEntidad.registrarDocente(objDocente);
        }
        
        for(int i = 20; i< 30; i++){
            Docente objDocente = new DocenteAdministrativo("Juan Perez"+i,"1234567"+i,10,40,true, "Decano de Facultad");
            
            objDocente.asignarCodigo(i);
            objDocente.calcularVacaciones();
            objDocente.asignarSueldo();
            
            objEntidad.registrarDocente(objDocente);
            
            ((CalculadorSeguro)objDocente).calcularSueldoConSeguro();
        }
        
        objEntidad.cesarDocente("DO-1");
        objEntidad.cesarDocente("IN-11");
        objEntidad.cesarDocente("AD-21");
        
        objEntidad.ordernarBurbuja();
        
        for(Docente objDocente:objEntidad.getDocentes()) {
            System.out.println(objDocente.obtenerDatos());
            System.out.println();
        }
        
        
    }
    
}
