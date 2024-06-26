public class Cuadrado extends Forma {

    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double getArea() {
       return lado*lado;
    }
    

}
