package com.poo.clases.arreglosdeobjetos;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
        "\nApellido: " + apellido +
        "\nDNI: " + dni;
    }

    
}
