/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonas;

/**
 *
 * @author otro3
 */
public class Persona {
    private String dni;
    private String nombres;
    private String ciudadDeNacimiento;

    public Persona(String dni, String nombres, String ciudadDeNacimiento) {
        this.dni = dni;
        this.nombres = nombres;
        this.ciudadDeNacimiento = ciudadDeNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCiudadDeNacimiento() {
        return ciudadDeNacimiento;
    }

    public void setCiudadDeNacimiento(String ciudadDeNacimiento) {
        this.ciudadDeNacimiento = ciudadDeNacimiento;
    }
    
    public String toString() {
        return "DNI: " + this.dni + " - Nombres: " + this.nombres + 
                " - Ciudad de Nac.: " + this.ciudadDeNacimiento;
    }
    
}
