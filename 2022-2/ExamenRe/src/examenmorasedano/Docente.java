/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmorasedano;

public class Docente {
    
    protected String codigo;
    protected String nombres;
    protected String dni;
    protected int aniosTrabajo;
    protected int diasVacaciones;
    protected int edad;
    protected boolean activo = true;
    protected double sueldo = 2000;
    
    public Docente(){
        
    }
    
    public Docente(String codigo, String nombres, String dni, int aniosTrabajo, int diasVacaciones, int edad, boolean activo, double sueldo){
        this.codigo = codigo;
        this.nombres = nombres;
        this.dni = dni;
        this.aniosTrabajo = aniosTrabajo;
        this.diasVacaciones = diasVacaciones;
        this.edad = edad;
        this.activo = activo;
        this.sueldo = sueldo;
    }
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the aniosTrabajo
     */
    public int getAniosTrabajo() {
        return aniosTrabajo;
    }

    /**
     * @param aniosTrabajo the aniosTrabajo to set
     */
    public void setAniosTrabajo(int aniosTrabajo) {
        this.aniosTrabajo = aniosTrabajo;
    }

    /**
     * @return the diasVacaciones
     */
    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    /**
     * @param diasVacaciones the diasVacaciones to set
     */
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void calcularDiasVacaciones(){
        
        if(this.aniosTrabajo < 1){
            this.diasVacaciones = 0;
        }else if(this.aniosTrabajo < 5){
            this.diasVacaciones = 15;
        }else if(this.aniosTrabajo < 10){
            this.diasVacaciones = 20;
        }else{
            this.diasVacaciones = 30;
        }
        
    }
    
    public void cesar(){
        setActivo(false);
    }
    
}
