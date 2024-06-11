/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.clinica;
import com.clinica.clases.Paciente;
import com.clinica.gestion.GestionClinica;
/**
 *
 * @author jromaina
 */
public class Prueba {

    public static void main(String[] args) {
        //ESTE CODIGO NO SE DEBE MODIFICAR
        
        Paciente paciente1 = new Paciente("Juan", "Galvez",37,new int[] {98,90,87});
        Paciente paciente2 = new Paciente("Felipe", "Sanchez",40,new int[] {100,90,110});
        Paciente paciente3 = new Paciente("Olga", "Muñoz",73,new int[] {70,65,60});
        Paciente paciente4 = new Paciente("Peter", "Schulz",55,new int[] {128,143,133});
        
        GestionClinica objClinica = new GestionClinica("Clinica San Felipe");
        
        objClinica.insertarPaciente(paciente1);
        objClinica.insertarPaciente(paciente2);
        objClinica.insertarPaciente(paciente3);
        objClinica.insertarPaciente(paciente4);
        
        objClinica.ordenarPacientes();
        
        objClinica.printDatosClinica();
        
        objClinica.imprimirPacientes();
        
        objClinica.buscarPaciente();
        
    }
}
