public class Circulo extends Forma {

    private double radio;
    private final double pi = 3.1416;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return pi * radio * radio;
    }
    
}
