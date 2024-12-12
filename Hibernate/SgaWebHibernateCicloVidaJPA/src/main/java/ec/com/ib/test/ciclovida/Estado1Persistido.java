package ec.com.ib.test.ciclovida;

import ec.com.ib.domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        // 1. Estado transitivo
        Contacto contacto = new Contacto();
        contacto.setNombre("Marlene Otavalo");
        contacto.setEmail("mo@gmail.com");
        contacto.setTelefono("0985736982");
        
        // 2. Persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        //3. detached (separado)
        System.out.println("contacto = " + contacto);
    }
    
}
