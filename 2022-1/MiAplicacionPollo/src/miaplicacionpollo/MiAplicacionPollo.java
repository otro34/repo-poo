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
public class MiAplicacionPollo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Quiero implementar una clase Pollo
        
        Pollo objPollo = new Pollo(); //Constructor por defecto
        Pollo objPollo1 = new Pollo(1,2,"Blanco"); //constructor con firma
        Pollo objPollo2 = new Pollo(1,2,"Gris");
        Pollo objPollo3 = new Pollo(1,2,"Rojo");
        
        System.out.println("Pollo por defecto creado. Tiene "+ objPollo.getPico() + " pico(s), " + 
                            objPollo.getPatas() + " pata(s) y es de color: " +
                            objPollo.getColor() );
        
        System.out.println("Nuevo pollo creado. Tiene "+ objPollo1.getPico() + " pico(s), " + 
                            objPollo1.getPatas() + " pata(s) y es de color: " +
                            objPollo1.getColor() );
        
        System.out.println("Nuevo pollo creado. Tiene "+ objPollo2.getPico() + " pico(s), " + 
                            objPollo2.getPatas() + " pata(s) y es de color: " +
                            objPollo2.getColor() );
        
        System.out.println("Nuevo pollo creado. Tiene "+ objPollo3.getPico() + " pico(s), " + 
                            objPollo3.getPatas() + " pata(s) y es de color: " +
                            objPollo3.getColor() );
    }
    
}
