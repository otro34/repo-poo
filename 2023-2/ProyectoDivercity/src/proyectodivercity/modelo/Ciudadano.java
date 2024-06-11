/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodivercity.modelo;

/**
 *
 * @author otro3
 */
public class Ciudadano {
    private int cui;
    private int edad;
    private String apellidos;

    public Ciudadano(int cui, int edad, String apellidos) {
        this.cui = cui;
        this.edad = edad;
        this.apellidos = apellidos;
    }

    public int getCui() {
        return this.cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getDatos() {
        return this.apellidos + "(" + this.edad + ") - " + this.cui;
    }
}
