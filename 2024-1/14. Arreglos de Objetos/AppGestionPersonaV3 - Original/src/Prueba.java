public class Prueba {
    public static void main(String[] args) {
        Persona objP1 = new Persona(1001,"Juan","Lima"); // 0
        Persona objP2 = new Persona(600,"Ana","Puno"); // 1
        Persona objP3 = new Persona(300,"Lia","Lima"); // 2
        Persona objP4 = new Persona(200,"Rosa","Cusco");// 4
        // Gestionar los datos de las personas
        GestionarPersona gestor = new GestionarPersona();
        
        gestor.agregar(objP1);
        gestor.agregar(objP2);
        gestor.agregar(objP3);
        gestor.agregar(objP4);
        gestor.mostrarPersonas();
        int pos = gestor.buscar(300);
        System.out.println("Pos: "+pos);
        System.out.println("Probar el metodo iesimo...");
        Persona objTemp = gestor.iesimo(2);
        System.out.println(objTemp.getLugarNacimiento());
        System.out.println("Prueba del metodo Insertar: ");
        Persona objNuevo = new Persona(154,"Jonas","Buenos Aires");
        gestor.insertar(objNuevo, 1);
        gestor.mostrarPersonas();
        System.out.println("Prueba del metodo Eliminar: ");
        gestor.eliminar(2);
        gestor.mostrarPersonas();
        System.out.println("Prueba del metodo Ordenar por DNI");
        gestor.ordenarPorDNI();
        gestor.mostrarPersonas();
        System.out.println("Prueba del metodo ordenar por Nombres");
        gestor.ordenarPorNombres();
        gestor.mostrarPersonas();
        System.out.println("Cantidad de elementos por Lugar nacimiento");
        System.out.println("Cantidad: "+gestor.cantidadPorLugarNacimiento("Lima"));
        System.out.println("Elminar por lugar de nacimiento: ");
        gestor.eliminarPorLugarDeNacimiento("Lima");
        gestor.mostrarPersonas();
    }
    
}
