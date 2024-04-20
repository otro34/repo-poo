package com.ulima.poo.arreglos.ejercicios;

public class Main {
    public static void main(String[] args) {
        //10.	Escriba un programa en Java para encontrar valores duplicados dentro de un arreglo de strings.

        String[] arrs = {"Maria", "Laura", "Sandra", "Alejandra", "Maria", "Ana", "Laura"};

        String[] dupes = new String[10]; 
        int n = 0;

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length; j++) {
                
                boolean encontrado = false; 
                for(int x = 0; x < dupes.length; x++) {
                    if (dupes[x] == arrs[i]) {
                        encontrado = true;
                    }
                }

                if (i != j && arrs[i] == arrs[j] && !encontrado) {
                    dupes[n] = arrs[i];
                    n++;
                    System.out.println("Valor duplicado: " + arrs[i]);
                }
            }
        }

    }
}