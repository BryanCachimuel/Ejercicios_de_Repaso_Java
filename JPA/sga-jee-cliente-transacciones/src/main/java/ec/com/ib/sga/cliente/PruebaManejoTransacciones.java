package ec.com.ib.sga.cliente;

import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.servicio.PersonaServiceRemote;
import javax.naming.*;
import org.apache.logging.log4j.*;

public class PruebaManejoTransacciones {
    
    static Logger log = LogManager.getRootLogger(); 
    
    public static void main(String[] args) {
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web-Transacciones-v7/PersonaServiceImpl!ec.com.ib.sga.servicio.PersonaServiceRemote");
            log.debug("Iniciando prueba Manejo transaccional PersonaService");
            
            // Buscar un objeto persona
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(2));
            log.debug("Persona recuperada: " + persona1);
            
            // Cambiar el apellido el cual tiene un error en la cantidad de caracteres
            persona1.setApellido("Toapantaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            
            // Cambiar el apellido
            persona1.setApellido("Toapanta");
            
            personaService.actualizarPersona(persona1);
            log.debug("Objeto Modificado: " + persona1);
            log.debug("Fin prueba EJB transaccional");
            
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
        
    }
    
}
