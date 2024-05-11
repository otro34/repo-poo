package com.ulima.clases.ejercicios2;

public class Main {
    public static void main(String[] args) {
       Fecha fecha1 = new Fecha();

       System.out.println(fecha1.getFecha());

       Fecha fecha2 = new Fecha(12,12,2024);

       System.out.println(fecha2.getFecha());

       fecha1.ingresarDatosPorTeclado();

       System.out.println(fecha1.getFecha());

    }
}