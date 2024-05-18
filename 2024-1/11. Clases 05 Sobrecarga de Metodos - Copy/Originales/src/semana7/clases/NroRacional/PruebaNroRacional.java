package semana7.clases.NroRacional;

public class PruebaNroRacional {
    public static void main(String[] args) {
        //  Crear una Fraccion
        NroRacional f = NroRacional.crear(4,45);
        NroRacional f1 = NroRacional.crear(3,14);
        System.out.println("Mostrar una Fraccion en Pantalla: ");
        System.out.println(f);
        System.out.println(f1);
        //Sumar Fracciones
        System.out.println("Suma de fracciones: ");
        // la fraccion f sera el objeto anfitrion
        f.multiplicar(f1);
        System.out.println(f);
        NroRacional f2 = NroRacional.crear();
        f2.multiplicar(f, f1);
        System.out.println(f2);
    }
    
}
