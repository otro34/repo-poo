package com.example;

public class Main {
    public static void main(String[] args) {

        GeneradorDeCreeps generadorC = new GeneradorDeCreeps();

        Heroe heroe1 = new Heroe("Lyon", "Demonio", 30, 100, 400, 40, 10, 1, 10,1,20,20, 300, 21, 0, 1, Clasificacion.INTELIGENCIA);

        Heroe heroe2 = new Heroe("Sniper", "Humano", 40, 20, 300, 10, 300, 0, 10, 50, 20, 20, 1, 300 ,0, 0, Clasificacion.AGILIDAD);

        int ronda = 0;

        while (heroe1.getVida() > 0 && heroe2.getVida() > 0) {

            ronda++;
            System.out.println("Ronda " + ronda);
            if (ronda <= 10) {
                //Pelea con creeps
                Creep creep = generadorC.generar();
                heroe1.golpear(creep);

                if (creep.getVida() < 0) {
                    System.out.println("Creep ha muerto!");
                    double nivel = heroe1.getNivel();
                    heroe1.setNivel(nivel + 1);
                    System.out.println(heroe1.getNombre() + " ha subido de nivel!");
                }

                //heroe 2
                Creep creep2 = generadorC.generar();
                heroe2.golpear(creep2);

                if (creep2.getVida() < 0) {
                    System.out.println("Creep ha muerto!");
                    double nivel = heroe2.getNivel();
                    heroe2.setNivel(nivel + 1);
                    System.out.println(heroe2.getNombre() + " ha subido de nivel!");
                }

            } else {
                //Pelea con el otro heroe
                System.out.println("Ahora se enfrentan los héroes!");
                System.out.println(heroe1.getNombre() + " es nivel " + heroe1.getNivel());
                System.out.println(heroe2.getNombre() + " es nivel " + heroe1.getNivel());

                heroe1.golpear(heroe2);
                heroe2.golpear(heroe1);
            }

            if (heroe1.getVida() > 0)
                System.out.println("Ha ganado " + heroe1.getNombre());
            else
                System.out.println("Ha ganado " + heroe2.getNombre());
        }
    }
}