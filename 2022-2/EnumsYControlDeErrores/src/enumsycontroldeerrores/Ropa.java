/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsycontroldeerrores;

/**
 *
 * @author otro3
 */
public class Ropa {
    private String color;
    //S,M,L,XL
    private Talla talla;

    public Ropa(String color, Talla talla) {
        this.color = color;
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public Talla getTalla() {
        return talla;
    }
    
    
}
