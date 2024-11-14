package ec.com.ib.sga.cliente.jpql;

import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.domain.Usuario;
import java.util.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PruebaJPQL {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        // 1. Consulta de todos los objetos de tipo persona
        log.debug("\n1. Consulta todas las personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        // Consulta de la persona con id=2
        log.debug("\n2. Consulta de la persona con id=2");
        jpql = "select p from Persona p where p.idPersona = 2";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);
        
        // 3. Consulta de la persona por nombre
        jpql = "select p from Persona p where p.nombre = 'Cinthya'";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona p: personas){
            log.debug(p);
        }
    }
    
}
