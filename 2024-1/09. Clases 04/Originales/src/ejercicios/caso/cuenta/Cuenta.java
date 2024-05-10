package ejercicios.caso.cuenta;

public class Cuenta {
    // ATRIBUTOS
    private int aNroCuenta;
    private int aDni;
    private double aSaldo;

    // METODOS
    public Cuenta() {
        aNroCuenta = 0;
        aDni = 0;
        aSaldo = 0.0d;
    }

    public Cuenta(int pNroCuenta, int pDni, double pSaldo) {
        aNroCuenta = pNroCuenta;
        aDni = pDni;
        if (pSaldo > 0.0d)
            aSaldo = pSaldo;
        else
            aSaldo = 0.0d;
    }

    public double getSaldo() {
        return aSaldo;
    }

    public int getNroCuenta() {
        return aNroCuenta;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            aSaldo = aSaldo + monto;
            System.out.println("Deposito con éxito...");
        } else {
            System.out.println("No se realizo el deposito...");
        };
    }

    public void transferencia(Cuenta cuenta, double monto) {
        if (monto <= aSaldo) {
            aSaldo = aSaldo - monto;
            cuenta.depositar(monto);
            System.out.println("Transferencia con éxito...");
        } else {
            System.out.println("No se realizo la transferencia...");
        }
    }
    public void transferencia(
            Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto){
        cuentaOrigen.transferencia(cuentaDestino, monto);
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= aSaldo) {
            aSaldo = aSaldo - monto;
            System.out.println("Retiro con éxito...");
        } else {
            System.out.println("No se realizo el retiro...");;
        }
    }

    public void imprimirDatos() {
        System.out.println("Nro. de Cuenta: " + aNroCuenta);
        System.out.println("DNI cliente: " + aDni);
        System.out.println("Saldo: " + aSaldo);
    }
}
