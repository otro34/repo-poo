/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulima.poo.logicadenegocio;

import java.util.Arrays;

/**
 *
 * @author otro3
 */
public class GestionNotas {
    private Alumno alumno;
    private int[] notas;
    private int promedio;
    
    public GestionNotas(Alumno paramAlumno) {
        this.alumno = paramAlumno;
        this.notas = new int[6];
        this.promedio = 0;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    
    public Alumno getAlumno() {
        return alumno;
    }

    public int[] getNotas() {
        return notas;
    }

    public int getPromedio() {
        return promedio;
    }
    
    //Logica de negocio
    
    public void generarNotas() {
        for(int i=0;i<6;i++){
            notas[i] = (int) (Math.random() * 20);
        }
    }
    
    public void calcularPromedio() {
        Arrays.sort(notas);
        
        int suma = 0;
        
        for(int i=5;i>=1;i--) {
            suma = suma + notas[i];
        }
        
        this.promedio = suma/5;
    }
    
    public String getDatos() {
        
        return "--Datos del alumno--" + "\n" +
                "Código: " + this.alumno.getCodigo() +  "\n" +
                "Nombre: " + this.alumno.getNombre() + "\n" +
                "Notas: " + this.notas[0] + "," + 
                            this.notas[1] + "," +
                            this.notas[2] + "," +
                            this.notas[3] + "," +
                            this.notas[4] + "," +
                            this.notas[5] + "\n" +
                "Promedio de 5 mayores notas: " + this.promedio;
                
    
    }
    
    
}
