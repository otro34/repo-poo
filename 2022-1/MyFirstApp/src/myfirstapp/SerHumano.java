/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author otro3
 */
public class SerHumano {
    
    //ATRIBUTOS
    private String nombre;
    private String colorDeOjos;
    private int edad;
    
    //CONSTRUCTOR
    public SerHumano() {}

    //GETTERS Y SETTERS
    public void setNombre(String paramNombre) {
        nombre = paramNombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setColorDeOjos(String paramColorDeOjos) {
        colorDeOjos = paramColorDeOjos;
    }
    
    public String getColorDeOjos() {
        return colorDeOjos;
    }
    
    public void setEdad(int paramEdad) {
        edad = paramEdad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    //OTROS COMPORTAMIENTOS
    
    public void verCaracteristicas() {
        
        String concatCaracteristicas = "El nombre de la persona es " + nombre + ". \n" +
                                        "Y su color de ojos es: " + colorDeOjos + ". \n" +
                                        "Y su edad es: " + edad + ". \n";
        
        System.out.println(concatCaracteristicas);
    }
    
}
