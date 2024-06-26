public abstract class Empleado {

    protected String nombre;
    protected String genero;
    protected String cargo;
    protected int nroGrados;
    protected int anioServicio;
    protected float sueldoBasico;

    public Empleado(String nombre, String genero, String cargo, int nroGrados, int anioServicio, float sueldoBasico) {
        this.nombre = nombre;
        this.genero = genero;
        this.cargo = cargo;
        this.nroGrados = nroGrados;
        this.anioServicio = anioServicio;
        this.sueldoBasico = sueldoBasico;
    }

    public float calcularSueldoTotal() {
        return sueldoBasico + calcularBonificacion();
    }

    public abstract float calcularBonificacion();



    


    
}
