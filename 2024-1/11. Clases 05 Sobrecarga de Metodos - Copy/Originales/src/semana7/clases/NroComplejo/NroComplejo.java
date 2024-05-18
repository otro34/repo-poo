package semana7.clases.NroComplejo;

public class NroComplejo {

    private double real;
    private double imag;

    //Constructor por defecto de la clase
    public NroComplejo() {
        this.real = 1;
        this.imag = 1;
        
    }

    //Constructor con parámetros
    public NroComplejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //métodos setters y getters
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    
    // Operación booleana que decide si un número complejo es
    // imaginario puro (es decir, no tiene parte real).EsImaginarioPuro
    public boolean esImaginarioPuro(){
        if (real==0){
            return true;
        }
        return false;
    }
    // operación booleana que decide si un número complejo es un número 
    // real. 
    public boolean esReal(){
        if (imag == 0){
            return true;            
        }
        return false;
    }
    // EsNulo, operación booleana que decide si un número complejo es nulo.
    public boolean esNulo(){
        if (real==0 && imag==0){
            return true;            
        }
        return false;
    }
    /*
    * Argumento, operación que recibe como entrada un número complejo no nulo 
    y devuelve su argumento. Se recuerda a continuación el valor del argumento de 
    un número complejo a + bi no nulo (número real comprendido entre –Pi y Pi):
    */
    public double argumento(NroComplejo c){

        if (real>0){
            return Math.atan(imag/real);
        }else if (real<0 && imag>=0){
            return Math.atan(imag/real)+Math.PI;
        }else if (real<0&&imag<0){
            return Math.atan(imag/real)-Math.PI;
        }else if (real==0 && imag>0){
            return Math.PI/2;
        }else if(real==0 && imag<0){
            return -Math.PI/2;
        }
        return 0;        
    }


    //sumar dos números complejos
    //(a, b) + (c, d) = (a + c, b + d);
    public NroComplejo sumar(NroComplejo c) {
        NroComplejo aux = new NroComplejo();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }

    //restar dos números complejos
    //(a, b) - (c, d) = (a - c, b - d);
    public NroComplejo restar(NroComplejo c) {
        NroComplejo aux = new NroComplejo();
        aux.real = real - c.real;
        aux.imag = imag - c.imag;
        return aux;
    }

    //multiplicar dos números complejos
    //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public NroComplejo multiplicar(NroComplejo c) {
        NroComplejo aux = new NroComplejo();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }

    //multiplicar un número complejo por un número de tipo double
    //(a, b) * n = (a * n, b * n)
    public NroComplejo multiplicar(double n) {
        NroComplejo aux = new NroComplejo();
        aux.real = real * n;
        aux.imag = imag * n;
        return aux;
    }

    //dividir dos números complejos
    //(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
    public NroComplejo dividir(NroComplejo c) {
        NroComplejo aux = new NroComplejo();
        aux.real = (real * c.real + imag * c.imag) / (c.real * c.real + c.imag * c.imag);
        aux.imag = (imag * c.real - real * c.imag) / (c.real * c.real + c.imag * c.imag);
        return aux;
    }

    //método mostrar
    public String complejoTexto() {
        return "(" + real + ", " + imag + "i)";
    }



}
