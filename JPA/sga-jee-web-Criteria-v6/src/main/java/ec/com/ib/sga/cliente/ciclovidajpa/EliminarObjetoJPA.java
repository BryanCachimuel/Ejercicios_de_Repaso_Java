package ec.com.ib.sga.cliente.ciclovidajpa;

import static ec.com.ib.sga.cliente.ciclovidajpa.ActualizarObjetoSesionLarga.log;
import ec.com.ib.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        // Paso 2. Ejecuta SQL de tipo Select 
        Persona persona1 = em.find(Persona.class, 4);
        
         // Paso 3. Termina la transacción 1
         tx.commit();

        // Objeto en estado detache
        log.debug("Objeto encontrado: " + persona1);
        
        // Paso 4. Inicia transacción 2
        EntityTransaction tx2 = em.getTransaction();
        tx.begin();
        
        // Paso 5. Ejecuta eñ SQL que es un delete
        em.remove(em.merge(persona1));
        
        // Paso 6. Termina la transacción 2
        tx2.commit();
        
         // Objeto en estado detache
        log.debug("Objeto eliminado: " + persona1);
       
        //Cerramos el entity manager
        em.close();

    }
}
