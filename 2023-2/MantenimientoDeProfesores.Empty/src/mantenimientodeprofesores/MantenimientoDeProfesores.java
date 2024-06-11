/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimientodeprofesores;
import com.ulima.profesores.controlador.GestionProfesor;
import com.ulima.profesores.modelo.Categoria;
import com.ulima.profesores.modelo.Grado;
import com.ulima.profesores.modelo.Profesor;

/**
 *
 * @author otro3
 */
public class MantenimientoDeProfesores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor profesor = new Profesor(1,"Juan", "Romaina",Categoria.Asociado,Grado.Magister);
        
        Profesor profesor2 = new Profesor(2,"John", "Snow",Categoria.Asociado,Grado.Magister);
        
        GestionProfesor gestionProfesor = new GestionProfesor();
        
        gestionProfesor.insertar(profesor);
        
        gestionProfesor.insertar(profesor2);
        
        System.out.println("Después de insertar");
        
        gestionProfesor.printProfesores();
        
        profesor.setApellido("Romaina Acevedo");
        
        gestionProfesor.actualizar(profesor);
        
        System.out.println("Después de actualizar");
        
        gestionProfesor.printProfesores();
        
        gestionProfesor.remover(profesor);
        
        System.out.println("Después de remover");
        
        gestionProfesor.printProfesores();
    }
    
}
