/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulima.poo;
import ulima.poo.logicadenegocio.Alumno;
import ulima.poo.logicadenegocio.GestionNotas;

/**
 *
 * @author otro3
 */
public class ProcesarNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno objAlumno = new Alumno(1234,"Juan Romaina");
        
        GestionNotas objGestionNotas = new GestionNotas(objAlumno);
        
        objGestionNotas.generarNotas();
        
        objGestionNotas.calcularPromedio();
        
        String datosDeAlumno = objGestionNotas.getDatos();
        
        System.out.println(datosDeAlumno);
    }
    
}
