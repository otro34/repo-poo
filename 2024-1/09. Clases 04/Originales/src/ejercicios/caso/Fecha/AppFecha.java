package ejercicios.caso.Fecha;

public class AppFecha {

    public static void main(String[] args) {
        // Crear una Instancia u objeto de la Clase Fecha y probar todos sus 
        // metodos. Debe crear dicho objeto con el constructor predeterminado
        // Verificar si el objeto fecha mantiene una fecha valida a pesar de 
        // realizar cambios con datos de una fecha no valida.
        Fecha fecha1 = new Fecha();
        fecha1.leer();
        fecha1.escribir();
        fecha1.setAño(2001);
        fecha1.setDia(31);
        fecha1.setMes(3);
        fecha1.escribir();
        // Crear otra instancia de la clase Fecha utilizando el constructor
        // con parametros. Realizar la operaciones similares al objeto anterior
        // En este caso no es necesario leer la fecha
        
        
        
    }    
}
