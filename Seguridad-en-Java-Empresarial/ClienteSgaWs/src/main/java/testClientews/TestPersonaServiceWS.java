package testClientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

public class TestPersonaServiceWS {
    
    public static void main(String[] args) {
        
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando Servicio listarPersonas ws");
        List<Persona> personas = personaService.listarPersonas();
        for(Persona persona:personas){
            System.out.println("Persona idPersona: " + persona.getIdPersona()
                               + ", nombre: " + persona.getNombre() 
                               + ", apellido: " + persona.getApellido() 
                               + ", email: " + persona.getEmail()
                               + ", teléfono: " + persona.getTelefono());
        }
        System.out.println("Fin de Servicio de listar personas ws");
    }
    
}
