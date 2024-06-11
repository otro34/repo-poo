/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5.salariodeempleados.gestion;
import semana5.salariodeempleados.clases.Empleado;
import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class GestionEmpleado {
    private Empleado[] arrEmpleados;
    private int totalDeObjetosAlmacenados;
    
    public GestionEmpleado() {
        arrEmpleados = new Empleado[10];
        totalDeObjetosAlmacenados = 0;
    }
    
    //Metodos
    public void ingresarEmpleados() {
        boolean deseaContinuar = true;
        
        while(deseaContinuar) {
            Scanner objScanner = new Scanner(System.in);
            
            System.out.println("Ingrese datos del empleado: ");

            System.out.println("Ingrese Nombre: ");
            String nombreEmpleado = objScanner.nextLine();

            System.out.println("Ingrese Codigo: ");
            int codigoEmpleado = objScanner.nextInt();
            
            System.out.println("Ingrese Horas trabajadas: ");
            int horasTrabajadasEmpleado = objScanner.nextInt();
            
            System.out.println("Ingrese Sueldo por Hora: ");
            float sueldoPorHoraEmpleado = objScanner.nextFloat();
            
            Empleado objEmpleado = new Empleado(codigoEmpleado, nombreEmpleado, 
                                                horasTrabajadasEmpleado, sueldoPorHoraEmpleado);
            
            arrEmpleados[totalDeObjetosAlmacenados] = objEmpleado;
            
            totalDeObjetosAlmacenados++;
            
            System.out.println("Ingreso Exitoso!");
            //preguntamos al usuario si desea continuar
            objScanner.nextLine();
            System.out.println("Desea continuar? Y/N");
            String strDeseaContinuar = objScanner.nextLine();
            
            if (strDeseaContinuar.equals("N")) {
                deseaContinuar = false;
            } 
            
            if (totalDeObjetosAlmacenados >= 10) {
                deseaContinuar = false;
                System.out.println("NO HAY MAS ESPACIO!!");
            }
                
        }
    
    }
    
    public Empleado buscarEmpleadoConMayorSalario() {
        
        Empleado empleadoConMayorSalario = null;
        int i = 0;
        for(Empleado empleado:arrEmpleados) {
            if (empleadoConMayorSalario == null && i == 0) {
                empleadoConMayorSalario = empleado;
            } else if (empleado != null){
                float salario1 = empleadoConMayorSalario.calcularSalario();
                float salario2 = empleado.calcularSalario();
                
                if (salario2 > salario1) {
                    empleadoConMayorSalario = empleado;
                }
            }
            i++;
        }
        
        return empleadoConMayorSalario;
    }
    
}
