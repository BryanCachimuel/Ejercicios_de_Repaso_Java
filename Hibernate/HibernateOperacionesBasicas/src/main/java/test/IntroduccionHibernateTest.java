package test;

import ec.com.ib.domain.Persona;
import jakarta.persistence.*;
import java.util.List;

public class IntroduccionHibernateTest {
    
    public static void main(String[] args) {
        /* hql -> hibernate query language */
        String hql = "SELECT p FROM Persona p";
        
        /* se manda a llamar al nombre dado en la unidad de persistencia */
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("IntroduccionHibernate");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        
        List<Persona> personas = query.getResultList();
        for(Persona p : personas){
            System.out.println("Persona : " + p);
        }
    }
    
}
