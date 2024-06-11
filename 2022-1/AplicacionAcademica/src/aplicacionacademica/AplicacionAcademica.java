/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionacademica;
import aplicacionacademica.logicadenegocio.Alumno;
import aplicacionacademica.logicadenegocio.Asignatura;

/**
 *
 * @author otro3
 */
public class AplicacionAcademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno[] alumnos = new Alumno[30];
        
        alumnos[0] = new Alumno("Juan", "Perez", 1,10);
        alumnos[1] = new Alumno("Juan2", "Perez", 2,10);
        alumnos[2] = new Alumno("Juan3", "Perez", 3,19);
        alumnos[3] = new Alumno("Juan4", "Perez", 4,10);
        alumnos[4] = new Alumno("Juan5", "Perez", 5,10);
        alumnos[5] = new Alumno("Juan6", "Perez", 6,10);
        alumnos[6] = new Alumno("Juan7", "Perez", 7,10);
        alumnos[7] = new Alumno("Juan8", "Perez", 8,10);
        alumnos[8] = new Alumno("Juan9", "Perez", 9,10);
        alumnos[9] = new Alumno("Juan10", "Perez", 10,10);
        
        alumnos[10] = new Alumno("Juan11", "Perez", 11,19);
        alumnos[11] = new Alumno("Juan12", "Perez", 12,10);
        alumnos[12] = new Alumno("Juan13", "Perez", 13,10);
        alumnos[13] = new Alumno("Juan14", "Perez", 14,10);
        alumnos[14] = new Alumno("Juan15", "Perez", 15,10);
        alumnos[15] = new Alumno("Juan16", "Perez", 16,14);
        alumnos[16] = new Alumno("Juan17", "Perez", 17,10);
        alumnos[17] = new Alumno("Juan18", "Perez", 18,10);
        alumnos[18] = new Alumno("Juan19", "Perez", 19,15);
        alumnos[19] = new Alumno("Juan20", "Perez", 20,10);
        
        alumnos[20] = new Alumno("Juan21", "Perez", 21,10);
        alumnos[21] = new Alumno("Juan22", "Perez", 22,10);
        alumnos[22] = new Alumno("Juan23", "Perez", 23,10);
        alumnos[23] = new Alumno("Juan24", "Perez", 24,10);
        alumnos[24] = new Alumno("Juan25", "Perez", 25,10);
        alumnos[25] = new Alumno("Juan26", "Perez", 26,10);
        alumnos[26] = new Alumno("Juan27", "Perez", 27,10);
        alumnos[27] = new Alumno("Juan28", "Perez", 28,10);
        alumnos[28] = new Alumno("Juan29", "Perez", 29,10);
        alumnos[29] = new Alumno("Juan30", "Perez", 30,10);
        
        Asignatura objAsignatura = new Asignatura("Historia");
        
        objAsignatura.setAlumnos(alumnos);
        
        for(int i=1;i<=30;i++) {
            Alumno alumnoBusqueda = objAsignatura.buscar(i);
            
            System.out.println(alumnoBusqueda.getDatos());
        }
        
        
    }
    
}
