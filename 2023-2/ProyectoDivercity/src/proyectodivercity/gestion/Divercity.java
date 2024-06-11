/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodivercity.gestion;

import proyectodivercity.modelo.Ciudadano;

/**
 *
 * @author otro3
 */
public class Divercity {
    private final int MAX = 10;
    private String pais;
    private Ciudadano[] ciudadanos;
    private int nroCiudadanos;

    public Divercity(String pais) {
        this.pais = pais;
        this.ciudadanos = new Ciudadano[this.MAX];
        this.nroCiudadanos = 0;
    }
    
    public void ingresarCiudadano(Ciudadano ciudadano) {
        if (this.nroCiudadanos < this.MAX) {
            if (buscarCiudadano(ciudadano.getCui()) < 0) {
                this.ciudadanos[this.nroCiudadanos] = ciudadano;
                this.nroCiudadanos++;
            } else {
                System.out.println("ERROR! CUI ya registrado. ");
            }
        }
    }
    
    public int buscarCiudadano(int cui) {
        for(int i = 0; i < this.nroCiudadanos; i++) {
            if (this.ciudadanos[i].getCui() == cui) {
                return i;
            }
        }      
        return -1;
    }
    
    public void listarCiudadanos() {
        for(int i = 0; i < this.nroCiudadanos; i++) {
            System.out.println(this.ciudadanos[i].getDatos());
        }
    }
    

    
    
    
    
}
