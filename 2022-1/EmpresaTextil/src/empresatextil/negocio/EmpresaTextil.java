/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatextil.negocio;

/**
 *
 * @author otro3
 */
public class EmpresaTextil {
    private static final int MAX = 300;
    private Categoria[] productos;
    private String nombre;
    private int cantidadDeProductos;

    public EmpresaTextil(String nombre) {
        this.nombre = nombre;
        this.productos = new Categoria[300];
        this.cantidadDeProductos=0;
    }

    public Categoria[] getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProductos(Categoria[] productos) {
        this.productos = productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void ingresar(Categoria producto) {
        
        if (cantidadDeProductos < MAX){
            
            producto.generarCantidadDeInventario();
            
            calcularCosto(producto);
        
            if (producto.getCantidadEnInventario() > 200) {
                producto.ajustarCantidadDeInventario();
            } 
            productos[cantidadDeProductos] = producto;
                
            cantidadDeProductos++;
            
            System.out.println("Producto Ingresado! " + cantidadDeProductos);
        } else {
            System.out.println("El limite de productos es 300. Almacen lleno.");
        }
        
    }
    
    //Estamos haciendo sobrecarga (overload) al metodo ingresar para que permita ingresar un producto a un espacio en particular
    //primero mueve todos los items en el array hacia la siguiente posicion, despues los ingresa
        public void ingresar(Categoria producto, int indice) {
        
        if (cantidadDeProductos < MAX){
            
            Categoria tempAIngresar = producto;
            
            producto.generarCantidadDeInventario();
            
            calcularCosto(producto);
        
            if (producto.getCantidadEnInventario() > 200) {
                producto.ajustarCantidadDeInventario();
            } 
            
            productos[cantidadDeProductos] = producto;
                
            cantidadDeProductos++;
            
            // movemos los productos dentro del arreglo
            for (int i = indice; i< this.productos.length -1; i++ ) {
                Categoria temp = productos[i+1];
                productos[i+1] = productos[i];
                productos[i] = tempAIngresar;
                tempAIngresar = temp;
            }
            
            cantidadDeProductos++;
        }
    }
    
    //Ordenamiento de los productos de forma descendente en base a la cantidad que tienen en inventario
    public void ordernarProductosBurbuja() {
        Categoria temp;
        
        try {

            for (int i = 0; i < this.productos.length - 1; i++){
                for (int j = i+1; j < this.productos.length - 1; j++) {
                    if (this.productos[j].getCantidadEnInventario() > this.productos[i].getCantidadEnInventario()) {
                        temp = productos[i];
                        productos[i] = productos[j];
                        productos[j] = temp;
                    }
                }
            }
            System.out.println("He terminado de ordenar!");
        } catch(Exception e) {
            System.out.println("Ha ocurrido un error!");
            System.out.println(e);   
        }
    }

    private void calcularCosto(Categoria producto) {
        if (producto instanceof empresatextil.negocio.CalculadorDeCosto) {
            ((CalculadorDeCosto)producto).calcularCosto();
        }
    }
    
    public void imprimirProductos() {
        for(Categoria producto:productos){
            System.out.println(producto.ToString());
        }
    }
    
    
}
