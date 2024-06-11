/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divercity.clases;

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

    public int getEdad() {
        return this.edad;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getDetalleC() {
                        return "Cui: " + this.cui + 
                                    " Edad: " + this.edad +
                                    " Apellidos: " + this.apellidos;
    }
}
