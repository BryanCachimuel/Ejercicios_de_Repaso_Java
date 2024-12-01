package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;


public class TestPersonaServiceRS {
    
    /* Variables que vamos a utilizar */
    private static final String URL_BASE = "http://localhost:8095/sga-jee-web/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        cliente = ClientBuilder.newClient();
        
        //Leer una persona (método get) 
        webTarget = cliente.target(URL_BASE).path("/personas");
        
        // Proporcionamos un idPersona valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
        
        System.out.println("\n");
        
        // Leer todas las personas (método get con readEntity de tipo List<>)
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        System.out.println("Personas Recuperadas");
        imprimirPersonas(personas);
        
        System.out.println("\n");
        
        //Agregar una persona (método post)
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Richard");
        nuevaPersona.setApellido("Tarupí");
        nuevaPersona.setEmail("rtc@gmail.com");
        nuevaPersona.setTelefono("0981245368");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println(response.getStatus());
        
        // Recuperamos la persona recien agregada
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada: " + personaRecuperada);
        
        System.out.println("\n");
        
        // Modificar la persona (método put)
        Persona personaModificar = personaRecuperada;
        personaModificar.setNombre("Fernando");
        String pathId = "/" + personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona modificada: " + response.readEntity(Persona.class));
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for(Persona p : personas){
            System.out.println("Personas:" + p);
        }
    }
}
