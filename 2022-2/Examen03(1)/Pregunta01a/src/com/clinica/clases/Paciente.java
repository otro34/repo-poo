/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.clases;

/**
 *
 * @author jromaina
 */
public class Paciente {
    private String nombre;
    private String apellido;
    private int edad;
    private int[] ultimas3Mediciones;
    private float glucosaPromedio;
    private String diagnostico;

    public Paciente(String nombre, String apellido, int edad, int[] ultimas3Mediciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimas3Mediciones = ultimas3Mediciones;
        this.glucosaPromedio = calcularGlucosaPromedio();
        this.diagnostico = obtenerDiagnostico();
    }

    private float calcularGlucosaPromedio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String obtenerDiagnostico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String getDatosPaciente() {
        return "nombre: " + this.nombre + ", apellido: " + this.apellido;
    }
    
    
            
}
