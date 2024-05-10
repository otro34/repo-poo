package ejercicios.caso.Libro;
import java.util.Scanner;
public class Libro {
    //*********************** ATRIBUTOS ************************
    private String aCodigo;
    private String aAutor;
    private String aTitulo;
    private int aAnio;
    // ----- Atributo de Clase
    public static int NroLibros = 0;
    // *********************** METODOS ************************
    //==================== CONSTRUCTORES =======================
    // ----------------------------------------------------------------
    private Libro() {
        aCodigo = "";
        aAutor = "";
        aTitulo = "";
        aAnio = 0;
        // ----- Incrementar el Nro. de libros en la variable estatica
        NroLibros++;
    }
    // ----------------------------------------------------------------
    private Libro(String pCodigo, String pAutor, String pTitulo, int pAnio) {
        aCodigo = pCodigo;
        aAutor = pAutor;
        aTitulo = pTitulo;
        aAnio = pAnio;
        // ----- Incrementar el Nro. de libros en la variable estatica
        NroLibros++;
    }
    // ----------------------------------------------------------------
    public static Libro Crear() {
        return new Libro();
    }
    // ----------------------------------------------------------------
    public static Libro Crear(String pCodigo, String pAutor, String pTitulo, int pAnio) {
        return new Libro(pCodigo, pAutor, pTitulo, pAnio);
    }
    // ==================== PROPIEDADES =======================
    // ----------------------------------------------------------------
    public String getCodigo() {
        return aCodigo;
    }
    public void setCodigo(String value) {
        aCodigo = value;
    }
    // ----------------------------------------------------------------
    public String getAutor() {
        return aAutor;
    }
    public void setAutor(String value) {
        aAutor = value;
    }
    // ----------------------------------------------------------------
    public String getTitulo() {
        return aTitulo;
    }
    public void setTitulo(String value) {
        aTitulo = value;
    }
    // ----------------------------------------------------------------
    public int getAnio() {
        return aAnio;
    }
    public void setAnio(int value) {
        aAnio = value;
    }
    // ==================== OTROS METODOS =======================
    //-------------------------------------------------------------
    public void Leer() {
        Scanner entrada = new Scanner(System.in);

        //-- Leer datos del libro
        System.out.println("Ingrese datos del libro");
        System.out.println("Código: ");
        aCodigo = entrada.nextLine();
        System.out.println("Autor: ");
        aAutor = entrada.nextLine();
        System.out.println("Título: ");
        aTitulo = entrada.nextLine();
        System.out.println("Año: ");
        aAnio = entrada.nextInt();
    }
    //-------------------------------------------------------------
    public void Escribir() {
        System.out.println(
                aCodigo + "\t"
                + aAutor + "\t"
                + aTitulo + "\t"
                + aAnio);
    }
}
