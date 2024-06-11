/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionacademica.logicadenegocio;

/**
 *
 * @author otro3
 */
public class Alumno {
    private String nombres;
    private String apellidos;
    private int codigo;
    private int notaFinal;

    public Alumno(String nombres, String apellidos, int codigo, int notaFinal) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getDatos() {
        return "Nombres: " + this.nombres + 
               ", Apellidos: " + this.apellidos + 
                ", Codigo: " + this.codigo +
                ", Nota final: " + this.notaFinal;
                }            
}
