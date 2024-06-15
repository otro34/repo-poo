package com.example;

public class Habilidad {
    private String nombre;
    private String tipo;
    private double daño;
    private String tipoDeDaño;
    private int cooldown;

    public Habilidad(String nombre, String tipo, double daño, String tipoDeDaño, int cooldown) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.daño = daño;
        this.tipoDeDaño = tipoDeDaño;
        this.cooldown = cooldown;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getDaño() {
        return daño;
    }
    public void setDaño(double daño) {
        this.daño = daño;
    }
    public String getTipoDeDaño() {
        return tipoDeDaño;
    }
    public void setTipoDeDaño(String tipoDeDaño) {
        this.tipoDeDaño = tipoDeDaño;
    }
    public int getCooldown() {
        return cooldown;
    }
    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    

    
}
