/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraherencia;
import miprimeraherencia.negocio.Animal;
import miprimeraherencia.negocio.Gato;

/**
 *
 * @author otro3
 */
public class MiPrimeraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal objAnimal = new Animal("Claudio", 2);
        
        Gato objGato = new Gato("Minino",4);
        
        System.out.println("Soy un Animal de " + objAnimal.getNroPatas() + " patas");
        objAnimal.hacerSonido();
        
        System.out.println("Soy un Gato de " + objGato.getNroPatas() + " patas");
        objGato.hacerSonido();
        
        //Overloading - sobrecarga del método
        objGato.atacar();
        objGato.atacar(2);
        
//        objParser.transform(2);
//        objParser.transform("");
//        objParser.transform(10.0f);
//        objParser.transform(10.0d);
    }
    
}
