package semana7.clases.NroRacional;

public class NroRacional {

    private int numerador;
    private int denominador;

    private NroRacional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    private NroRacional(int numerador, int denominador) {
        if (denominador != 0) {
            this.numerador = numerador;
            this.denominador = denominador;
            // Simplificar
            simplificar();
        } else {
            this.numerador = 0;
            this.denominador = 1;
        }
    }

    // Metodos sobrecargados

    public static NroRacional crear() {
        return new NroRacional();
    }

    public static NroRacional crear(int numerador, int denominador) {
        return new NroRacional(numerador, denominador);
    }

    private void simplificar() {
        int aux = mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / aux;
        this.denominador = this.denominador / aux;
    }

    private int mcd(int a, int b) {
        int m = 1;
        while (b != 0) {
            m = b;
            b = a % b;
            a = m;
        }
        return m;
    }

    public void sumar(NroRacional fr) {
        // sumar y actualizar el resultado en el objeto anfitrion
        this.numerador = this.numerador * fr.denominador + fr.numerador * this.denominador;
        this.denominador = this.denominador * fr.denominador;
        simplificar();
    }

    public void sumar(NroRacional fr1, NroRacional fr2) {
        // El resultado se almacene en el objeto anfitrion
        this.numerador = fr1.numerador * fr2.denominador + fr2.numerador * fr1.denominador;
        this.denominador = fr1.denominador * fr2.denominador;
        simplificar();
    }

    public void restar(NroRacional fr) {
        // sumar y actualizar el resultado en el objeto anfitrion
        this.numerador = this.numerador * fr.denominador - fr.numerador * this.denominador;
        this.denominador = this.denominador * fr.denominador;
        simplificar();
    }
    public void restar(NroRacional fr1, NroRacional fr2) {
        // El resultado se almacene en el objeto anfitrion
        this.numerador = fr1.numerador * fr2.denominador - fr2.numerador * fr1.denominador;
        this.denominador = fr1.denominador * fr2.denominador;
        simplificar();
    }
    
    public void multiplicar(NroRacional fr) {
        // sumar y actualizar el resultado en el objeto anfitrion
        this.numerador = this.numerador*fr.numerador;
        this.denominador = this.denominador * fr.denominador;
        simplificar();
    }

    public void multiplicar(NroRacional fr1, NroRacional fr2) {
        // sumar y actualizar el resultado en el objeto anfitrion
        this.numerador = fr1.numerador*fr2.numerador;
        this.denominador = fr1.denominador * fr2.denominador;
        simplificar();
    }
    public void dividir(NroRacional fr){
        if (fr.numerador!=0){
            this.numerador = this.numerador*fr.denominador;
            this.denominador = this.denominador*fr.numerador;
            simplificar();
        }else{
            System.out.println("Error imposible dividir");
        }
    }
    public void dividir(NroRacional fr1, NroRacional fr2){
        if (fr2.numerador !=0){
            this.numerador = fr1.numerador*fr2.denominador;
            this.denominador = fr1.denominador*fr2.numerador;
            simplificar();
        }else{
            System.out.println("Error al dividir la fraccion");
        }
    }  
    public int numeradorCanonico(){
        return this.numerador;
    }
    public int denominadorCanonico(){
        return this.denominador;
    }
    
   
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

}
