package com.example;

public class Mascota {
    protected String nombre;
    protected String raza;
    protected int edad;

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println(this.nombre + " ESTA COMIENDO!");
    }

    public void hablar() {
        System.out.println("*-*-*-*-*-*");
    }

}
