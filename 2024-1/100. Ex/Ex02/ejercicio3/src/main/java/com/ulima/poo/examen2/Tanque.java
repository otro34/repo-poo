package com.ulima.poo.examen2;

public class Tanque {
    private String nombre;
    private int golpes;
    private boolean ejecutoRegen = false;

    public Tanque(String nombre) {
        this.nombre = nombre;
        this.golpes = 5;
    }

    public int getVida() {
        return golpes;
    }

    public String getNombre() {
        return nombre;
    }

    public void golpear(Tanque tanqueEnemigo) {
        System.out.println("El tanque " + nombre + " ataca a" + tanqueEnemigo.getNombre());
        int ataque = (int) (Math.random() * 100) + 1;

        tanqueEnemigo.recibirGolpe(ataque);

        String efectivo = ataque > 60 ? " ¡Es super efectivo!" : "El ataque no tiene efecto. ";

        System.out.println("El tanque " + nombre + " ataca por " + ataque + ". " + efectivo );
    }

    public void recibirGolpe(int golpe) {
        if (golpe > 60) {
            this.golpes--;
            System.out.println("El tanque " + nombre + " ha recibido un golpe! ");
        }
    }

    public void regenerar() {
        if (this.golpes <= 3 && !ejecutoRegen) {
            this.golpes += 2;
            ejecutoRegen = true;
            System.out.println("El tanque " + nombre + " se ha regenerado!" );
        }
    }

    @Override
    public String toString() {
        return "Tanque " + nombre + " puede resistir " + golpes + " más. ";
    }



}
