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
public class Perro extends SerVivo implements Hablador {
    private String name;

    public Perro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void levatarLaParaParaOrinar() {
        System.out.println("Estoy levantando mi patita!");
    }
    
    public void darLaPata() {
        System.out.println("Estoy dando la pata como saludo!");
    }

    @Override
    public void hablar() {
       System.out.println("Estoy ladrando!");
    }
}
