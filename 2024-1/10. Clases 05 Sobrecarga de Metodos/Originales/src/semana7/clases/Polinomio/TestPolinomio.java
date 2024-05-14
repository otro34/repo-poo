package semana7.clases.Polinomio;

public class TestPolinomio {

    public static void main(String[] args) {
        int[] coeficientesP = {1, 2, 3, 4};
        int gradoP = 3;

        Polinomio p = new Polinomio(coeficientesP, gradoP);
        System.out.println("p(x) = " + p);

        int[] coeficientesQ = {5, 0, 3};
        int gradoQ = 2;

        Polinomio q = new Polinomio(coeficientesQ, gradoQ);
        System.out.println("q(x) = " + q);

        Polinomio r = p.suma(q);
        System.out.println("p(x) + q(x) = " + r);

        System.out.println("p(3) = " + p.evaluar(3));

        Polinomio s = p.multiplicaEscalar(3);
        System.out.println("3 * p(x) = " + s);
    }

}
