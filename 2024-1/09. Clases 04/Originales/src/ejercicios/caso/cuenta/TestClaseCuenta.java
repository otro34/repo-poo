package ejercicios.caso.cuenta;

public class TestClaseCuenta {

    public static void main(String[] args) {
        Cuenta c1
                = new Cuenta(1, 44444442, 1000.0d);
        c1.depositar(1000);
        c1.imprimirDatos();
        c1.retirar(1000);

        Cuenta c2
                = new Cuenta(2, 4888842, 500.0d);
        c2.depositar(500);
        c2.retirar(1000);
        c2.imprimirDatos();
        c1.transferencia(c2, 200);
        
        Cuenta c3 = new Cuenta();
        c3.transferencia(c1, c2, 200);
        
        c1.imprimirDatos();
        c2.imprimirDatos();
    }
}
