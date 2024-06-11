/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5.salariodeempleados;
import semana5.salariodeempleados.clases.*;
import semana5.salariodeempleados.gestion.GestionEmpleado;
import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class Semana5SalarioDeEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // GestionEmpleado ObjG = new GestionEmpleado();
        //objG.ingresarDatos();
        //objG.buscarEmpleado();
        
      /*  Empleado[] arrEmpleados = new Empleado[4];
        
        arrEmpleados[0] = new Empleado(1,"Jaime Lopez", 40, 5); //200
        arrEmpleados[1] = new Empleado(2,"Feliciano Sanchez", 42, 5); //200 + 20 = 220
        arrEmpleados[2] = new Empleado(3,"Juan Perez", 50, 5); //200 + 150 + 350
        arrEmpleados[3] = new Empleado(4,"John Snow", 20, 5); //100
      
        //for(int i=0;i<arrEmpleados.length;i++) {
        //    System.out.println("El sueldo semanal de " + arrEmpleados[i].getNombre() + " es " + arrEmpleados[i].calcularSalario());
        //}
        
        for(Empleado objEmpleado:arrEmpleados) {
            System.out.println("El sueldo semanal de " + objEmpleado.getNombre() + " es " + objEmpleado.calcularSalario());
        }
        */
        
        
        GestionEmpleado objGestionEmpleado = new GestionEmpleado();
        
        objGestionEmpleado.ingresarEmpleados();
        
        System.out.println("Buscando al empleado con mayor sueldo...");
        
        Empleado empleadoConMayorSueldo = objGestionEmpleado.buscarEmpleadoConMayorSalario();
        
        System.out.println("ENCONTRADO!");
        
        empleadoConMayorSueldo.imprimir();
    }
    
}
