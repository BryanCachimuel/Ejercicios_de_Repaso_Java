package test;

import ec.com.ib.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");  // PersonaPU es llamado desde el archivo persistence.xml del name de la etiqueta persistence-unit
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();  // para poder comenzar a trabajar con la base de datos
        
        tx.begin();  // Inicia la transacción
        Persona persona = new Persona("Franklin", "Vallejo", "fwvr@gmail.com", "0963789634");
        log.debug("Objeto a persistir: " + persona);
        em.persist(persona);    // Persistimos el objeto
        tx.commit();           // terminamos la transacción
        log.debug("Objeto persistido: " + persona);
        em.close();
        
    }
}
