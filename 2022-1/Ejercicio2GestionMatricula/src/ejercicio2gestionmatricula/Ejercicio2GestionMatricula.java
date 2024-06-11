/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2gestionmatricula;

/**
 *
 * @author otro3
 */
public class Ejercicio2GestionMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlumnoFIS alumno1 = new AlumnoFIS("20220102", "Juan Perez");
        alumno1.calcularTotalCreditosMatriculados();
        alumno1.calcularMontoTotal();
        
        AlumnoFIS alumno2 = new AlumnoFIS("20220103", "Rodolfo Diaz");
        alumno2.calcularTotalCreditosMatriculados();
        alumno2.calcularMontoTotal();
        
        AlumnoFIS alumno3 = new AlumnoFIS("20220103", "Guillermo Davila");
        alumno3.calcularTotalCreditosMatriculados();
        alumno3.calcularMontoTotal();
        
        AlumnoFIS alumno4 = new AlumnoFIS("20220103", "Cristiano Ronaldo");
        alumno4.calcularTotalCreditosMatriculados();
        alumno4.calcularMontoTotal();
        
        imprimirAlumno(alumno1.getInformacion());
        imprimirAlumno(alumno2.getInformacion());
        imprimirAlumno(alumno3.getInformacion());
        imprimirAlumno(alumno4.getInformacion());
        
    }
    
    private static void imprimirAlumno(String str) {
        System.out.println(str);
    }
    
}
