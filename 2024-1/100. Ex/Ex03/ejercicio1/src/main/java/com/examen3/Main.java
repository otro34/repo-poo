package com.examen3;

public class Main {
    public static void main(String[] args) {
        GestionReservas gestion = new GestionReservas();
        
        Cliente cli1 = new Cliente("Juan", "Perez", "55226699");

        Reserva res1 = new Reserva("2024-01-01", "Argentina", 5000, cli1);

        gestion.agregar(res1);

        String codigo = res1.getCodigo();

        Reserva resb = gestion.buscar(codigo);

        if (resb != null)
            System.out.println(resb);
        else    
            System.out.println("No se encontró registro!");
    }
}