package ec.com.ib.sga.datos;

import ec.com.ib.sga.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/*
    Esta clase debe ser un EJB para que pueda injectarse el EntityManager de JPA el persistence-util
*/

@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    // Inyectando la unidad de persistencia
    // Inyectar la unidad de persistencia mediante el api de JPA
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona finfPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona));
    }
    
    
}
