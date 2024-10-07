package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas = personaDao.seleccionar();
        /* es recomendable usar una función lamda */
        personas.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
        
        /* se puede usar los dos procesos
        for(Persona persona : personas){
            System.out.println("Persona: " + persona);
        }*/
    }
    
}
