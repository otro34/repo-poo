package com.ulima.clases.arreglos;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Julio", "Cesar", "Andrés", "Felipe", "Rodrigo", "José", "Jesús", "Ivan", "Irina"};
        int[] notas = {11,10,9,0,2,20,19,18,12,13};

        Notas objNotas = new Notas(notas, nombres);

        System.out.println("La nota más alta es: " + objNotas.getNotaMasAlta());
        System.out.println("La nota menor es: " + objNotas.getNotaMenor());
        System.out.println("La nota promedio es: " + objNotas.getNotaPromedio());

        objNotas.imprimir();
    }
}