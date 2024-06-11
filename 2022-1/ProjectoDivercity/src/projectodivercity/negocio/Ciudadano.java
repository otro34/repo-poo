/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectodivercity.negocio;

/**
 *
 * @author otro3
 */
public class Ciudadano {
    private int cui;
    private String apellidos;
    
    public Ciudadano(int cui, String apellidos) {
        this.cui = cui;
        this.apellidos = apellidos;
    }

    public int getCui() {
        return cui;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    
}
