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
        /*super(); llamada al constructor de la clase padre (object) */
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        // forma de realizar la impresión sin la necesidad de instanciar un objeto
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    
    // constructor
    public Imprimir(){
        super(); // el constructor de la clase object(padre) para reservar memoria 
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde Imprimir: " + persona);
        System.out.println("Impresión del objeto actual(this): " + this);
    }
}
