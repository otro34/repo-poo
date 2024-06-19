package com.example;

public class Docente {
    protected String codigo;
    protected String nombre;
    protected String apellido;

    public Docente(String codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + codigo +
            "\n Nombre: " + nombre + 
            "\n Apellido: " + apellido + 
            "\n Sueldo: " + getSueldo();
    }
    
    
}
