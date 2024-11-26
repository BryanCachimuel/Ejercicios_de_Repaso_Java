package ec.com.ib.sga.cliente.criteria;

import ec.com.ib.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import org.apache.logging.log4j.*;


public class PruebaApiCriteria {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;
        
        // Query utilizando el API de Criteria
        //1. Consulta de todas las personas
        
        // Paso 1. El objetivo EntityManager crea instancia CriteriaBuilder
        cb = em.getCriteriaBuilder();
        
        // Paso 2. Se crea un objeto CriteriaQuery
        criteriaQuery = cb.createQuery(Persona.class);
        
        // Paso 3. Creamos el objeto raíz de query
        fromPersona = criteriaQuery.from(Persona.class);
        
        // Paso 4. Seleccionamos lo necesario del from 
        criteriaQuery.select(fromPersona);
        
        // Paso 5. Creamos el query typeSafe
        query = em.createQuery(criteriaQuery);
        
        // Paso 6. Ejecutamos la consulta
        personas = query.getResultList();
        
        //mostrarPersonas(personas);
        
        //2-a. Consulta de la persona con id = 6
        // jpql = "select p from Persona p where p.idPersona = 6"
        log.debug("\n2-a. Consulta de la persona con id = 6");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"),6));  // forma de realizar la consulta con criteria
        persona = em.createQuery(criteriaQuery).getSingleResult();
        
        log.debug(persona);
        
        // Utilización de predicados para obtener varios criterios
        //2-b. Consulta de la persona con id = 6
        log.debug("\n2-b. Consulta de la persona con id = 6");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        criteriaQuery.select(fromPersona);
        
        // La clase Predicate permite agregar varios criterios dinamicamente
        List<Predicate> criterios = new ArrayList<Predicate>();
        
        // Verificamos si tenemos criterios que agregar
        Integer idPersonaParam = 6;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add(cb.equal(fromPersona.get("idPersona"),parameter));
        
        // Se agregan los criterios 
        if(criterios.isEmpty()){
            throw new RuntimeException("Sin Criterios");
        }
        else if(criterios.size() == 1){
            criteriaQuery.where(criterios.get(0));
        }
        else{
            CriteriaQuery<Persona> where = criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        // Se ejecuta el query
        persona = query.getSingleResult();
        log.debug(persona);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona persona: personas){
            log.debug(persona);
        }
    }
}
