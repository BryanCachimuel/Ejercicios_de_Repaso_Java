package ec.com.ib.sga.cliente.ciclovidajpa;

import ec.com.ib.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;


public class PersistirObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        
        //Paso 1. Crea nuevo objeto
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Richard", "Tarupi", "rftc@gmail.com", "0987546398");
        
        //Paso 2. Inicia transaccion
        tx.begin();
        
        //Paso 3. Ejecuta SQL
        em.persist( persona1 );
        
        log.debug("Objeto persistido - aun sin commit:" + persona1);
        
        //Paso 4. commit/rollback
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto persistido - estado detached:" + persona1);
        
        //Cerramos el entity manager
        em.close();

    }
}
