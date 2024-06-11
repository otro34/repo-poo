/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja.gestion;
import undiaenlagranja.clases.Pollo;
import java.util.Scanner;

/**
 *
 * @author profo1601
 */
public class Granja {
    private String nombre;
    private float area;
    private Pollo[] pollos;
    private int nroDePollos;

    public Granja(String nombre, float area) {
        this.nombre = nombre;
        this.area = area;
        pollos = new Pollo[3];
        nroDePollos = 0;
    }

    public int getNroDePollos() {
        return nroDePollos;
    }
    
    public void insertar(Pollo pollo){
        if (nroDePollos < pollos.length){
            pollos[nroDePollos] = pollo;
            nroDePollos++;
        }
    }
    
    public void insertarTodos() {
        Scanner objScanner = new Scanner(System.in);
        for (int i = 0; i < pollos.length; i++) {
            System.out.println("Insertar Pollo Nro " + (int)(i + 1));
            System.out.println("----------------------");
            System.out.println("Nombre: ");
            String nombrePollo = objScanner.next();
            System.out.println("Peso: ");
            float pesoPollo = objScanner.nextFloat();
            System.out.println("Tiempo en dias: ");
            int tiempoEnDias = objScanner.nextInt();
            
            Pollo objPollo = new Pollo(nombrePollo,pesoPollo,tiempoEnDias);
            
            this.insertar(objPollo);
            objPollo.print();
        }
    }
    
    public Pollo getAleatorio() {
        
        int max = 3;
        int min = 1;
        int range = max - min + 1;
        
        int random = (int)(Math.random() * range) + min;
        
        return pollos[random];
    }
   
    public Pollo buscarPollo(String nombre) {
        for(Pollo pollo:pollos) {
            if (pollo != null &&
                pollo.getNombre().equals(nombre)){
                
                return pollo;
            }    
        }
        return null;
    }
    
    public String getDatos() {
        String datosGranja = "**** GRANJA ****"
                + "\nNombre: " + this.nombre + ""
                + "\nArea: " + this.area + ""
                + "\nCantidad de pollos: " + this.nroDePollos;
        
        String strPollos = "";
        
        for(Pollo pollo:pollos) {
            strPollos = strPollos + "\n" + pollo.getDatos();
        }
        
        return datosGranja + "\n" +  strPollos;
    }
    
}
