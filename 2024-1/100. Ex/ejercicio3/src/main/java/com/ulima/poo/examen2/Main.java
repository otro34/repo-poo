package com.ulima.poo.examen2;

public class Main {
    public static void main(String[] args) {
        Tanque tanque1 = new Tanque("Covadonga");

        Tanque tanque2 = new Tanque("Black Panther");
    
        int ronda = 0;

        System.out.println("Comienza la batalla!");

        while (tanque1.getVida() > 0 && tanque2.getVida() > 0) {

            ronda++;
            System.out.println("Ronda " + ronda);

            tanque1.golpear(tanque2);
            tanque1.regenerar();
            tanque1.toString();
            
            if (tanque1.getVida() <= 0)
                break;
            
            tanque2.golpear(tanque1);
            tanque2.regenerar();
            tanque2.toString();
        }

        if (tanque1.getVida() > tanque2.getVida())
            System.out.println("Ha ganado el tanque " + tanque1.getNombre());
            else
            System.out.println("Ha ganado el tanque " + tanque2.getNombre());
    }
}