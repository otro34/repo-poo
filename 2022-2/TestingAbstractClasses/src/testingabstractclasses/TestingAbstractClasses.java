/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingabstractclasses;
import clases.*;

/**
 *
 * @author otro3
 */
public class TestingAbstractClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente objDocente = new Docente("Alberto", "Sanchez");
        Alumno objAlumno = new Alumno("John", "Snow");
        
        objDocente.saludar();
        objDocente.print();
        objAlumno.saludar();
        objAlumno.print();
        
    }
    
}
