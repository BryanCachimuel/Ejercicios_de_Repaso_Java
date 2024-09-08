package Herencia;

public class Empleado extends Persona{
    /* como esta clase no va a tener clases hijas sus atributos pueden ser definidos como private */
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        // super(); super pude o no ser escrita ya que implicitamente se invoca a super de la clase padre
        this.idEmpleado = ++contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo){
        //super(nombre); // se usa el segundo constructor de la clase padre Persona
        this(); // en un constructor no se puede llamar a super y this juntos solo a uno, este this manda a llamar al constructor vacio
                //  de la parte superior
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleado(){
        return this.idEmpleado;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
