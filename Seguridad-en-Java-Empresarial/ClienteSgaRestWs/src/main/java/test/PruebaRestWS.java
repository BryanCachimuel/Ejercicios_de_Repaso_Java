package test;

import domain.Persona;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
 
public class PruebaRestWS {
    
    public static void main(String[] args) {
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clienteConfig = new ClientConfig();
        clienteConfig.register(feature);
        
        Client cliente = ClientBuilder.newClient(clienteConfig);
        
        WebTarget webTarget = cliente.target("http://localhost:8095/sga-jee-web/webservice").path("/personas");
        //Proporciona,os un id valido
        Persona persona = webTarget.path("/5").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona Recuperada: " + persona);
    }
    
}
