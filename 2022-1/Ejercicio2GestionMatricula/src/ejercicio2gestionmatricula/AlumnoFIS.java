/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2gestionmatricula;

/**
 *
 * @author otro3
 */
public class AlumnoFIS {
    
    private String codigoAlumno;
    private String nombre;
    private int totalCreditosMatriculados;
    private double precioPorCredito;
    private double montoTotal;
    
    public AlumnoFIS(String paramCodigo, String paramNombre){
        codigoAlumno = paramCodigo;
        nombre = paramNombre;
        precioPorCredito = 100.00;
    }
    
    //Getters
    
    public String getCodigoAlumno() {
        return codigoAlumno;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTotalCreditosMatriculados() {
        return totalCreditosMatriculados;
    }
    
    public double getPrecioPorCredito() {
        return precioPorCredito;
    }
    
    public double getMontoTotal() {
        return montoTotal;
    }
    
    //Setters
    
    public void setPrecioPorCredito(double paramPrecioPorCredito) {
        precioPorCredito = paramPrecioPorCredito;
    }
    
    
    //Métodos
    
    public void calcularTotalCreditosMatriculados() {
        totalCreditosMatriculados = (int) (1 + (Math.random() * 12));
    }
    
    public void calcularMontoTotal() {
        montoTotal = precioPorCredito * totalCreditosMatriculados;
    }
    
    public String getInformacion() {
        return "-----------------------------------------------------------" + "\n" +
        "Codigo: " + codigoAlumno + "\n" +
        "Alumno: " + nombre + "\n" + 
        "Total de créditos Matriculados: " + totalCreditosMatriculados + "\n" +
        "Precio por Crédito: " + precioPorCredito + "\n" +
        "Pago Mensual: " + montoTotal / 4 + "\n" +
        "Monto Total: " + montoTotal;
        
    }
}
