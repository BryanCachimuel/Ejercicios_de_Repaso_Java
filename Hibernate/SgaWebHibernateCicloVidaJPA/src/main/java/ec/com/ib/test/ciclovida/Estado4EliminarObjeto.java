package ec.com.ib.test.ciclovida;

import ec.com.ib.domain.Contacto;
import javax.persistence.*;

public class Estado4EliminarObjeto {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        // Se define la variable
        Contacto contacto = null;
        
         // recuperamos el objeto
         // 1. Transitivo
        contacto = em.find(Contacto.class, 3);
            
        em.getTransaction().begin();
        
         // 2. remove
         // el merge realiza una sicronización con la base de datos y luego se realiza la eliminación con el remove
        em.remove(em.merge(contacto));
    
        em.getTransaction().commit();
        
        // 3. Estado de transitivo 
        System.out.println("contacto = " + contacto);
        
    }
    
}
