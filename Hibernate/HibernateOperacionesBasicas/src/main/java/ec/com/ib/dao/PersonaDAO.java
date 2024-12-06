package ec.com.ib.dao;

import ec.com.ib.domain.Persona;
import jakarta.persistence.*;
import java.util.List;

public class PersonaDAO {
    
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        // se manda a llamar a la unidad de persistencia establecida en el archivo persistence.xml
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public void listar(){
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for(Persona p : personas){
            System.out.println("personas: " + p);
        }
    }
    
    public void insertar(Persona persona){
        try {
            em.getTransaction().begin();  // inicio de la transacción
            em.persist(persona);
            em.getTransaction().commit(); // fin de la transacción
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        /* esto se hace ya que se está trabajando de manera local ya con un servidor esto se realizaría automaticamente */
        /*finally{
            if(em != null){
                em.close();
            }
        }*/
    }
    
    public void modificar(Persona persona){
        try {
            em.getTransaction().begin();  // inicio de la transacción
            em.merge(persona);
            em.getTransaction().commit(); // fin de la transacción
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        /*finally{
            if(em != null){
                em.close();
            }
        }*/
    }
    
    public void eliminar(Persona persona){
        try {
            em.getTransaction().begin();  // inicio de la transacción
            em.remove(em.merge(persona));
            em.getTransaction().commit(); // fin de la transacción
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        /*finally{
            if(em != null){
                em.close();
            }
        }*/
    }
    
    public Persona buscarPersonaPorId(Persona p){
        return em.find(Persona.class, p.getIdPersona());
    }
    
}
