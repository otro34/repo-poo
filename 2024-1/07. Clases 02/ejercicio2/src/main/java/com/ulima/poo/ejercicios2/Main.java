package com.ulima.poo.ejercicios2;

public class Main {
    public static void main(String[] args) {
        Cuadrado objCuadrado = new Cuadrado(4);

        System.out.println("Mi cuadrado tiene lados de tamaño: " + objCuadrado.getLado());

        objCuadrado.setLado(8);

        System.out.println("He incrementado el tamaño del lado de mi cuadrado a : " + objCuadrado.getLado());

        System.out.println("El area del cuadrado es: " + objCuadrado.calcularArea());

        System.out.println("El perímetro de mi cuadrado es: " + objCuadrado.calcularPerimetro());
    }
}