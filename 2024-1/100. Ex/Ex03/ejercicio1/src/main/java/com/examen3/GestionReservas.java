package com.examen3;

public class GestionReservas {
    private int MAX = 5;
    private Reserva[] reservas;
    private int nroReservas;

    public GestionReservas() {
        this.reservas = new Reserva[MAX];
        this.nroReservas = 0;
    }

    public void agregar(Reserva reserva) {
        if (nroReservas < 10) {
            reservas[nroReservas] = reserva;
            System.out.println("Reserva registrada.");
        } else
            System.out.println("Error agregando.");
    }

    public Reserva buscar(String codigo) {
        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.getCodigo().equals(codigo)) {
                return reserva;
            }
        }
        return null;
    }

    
}
