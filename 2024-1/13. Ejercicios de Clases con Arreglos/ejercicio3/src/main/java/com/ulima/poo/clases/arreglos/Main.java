package com.ulima.poo.clases.arreglos;

public class Main {
    public static void main(String[] args) {
        Barco huascar = new Barco("Huascar");
        Barco independencia = new Barco("Independencia");

        int ronda = 0;

        while (huascar.getVida() > 0 && independencia.getVida() > 0) {
            ronda++;
            System.out.println("Ronda " + ronda);
            System.out.println("Ataca: " + huascar.getNombre());
            huascar.golpear(independencia);
            System.out.println("Vida de " + independencia.getNombre() + ": " +  independencia.getVida());

            if (independencia.getVida() <= 0)
                break;

            System.out.println("Ataca: " + independencia.getNombre());
            independencia.golpear(huascar);
            System.out.println("Vida de " + huascar.getNombre() + ": " +  huascar.getVida());

        }

        if (huascar.getVida() > independencia.getVida())
            System.out.println("Ha ganado El Monitor Huascar!");
        else
            System.out.println("Ha ganado La Fragata Independencia!");
    }
}