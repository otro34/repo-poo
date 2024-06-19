package com.example;

public class Main {
    public static void main(String[] args) {
        Administrativo adm1 = new Administrativo("001", "Julian", "Sanchez", 5000, "Jefe de Oficina");
        Ordinario ord1 = new Ordinario("002", "Felipe", "Mantequilla", 6000);
        Investigador inv1 = new Investigador("004", "Rodrigo", "Gomez", 150, "Ingenieria");

        Docente[] docentes = new Docente[3];

        docentes[0] = adm1;
        docentes[1] = ord1;
        docentes[2] = inv1;

        for (Docente docente : docentes) {
            System.out.println(docente);
        }
        


    }
}