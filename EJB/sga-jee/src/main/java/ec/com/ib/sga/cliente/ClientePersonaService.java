package ec.com.ib.sga.cliente;

import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;

/*
    QUINTO PASO: Se crea una clase cliente para hacer las pruebas de funcionamiento
    SEXTO PASO: Mandamos a hacer clean a build al proyecto
    SEPTIMO PASO: Levantamos el servidor de glassfish
    OCTAVO PASO: Entramos a la opcion View Domain Admin Console
    NOVENO PASO: En la sección de Aplications nos sercioramos de que no haya ninguna aplicación para que no exista problemas al deployar la aplicación que vamos a usar
    DECIMO PASO: Cargamos el jar del ejercicio que se encuentra en el directorio target
    DECIMO PRIMER PASO: Una vez deployada la aplicación buscamos por consola del Glassfish server la opción Portable JNDI names for EJB y escogemos la primera opción tal como aparece en este ejercicio
*/

public class ClientePersonaService {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamado al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!ec.com.ib.sga.servicio.PersonaServiceRemote");
        
            List<Persona> personas = personaService.listarPersona();
            
            for(Persona persona : personas){
                System.out.println(persona);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
