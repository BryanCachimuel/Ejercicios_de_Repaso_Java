package ec.com.ib.sga.cliente.ciclovidajpa;

import static ec.com.ib.sga.cliente.ciclovidajpa.ActualizarObjetoJPA.log;
import ec.com.ib.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoSesionLarga {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();

         // Paso 2. Ejecuta SQL de tipo Select 
        Persona persona1 = em.find(Persona.class, 3);
        
         // Objeto en estado detache
        log.debug("Objeto Recuperado: " + persona1);
        
        // Paso 3. setValue(nuevoValor)
        persona1.setEmail("nccc@outlook.com");
        
        persona1.setEmail("nc_cc@yahoo.es");
        
        // Paso 4. Termina la transacción 1
        tx.commit();
        
         // Objeto en estado detache
        log.debug("Objeto modificado: " + persona1);
        
        //Cerramos el entity manager
        em.close();

    }
}
