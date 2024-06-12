package com.ulima.poo.salarioempleados;

public class GestionEmpleado {
    private int MAX = 10;
    private Empleado[] empleados;
    private int nroEmpleados;

    public GestionEmpleado() {
        empleados = new Empleado[MAX];
        nroEmpleados = 0;
    }

    public void agregar(Empleado empleado) {
        if (nroEmpleados < MAX) {
            empleados[nroEmpleados] = empleado;
            nroEmpleados++;
            System.out.println("Empleado nro. " + nroEmpleados + " agregado!");
        } else 
            System.out.println("No hay más espacio.");
    }

    public Empleado[] devolverMayorSalario() {
        Empleado[] arrmaxsueldo = new Empleado[MAX];
        int n = 0;

        double maxsueldo = Double.MIN_VALUE;

        for (Empleado empleado : arrmaxsueldo) {
            if (empleado.getTotal() > maxsueldo)
                maxsueldo = empleado.getTotal();
        }

        for (Empleado empleado : arrmaxsueldo) {
            if (empleado.getTotal() == maxsueldo)
                arrmaxsueldo[n] = empleado;
                n++;
        }

        return arrmaxsueldo;
    }

    public void imprimirMayorSalario() {
        double maxsueldo = Double.MIN_VALUE;

        for (Empleado empleado : empleados) {
            if (empleado.getTotal() > maxsueldo)
                maxsueldo = empleado.getTotal();
        }

        for (Empleado empleado : empleados) {
            if (empleado.getTotal() == maxsueldo)
                System.out.println(empleado);    
        }
    }
}
