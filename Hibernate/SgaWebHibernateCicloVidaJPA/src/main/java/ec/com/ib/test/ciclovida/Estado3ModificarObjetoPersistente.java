package ec.com.ib.test.ciclovida;

import ec.com.ib.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado3ModificarObjetoPersistente {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        // Se define la variable
        Contacto contacto = null;
        
         // recuperamos el objeto
         // 1. Transitivo
        contacto = em.find(Contacto.class, 3);
        
        // Modificamos el objeto
        contacto.setNombre("Lene Otavalo");
        contacto.setTelefono("0984129876");
        contacto.setEmail("lo@outlook.com");
        
        em.getTransaction().begin();
        
         // 2. persistente
        //em.persist(contacto);
        em.merge(contacto);
    
        em.getTransaction().commit();
        
        // detached 
        System.out.println("contacto = " + contacto);
    }
    
}
