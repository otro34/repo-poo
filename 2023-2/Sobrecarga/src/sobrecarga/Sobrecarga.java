/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author otro3
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //NumeroEntero nroEntero = new NumeroEntero(3);
        
        NumeroEntero miNumeroEntero = NumeroEntero.crear(6);
        
        miNumeroEntero.sumar(10);
        
        System.out.println(miNumeroEntero.getValor());
    }
    
}
