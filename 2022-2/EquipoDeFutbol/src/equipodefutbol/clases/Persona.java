/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipodefutbol.clases;

/**
 *
 * @author otro3
 */
public class Persona {
    protected String nombres;
    protected String apellidos;
    protected int edad;
    protected String nacionalidad;
    protected int aniosExperiencia;
    protected String Equipo;
    protected float sueldo;

    public Persona(String nombres, String apellidos, int edad, String nacionalidad, int aniosExperiencia, String Equipo, float sueldo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.aniosExperiencia = aniosExperiencia;
        this.Equipo = Equipo;
        this.sueldo = sueldo;
    }
    
    public String getDatos(){
        return "\nNombre: " + this.nombres +
                "\nApellidos: " + this.apellidos +
                "\nEdad: " + this.edad +
                "\nNacionalidad" + this.nacionalidad +
                "\nSueldo: " + this.sueldo;
    }
    
    public void celebrar(){
        System.out.println("ESTOY CELEBRANDO!!!!");
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getEquipo() {
        return Equipo;
    }

    public float getSueldo() {
        return sueldo;
    }
    
    
}
