/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;
import clases.Director;
import clases.Ejecutivo;
import clases.Gerente;
import clases.Empleado;
import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class EjemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado1 = new Director("José Sánchez", "Masculino", "Director de Operaciones", 3, 22, 15000);
        Empleado empleado2 = new Ejecutivo("Aldomar Cornejo", "Masculino", "Jefe de Logística", 2, 10, 11000);
        Empleado empleado3 = new Gerente("Rosa Rosales", "Femenino", "Gerente General", 2, 25, 30000);
        
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        
        for(Empleado empleado: empleados) {
            empleado.calcularSueldoTotal();
            System.out.println(empleado.toString());
        }
    }
    
}
