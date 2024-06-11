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
public class Divercity {
    private String pais;
    private Ciudadano[] personas;

    public Divercity(String pais) {
        this.pais = pais;
        this.personas = new Ciudadano[30];
    }
    
    public Ciudadano buscar(int cui) {
        for(Ciudadano objCiudadano:personas) {
            if (objCiudadano != null) {
                if (objCiudadano.getCui() == cui){
                    return objCiudadano;
                }
            }    
        }
        return null;
    }
    
    
}
