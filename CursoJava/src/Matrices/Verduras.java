package Matrices;

/*
    Manejo de Matrices
 */
public class Verduras {
    private String nombre;
    
    public Verduras(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Verduras{" + "nombre=" + nombre + '}';
    }
   
}
