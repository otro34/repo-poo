


public class GestionarPersona {

    private static final int MAX = 10;
    private Persona[] array; // Array de Objetos 
    // private Persona array1[];
    // TipoDato[] NombreVariable;
    // int[] arrayDeNumeros;
    // Persona[] listaPersonas;
    // Producto[] listaProductos;
    // Libro[] listaLibros;
    private int n; // numero personas registradas

    public GestionarPersona() {
        // Crear un Array de objeto de tipo Persona
        array = new Persona[MAX];
        this.n = 0;
    }

    // Agregar un Objeto del tipo persona al Arreglo
    public void agregar(Persona objPersona) {
        if (n < MAX) {
            array[n] = objPersona;
            n++;
        }
    }
    /*
     ** Insertar: un objeto en un posicion del arreglo
     */

    public void insertar(Persona objPersona, int pos) {
        if (pos >= 0 && pos <= n) {
            for (int i = n; i > pos; i--) {
                array[i] = array[i - 1];
            }
            array[pos] = objPersona;
            n++;
        } else { // posicion no valida
            System.out.println("La posicion no es valida");
        }

    }

    public void eliminar(int pos) {
        if (pos >= 0 && pos < n) {
            for (int i = pos; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--;
        } else {
            System.out.println("La posicion no es valida");
        }
    }

    public void ordenarPorDNI() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j].getDni() > array[j + 1].getDni()) {
                    // Intercambiar
                    Persona aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public void ordenarPorNombres() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j].getNombres().
                        compareTo(array[j + 1].getNombres()) > 0) {
                    // Intercambiar
                    Persona aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    /*
     Buscar: devolver la posicion del objeto persona identificado con un DNI
     */
    public int buscar(int dni) {
        for (int i = 0; i < n; i++) {
            if (array[i].getDni() == dni) {
                return i;
            }
        }
        return -1;
    }
    /*
     * Iesimo elemento : proporcionarmos la posicion y nos devuelve el elmento
     */

    public Persona iesimo(int pos) {
        if (pos >= 0 && pos < n) {
            return array[pos];
        } else { // No es una posicion válida
            return null;
        }
    }

    public void mostrarPersonas() {
        for (int i = 0; i < n; i++) {
            System.out.println(array[i].mostrarInfo());
        }
    }

    //1) Crear un metodo para ordenar por lugar de nacimiento
    public void ordenarPorLugarNacimiento() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j].getLugarNacimiento().
                        compareTo(array[j + 1].getLugarNacimiento()) > 0) {
                    // Intercambiar
                    Persona aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    // 2) Calcular el numero de personas que su lugar de nacimiento es Lima
    public int cantidadPorLugarNacimiento(String lugarNacimiento) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (array[i].getLugarNacimiento().equals(lugarNacimiento)) {
                c++;
            }
        }
        return c;
    }

    // 3) Mostrar las personas de un lugar de nacimiento especifico. Ejemplo:
    public void mostrarPersonasPorLugarNacimiento(String lugarNacimiento) {
        for (int i = 0; i < n; i++) {
            if (array[i].getLugarNacimiento().equals(lugarNacimiento)) {
                System.out.println(array[i].mostrarInfo());
            }
        }
    }

    // 4) Eliminar las personas segun lugar de nacimiento;
    public void eliminarPorLugarDeNacimiento(String lugarNacimiento) {
        int c = this.cantidadPorLugarNacimiento(lugarNacimiento);
        while (c > 0) {
            for (int j = 0; j < n; j++) {
                if (array[j].getLugarNacimiento().equals(lugarNacimiento)) {
                    eliminar(j);
                }
            }
            c = this.cantidadPorLugarNacimiento(lugarNacimiento);
        }
    }
}
