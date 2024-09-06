package ContextoEstatico;

/*
    Contexto Estático (uso de la palabra static)
 */
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    // constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        // Aumentando el nuevo valor a la variable idPersona
       this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
   
}
