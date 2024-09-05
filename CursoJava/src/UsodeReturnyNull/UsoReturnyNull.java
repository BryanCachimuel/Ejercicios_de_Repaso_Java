package UsodeReturnyNull;

import Clases.Persona;

/*
    Uso de la palabra return y null
 */
public class UsoReturnyNull {
     public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Aurora";
        System.out.println("Persona: " + persona.nombre);
        
        persona = cambiarValor(persona);
        System.out.println("Persona por el método cambiarValor: " + persona.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){   
        if(persona == null){
            return null;
        }
        persona.nombre = "Karen";
        return persona;
    }
}
