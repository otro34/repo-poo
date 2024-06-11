/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopelota.implementacion;

/**
 *
 * @author otro3
 */
public class Pelota {
    
    private float radio;
    private String color;
    //CONSTANTE
    private final float VALOR_DE_PI = 3.1416f;
    
    //constructor
    public Pelota() {
    }
    
    //Getters
    public float getRadio() {
        return radio;
    }
    
    public String getColor() {
        return color;
    }
    
    //setters
    
    public void setRadio(float paramRadio) {
        radio = paramRadio;
    }
    
    public void setColor(String paramColor) {
        color = paramColor;
    }
    
    //Metodos
    
    public float hallarVolumen() {
        return (float) (4/3 * VALOR_DE_PI * Math.pow(radio, 3));
    }
    
    public String hallarUso(String color) {
        if (color == "Blanco")
            return "Volleyball";
        else 
            return "Basketball";
    }
    
    
}
