/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagosueldoempleados;

import extensiones.Cargo;
import extensiones.Grado;
import gestion.GestionEmpleados;
import modelo.Administrativo;
import modelo.Electronico;
import modelo.Empleado;
import modelo.Programador;

/**
 *
 * @author otro3
 */
public class PagoSueldoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] especialidades = {"Front-end","Back-end", "datos"};
        
        Empleado objEmpleado1 = new Administrativo("Juan Perez", "Av SN 123", 1000, Cargo.Gerente);
        Empleado objEmpleado2 = new Electronico("Sebastian Cangrejo", "Av CN 3344", 2000,5);
        Empleado objEmpleado3 = new Programador("Oscar Francois", "AV Los Pajaritos 123", 4000,Grado.Magister, especialidades);
        
        GestionEmpleados objGestionEmpleados = new GestionEmpleados();
        
        objGestionEmpleados.insert(objEmpleado3);
        objGestionEmpleados.insert(objEmpleado2);
        objGestionEmpleados.insert(objEmpleado1);
        
        objGestionEmpleados.calcularSueldoEmpleados();
    }
    
}
