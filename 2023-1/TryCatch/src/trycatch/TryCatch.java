/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author otro3
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            String[] sarr = {"hola", "mundo", "adios"};
        
            System.out.println(sarr[0]);
            System.out.println(sarr[3]);
        } catch(Exception e) {
            System.out.println("ERROR: Ha ocurrido un error, contacte al admin!");
            System.out.println(e);
        } finally {
            System.out.println("esto siempre se ejecuta!");
        }
        

    }
    
}
