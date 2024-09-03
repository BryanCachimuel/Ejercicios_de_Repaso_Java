package Clases;

/*
    Prueba Persona mediante una clase main
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        /* Primera forma */
        String nom = "Bryan";
        String ape = "Cachimuel";
        
        persona.nombre = nom;
        persona.apellido = ape;
        
        persona.desplegarInformacion(); 
       
    
        Persona persona2 = new Persona();
        
        /* segunda forma */
        persona2.nombre = "Lennin";
        persona2.apellido = "Loyo";
        
         persona2.desplegarInformacion();
        
    }
    
}
