/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5.salariodeempleados.clases;

/**
 *
 * @author otro3
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private int cantidadHorasTrabajadas;
    private float sueldoPorHora;
    
    //Constructor
    
    public Empleado(int paramCodigo, String paramNombre, 
                    int paramCantidadDeHoras, float paramSueldoPorHora) {
        codigo = paramCodigo;
        nombre = paramNombre;
        cantidadHorasTrabajadas = paramCantidadDeHoras;
        sueldoPorHora = paramSueldoPorHora;
    }
    
    //Getter
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre() {
        return nombre;   
    }
    
    public int getCantidadDeHorasTrabajadas() {
        return cantidadHorasTrabajadas;   
    }
        
    public float getSueldoPorHora() {
        return sueldoPorHora;   
    }
    //Setter
    
    public void setCodigo(int paramCodigo){
        codigo = paramCodigo;
    }
    
    public void setNombre(String paramNombre) {
        nombre = paramNombre;   
    } 
    
    public void setCantidadDeHorasTrabajadas(int paramCantidadDeHoras){
        cantidadHorasTrabajadas = paramCantidadDeHoras;
    }
        
    public void setSueldoPorHora(float paramSueldoPorHora){
        sueldoPorHora = paramSueldoPorHora;
    }
    
    //Métodos
    
    public float calcularSalario() {
        int excendenteEnHoras = 0;
        int multiploHorasExtra = 1;
        int horasTrabajadasBase;
        
        if (cantidadHorasTrabajadas > 40) {
            excendenteEnHoras = cantidadHorasTrabajadas - 40;
            horasTrabajadasBase = 40;
            
            if (cantidadHorasTrabajadas >= 41 && cantidadHorasTrabajadas <= 45) {
                multiploHorasExtra = 2;
            } else if (cantidadHorasTrabajadas > 45) {
                multiploHorasExtra = 3;
            }
        } else {
            horasTrabajadasBase = cantidadHorasTrabajadas;
        }
        
        float sueldoHorasNormales = horasTrabajadasBase * sueldoPorHora;
        float sueldoHorasExtra = excendenteEnHoras * sueldoPorHora * multiploHorasExtra;
        
        return sueldoHorasNormales + sueldoHorasExtra;
    }
    
    public void imprimir() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad De Horas Trabajadas: " + cantidadHorasTrabajadas);
        System.out.println("Sueldo Por Hora: " + sueldoPorHora);
        System.out.println("Sueldo Semanal: " + calcularSalario());
    }
}
