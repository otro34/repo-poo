/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularizacion;
import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class Modularizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] cursosLlevados = new String[3];
        
        String[] prPOO = new String[]{"INTROPROG","PROG1"};
        String[] prPraWeb = new String[]{"ESTRUCTURAS"};
        String[] prMATE3 = new String[]{"MATE2"};
        String[] prTesis2 = new String[]{"TESIS1"};
        
        int vacantesHorario1 = 30;
        int vacantesHorario2 = 25;
        
        int alumnosMatriculadosHorario1 = 30;
        int alumnosMatriculadosHorario2 = 24;
        
        int horario = 0;
        
        System.out.println("INICIANDO PROCESO DE MATRICULA");
        
        Scanner objScanner = new Scanner(System.in);
        
        String nombre = "", apellido = "", codigo = "", carrera = "",curso = "";
        
        ingresarDatosDeAlumnoPorTeclado(nombre, apellido, codigo, carrera, curso);
        //ingresarDatosDeAlumnoPorTeclado(alumno);
        
        for(int i = 0;i<cursosLlevados.length - 1;i++) {
            System.out.println("Ingresar Curso previo : ");
            cursosLlevados[i] = objScanner.next();
        }
        
        boolean elAlumnoCumpleConRequerimientos = false;
        
        System.out.println("VALIDANDO REQUISITOS");
        
        switch(curso) {
            case "POO":
                elAlumnoCumpleConRequerimientos = validarRequisitosDeCurso(prPOO, cursosLlevados);
                break;
            case "PROGRAWEB": 
                elAlumnoCumpleConRequerimientos = validarRequisitosDeCurso(prPraWeb, cursosLlevados);
                break;
            case "MATE3":
                elAlumnoCumpleConRequerimientos = validarRequisitosDeCurso(prMATE3, cursosLlevados);
            default:
                break;
        }
        System.out.println("VALIDANDO HORARIOS");
        
        boolean tieneVacante = false;
        
        if (elAlumnoCumpleConRequerimientos == true) {
            System.out.println("Seleccione horario: 1. Dia, 2.Noche");
            
            horario = objScanner.nextInt();   
            
            switch(horario) {
                case 1: 
                    int matriculados1 = alumnosMatriculadosHorario1 + 1;
                    if ( matriculados1 > vacantesHorario1 ) {
                        System.out.println("NO HAY MAS VACANTES PARA EL HORARIO.");
                    } else tieneVacante = true;
                    break;
                case 2: 
                    int matriculados2 = alumnosMatriculadosHorario2 + 1;
                    if ( matriculados2 > vacantesHorario2 ) {
                        System.out.println("NO HAY MAS VACANTES PARA EL HORARIO.");
                    } else tieneVacante = true;
                    break;
                default:
                    break;
            }
        } 
        
        if (tieneVacante == true) {
            System.out.println("ALUMNO MATRICULADO!");
            System.out.println("Nombre: " + nombre +
                            "\nApellido: " + apellido +
                            "\nCodigo: " + codigo +
                            "\nCarrera: " + carrera +
                            "\nCurso: "+ curso);
        } else {
            System.out.println("ALUMNO NO SE PUDO MATRICULAR!");
        }
    }
    
    private static boolean validarRequisitosDeCurso(String[] cursosPrerequisito, String[] cursosLlevados) {
        
        for(String prerequisito:cursosPrerequisito) {
                    for(String cursoLlevado:cursosLlevados) {
                        if (prerequisito.equals(cursoLlevado)) {
                           return true; 
                        }
                    }
                }
        return false;
    }

    private static void ingresarDatosDeAlumnoPorTeclado(String nombre, String apellido, String codigo, String carrera, String curso) {
        
        Scanner objScanner = new Scanner(System.in);
         
        System.out.println("Ingresar Nombre y Apellido: ");
        nombre = objScanner.next();
        System.out.println("Ingresar Apellido: ");
        apellido = objScanner.next();
        System.out.println("Ingresar Codigo: ");
        codigo = objScanner.next();
        System.out.println("Ingresar Carrera: ");
        carrera = objScanner.next();
        System.out.println("Ingresar Curso a llevar: ");
        curso = objScanner.next();
    }
    
}
