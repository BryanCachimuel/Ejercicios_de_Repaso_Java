package UsoPalabraThis;

/*
    Uso de la palabra this
 */
public class Clase1PalabraThis {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Michelle", "Rojas");
        System.out.println("Objeto persona: " + persona);
        System.out.println("Nombre persona: " + persona.nombre);
        System.out.println("Apellido persona: " + persona.apellido);
    }
   
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
