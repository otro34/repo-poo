package com.ulima.poo.clases.ejercicio3;

public class SerHumano {
    private String nombre;
    private String colorOjos;
    private int edad;

    public SerHumano() {}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColorOjos() {
        return colorOjos;
    }
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void verCaracteristicas() {
        System.out.println("\nNombre: " + nombre + 
        "\nColor de Ojos : " + colorOjos + 
        "\nEdad: " + edad);
    }
}
