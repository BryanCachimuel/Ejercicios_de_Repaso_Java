package Encapsulamiento;

/*
    Encapsulamiento
 */
public class Persona {
    // atributos de la clase
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    // constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    // Métodos get
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    // los métodos boolean no se les pone get si no is
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    // Métodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    public String toString(){
        return "Persona [nombre: "+ this.nombre + 
                ", sueldo:  " + this.sueldo + 
                ", eliminado: " + this.eliminado + "]";
    }
}
