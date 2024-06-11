/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masejemplosconarreglos;

/**
 *
 * @author otro3
 */
public class MasEjemplosConArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante[] estudiantes = new Estudiante[4];
        
        Estudiante estudiante1 = new Estudiante("Juan", 18);
        estudiantes[0] = estudiante1;
        //estudiantes[0] = new Estudiante("Juan", 18);
        estudiantes[1] = new Estudiante("Felipe", 28);
        estudiantes[2] = new Estudiante("Bryan", 20);
        estudiantes[3] = new Estudiante("Sara", 21);
        
        int suma = 0;
        
        for(Estudiante est:estudiantes) {
            suma += est.getEdad();
        }
        
        float promedio = suma / estudiantes.length;
        
        System.out.println(promedio);
    }
    
}
