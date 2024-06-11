/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonas;

/**
 *
 * @author otro3
 */
public class GestionDePersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionPersona objGestionP = new GestionPersona();
        
        //Creando Personas
        Persona objPersona1 = new Persona("44556677", "Hugo Ordoñez", "Arequipa");
        Persona objPersona2 = new Persona("11334455", "Pedro Gómez", "Lima");
        Persona objPersona3 = new Persona("99887751", "Maria Lopez", "Tacna");
        Persona objPersona4 = new Persona("11556677", "Sandra Diaz", "Moquegua");
        Persona objPersona5 = new Persona("66447733", "Juan Gálvez", "Iquitos");
        
        //Agregando personas
        objGestionP.agregar(objPersona1);
        objGestionP.agregar(objPersona2);
        objGestionP.agregar(objPersona3);
        objGestionP.agregar(objPersona4);
        objGestionP.agregar(objPersona5);
        
        System.out.println("Listando Personas en el arreglo:");
        objGestionP.mostrarPersonas();
        
        System.out.println("Ordenando por Ciudad de Nacimiento:");
        objGestionP.ordenarPorCiudadDeNacimiento();
        objGestionP.mostrarPersonas();
        
        System.out.println("Probando eliminar");
        
        objGestionP.eliminar(3);
        System.out.println("Eliminando persona en posición 3");
        
        objGestionP.mostrarPersonas();
        
        System.out.println("BUSCANDO PERSONA POR DNI");
        
        int indx = objGestionP.buscar("66447733");
        
        System.out.println("La persona se encuentra en el índice: " + indx);
        
    }
    
}
