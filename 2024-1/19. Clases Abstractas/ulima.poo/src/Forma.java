public abstract class Forma {
    protected String nombre;

    public Forma(String nombre){
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + getArea());
    }

    public abstract double getArea();
}
