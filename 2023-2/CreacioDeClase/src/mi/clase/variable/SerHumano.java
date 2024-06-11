/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.clase.variable;

/**
 *
 * @author otro3
 */
public class SerHumano {
    private String nombre;
    private String colorOjos;
    private int edad;
    
    private static String planeta = "TIERRA";
    
    public SerHumano() {
        System.out.println("ESTE ES UN CONSTRUCTOR SIN PARAMETROS");
    }
    
    public SerHumano(String nombre, String colorOjos, int edad) {
        
        System.out.println("ESTE ES UN CONSTRUCTOR CON PARAMETROS");
        
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
}
