package ec.com.ib.sga.cliente.ciclovidajpa;

import ec.com.ib.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //Inicia la transaccion
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Paso 2. Ejecuta SQL de tipo Select 
        // El id proporcionado debe existir en la base de datos
        Persona persona1 = em.find(Persona.class, 2);
        
        // Paso 3. Termina la transacción 1
        tx.commit();
        
        // Objeto en estado detache
        log.debug("Objeto Recuperado: " + persona1);
        
        // Paso 4. setValue(nuevo valor)
        persona1.setApellido("Rodriguez");
        
        // Paso 5. Inicia transacción 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        // Paso 6. Modificamos el objeto
        em.merge(persona1);
        
        // Paso 7. Terminamos la transacción 2
        tx2.commit();
        
        // Objeto en estado detache ya modificado
        log.debug("Objeto Recuperado: " + persona1);

        //Cerramos el entity manager
        em.close();

    }

}
