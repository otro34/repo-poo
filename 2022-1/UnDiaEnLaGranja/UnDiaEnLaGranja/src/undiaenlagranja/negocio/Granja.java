/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undiaenlagranja.negocio;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author ProfL3401
 */
public class Granja {
    private String nombre;
    private float area;
    private int numeroDePollitos;
    private Pollo[] pollos;
    
    //Constructor
    
    public Granja(String paramNombre, float paramArea) {
        nombre = paramNombre;
        area = paramArea;
        pollos = new Pollo[10];
        numeroDePollitos = 0;
    }
    
    public void ingresarTodosLosPollos() {
    
        //declarar el scanner
        Scanner objScanner = new Scanner(System.in);
        
        for(int i=0;i<10;i++) {
            System.out.println("Ingrese Nombre: ");
            String nombrePollo = objScanner.nextLine();
            System.out.println("Ingrese Peso: ");
            float pesoPollo = objScanner.nextFloat();
            System.out.println("Ingrese Tiempo en Dias: ");
            int tiempoPollo = objScanner.nextInt();
            
            Pollo objPollo = new Pollo(nombrePollo,pesoPollo,tiempoPollo);
            
            pollos[i] = objPollo;
            
            numeroDePollitos++; //numeroDePollitos = numeroDePollitos + 1
            
            System.out.println("Se agregó el pollo nro: "+numeroDePollitos);
            
            objScanner.nextLine();
        }
    }
    
    //Ingresar un pollito, el cual es pasado como parámetro
    
    public void ingresarUnPollo(Pollo paramPollo) {
            
            pollos[numeroDePollitos] = paramPollo;
            
            numeroDePollitos++;
    }
    
    public Pollo sortearPollo() {
         
        int randomNum = (int) (Math.random() * 9);
        
        return pollos[randomNum];
    }
    //realizar la busqueda de un pollo por nombre
    public Pollo buscar(String paramNombre) {
        
        for(Pollo pollo:pollos) {
            if (pollo != null) {
                if (pollo.getNombre().equals(paramNombre)) {
                    return pollo;
                }
            }
        }
        
        return null;
    }
    
    public String concatenarDatos() {
        return "Nombre: " + nombre + "\n" +
                "Area: " + area + "\n" +
                "Cantidad de Pollos: " + numeroDePollitos;
    }
   
    
    //Getters y Setters
    
    
}


