/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miaplicacionpollo;

/**
 *
 * @author otro3
 */
public class Pollo {
    
    //ATRIBUTOS
    
    private int pico;
    private int patas;
    private String color;
    
    //CONSTRUCTOR
    
    public Pollo() {
        pico = 1;
        patas = 2;
        color = "Amarillo";
    }
    //OVERLOADING
    public Pollo(int paramPico, int paramPatas, String paramColor) {
        pico = paramPico;
        patas = paramPatas;
        color = paramColor;
    }
    
    //GETTERS
    
    public int getPico(){
        return pico;
    }
    
    public int getPatas(){
        return patas;
    }
    
    public String getColor(){
        return color;
    }
    
    //SETTERS
    
    public void setPico(int paramPico){
        pico = paramPico;
    }
    
    public void setPatas(int paramPatas){
        patas = paramPatas;
    }
    
    public void setColor(String paramColor){
        color = paramColor;
    }
    
}
