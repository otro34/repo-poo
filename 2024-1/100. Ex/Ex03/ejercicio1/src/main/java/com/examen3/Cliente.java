package com.examen3;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;

    public Cliente(String nombre, String apellido, String dNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dNI;
    }

    public String toString() {
        return "\nNombre: " + nombre + 
                "\nApellido: " + apellido + 
                "\nDNI: " + DNI;
    }

    
}
