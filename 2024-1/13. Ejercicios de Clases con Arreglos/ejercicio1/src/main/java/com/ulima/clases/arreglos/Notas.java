package com.ulima.clases.arreglos;

public class Notas {
    private int[] notas;
    private String[] nombres;

    public Notas(int[] notas, String[] nombres) {
        this.notas = notas;
        this.nombres = nombres;
    }

    public int getNotaMasAlta() {
        
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] > max) {
                max = this.notas[i];
            }
        }

        return max;
    }

    public int getNotaMenor() {
        
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] < min) {
                min = this.notas[i];
            }
        }

        return min;
    }

    public double getNotaPromedio() {
        int suma = 0;

        for (int i = 0; i < this.notas.length; i++) {
            suma += this.notas[i];
        }

        return suma / this.notas.length;
    }

    public void imprimir() {
        for (int i = 0; i < this.nombres.length; i++) {
            System.out.println("Estudiante: " + this.nombres[i]+ ", Nota: " + this.notas[i]);
        }
    }
}
