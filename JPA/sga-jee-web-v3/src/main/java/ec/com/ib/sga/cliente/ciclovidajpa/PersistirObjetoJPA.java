package ec.com.ib.sga.cliente.ciclovidajpa;

import ec.com.ib.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class PersistirObjetoJPA {
 
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        // Inicia la transacción
        
        // Paso 1. Crea un nuevo objeto
        // Objeto en estado transitivo
        Persona persona = new Persona("Kevin", "Endara", "kjel@gmail.com", "0968789635");
        
        // Paso 2. Inicia transacción
        tx.begin();
        
        // Paso 3. Ejecuta SQL
        em.persist(persona);
        
        log.debug("Objeto persistido - aun sin commit: " + persona);
        
        // Paso 4. commit/rollback
        tx.commit();
        
        // Objeto en estado detached
        log.debug("Objeto persistido - estado detached: " + persona);
        
        // cerramos el entity manager
        em.close();
    }
}
