package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        PersonaJDBC personaDao = new PersonaJDBC();
        
        
        /* se puede usar los dos procesos
         personas.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
        for(Persona persona : personas){
            System.out.println("Persona: " + persona);
        }*/
        
        /*Insertando un nuevo objeto de tipo persona 
        Persona personaNueva = new Persona("Maritza", "Paspuezan", "mp@yahoo.com", "0945793652");
        personaDao.insertar(personaNueva);*/
        
        /* Modificar un objeto de persona ya existente 
        Persona personaActualizar = new Persona(4, "Kevin", "Rodriguez", "kdrb@outlook.com", "0984526973");
        personaDao.actualizar(personaActualizar);*/
        
        /* eliminar un registro */
        Persona personaEliminada = new Persona(3);
        personaDao.eliminar(personaEliminada);
        
        List<Persona> personas = personaDao.seleccionar();
        /* es recomendable usar una función lamda */
        personas.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
    }
    
}
