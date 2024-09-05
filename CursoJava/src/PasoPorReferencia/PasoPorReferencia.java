package PasoPorReferencia;

import Clases.Persona;

/*
    Paso por Referencia
 */
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Roxana";
        System.out.println("Persona: " + persona.nombre);
        cambiarValor(persona);
        System.out.println("Persona por el método cambiarValor: " + persona.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "Marlene";
    }
}
