package ContextoEstatico;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        /*
        Persona persona = new Persona("Mónica");
        System.out.println("persona: " + persona.toString());
        
        Persona persona1 = new Persona("Vanessa");
        System.out.println("persona1: " + persona1.toString());
        
        Persona persona2 = new Persona("Silvana");
        System.out.println("persona2: " + persona2.toString());
        */
        Persona persona = new Persona("Mónica",23);
      
        Persona persona1 = new Persona("Vanessa",26);
        
        Persona persona2 = new Persona("Silvana",30);
        
        imprimir(persona);
        imprimir(persona1);
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
 
}
