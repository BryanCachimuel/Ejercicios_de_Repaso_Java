package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        
        /* se puede usar los dos procesos
         personas.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
        for(Persona persona : personas){
            System.out.println("Persona: " + persona);
        }*/
        
        /* Insertando un nuevo objeto de tipo persona */
        Persona personaNueva = new Persona("Richard", "Tarupí", "rftc@gmail.com", "0974365872");
        personaDao.insertar(personaNueva);
        
        List<Persona> personas = personaDao.seleccionar();
        /* es recomendable usar una función lamda */
        personas.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
    }
    
}
