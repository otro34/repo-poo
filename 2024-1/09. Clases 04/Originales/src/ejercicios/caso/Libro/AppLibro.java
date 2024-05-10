package ejercicios.caso.Libro;

public class AppLibro {

    public static void main(String[] args) {
        Libro L1 = Libro.Crear();
        L1.Leer();
        Libro L2 = Libro.Crear();
        L2.Leer();
        Libro L3 = Libro.Crear();
        L3.Leer();

        // ----- Mostrar el Nro de Libros
        System.out.println("El número de libros es: " + Libro.NroLibros);
        L1.Escribir();
        L2.Escribir();
        L3.Escribir();
    }

}
