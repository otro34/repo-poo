public class Director extends Empleado  {

    public Director(String nombre, String genero, String cargo, int nroGrados, int anioServicio, float sueldoBasico) {
        super(nombre, genero, cargo, nroGrados, anioServicio, sueldoBasico);

    }

    @Override
    public float calcularBonificacion() {
        int factor = this.anioServicio / 5;
        return factor > 1 ? (this.sueldoBasico * 0.035f) * factor : 0f;
    }
    
}
