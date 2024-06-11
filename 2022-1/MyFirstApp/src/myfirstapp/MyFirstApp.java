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
public class MyFirstApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    SerHumano humano = new SerHumano();
    
    humano.setNombre("Juan");
    humano.setColorDeOjos("Azules");
    humano.setEdad(20);
    
    System.out.println("El nombre del humano es:" + humano.getNombre());
    
    System.out.println("El color de ojos del humano es:" + humano.getColorDeOjos());
    
    System.out.println("La edad del humano es:" + humano.getEdad());
    
    //System.out.println("Resumen: \n" + humano.verCaracteristicas());
    
    humano.verCaracteristicas();
    }
    
    
    
}
