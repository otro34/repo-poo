

public class Persona {
    private int dni;
    private String nombres;
    private String lugarNacimiento;

    public Persona() {
        this.dni = 0;
        this.nombres = "";
        this.lugarNacimiento = "";        
    }

    public Persona(int dni, String nombres, String lugarNacimiento) {
        this.dni = dni;
        this.nombres = nombres;
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    public String mostrarInfo(){
        return "DNI: "+this.dni+"\t"+"Nombres: "+this.nombres + "\t"+
                "Lugar: "+this.lugarNacimiento;
    }
}
