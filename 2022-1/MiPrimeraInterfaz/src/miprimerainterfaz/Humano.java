/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerainterfaz;
import miprimerainterfaz.interfaces.Hablador;
/**
 *
 * @author otro3
 */
public class Humano extends SerVivo implements Hablador{
    public String nombre;

    public Humano(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void trabajar() {
        System.out.println("Estoy trabajando!");
    }

    @Override
    public void hablar() {
        System.out.println("Estoy hablando!");
    }
}
