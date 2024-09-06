package ContextoEstatico;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona("Mónica");
        System.out.println("persona: " + persona.toString());
        
        Persona persona1 = new Persona("Vanessa");
        System.out.println("persona1: " + persona1.toString());
        
        Persona persona2 = new Persona("Silvana");
        System.out.println("persona2: " + persona2.toString());
        
    }
 
}
