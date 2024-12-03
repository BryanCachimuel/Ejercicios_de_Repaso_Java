package test;

import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;

public class ClientePersonaService {
   
    public static void main(String[] args) {
        
        System.out.println("Iniciando llamada al EJB desde cliente");
        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!ec.com.ib.sga.servicio.PersonaServiceRemote");
        
            List<Persona> personas = personaService.listarPersonas();
            for(Persona p : personas){
                System.out.println("persona: " + p);
            }
            
            System.out.println("\nFin llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
