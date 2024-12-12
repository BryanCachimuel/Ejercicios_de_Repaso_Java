package ec.com.ib.test.ciclovida;

import ec.com.ib.domain.Contacto;
import javax.persistence.*;

public class Estado2RecuperarObjetoPersistente {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        // Se define la variable
        Contacto contacto = null;
        
        em.getTransaction().begin();
        
        // recuperamos el objeto
        contacto = em.find(Contacto.class, 3);
        
        em.getTransaction().commit();
        
        // detached 
        System.out.println("contacto = " + contacto);
    }
    
}
