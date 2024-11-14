package ec.com.ib.sga.cliente.cascade;

import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.domain.Usuario;
import javax.persistence.*;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;

public class PersistenciaCascadaJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        // Paso 1. Crea un nuevo objeto
        // Objeto en estado transitivo   
        Persona persona1 = new Persona("Cinthya", "Hernandez", "ccho@gmail.com", "0985743691");
        
        // Crear objeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("Cinthya", "123456", persona1);
        
        // Paso 2. Persistimos el objeto usuario unicamente ya que el procedimiento esta definido en cascada
        em.persist(usuario1);
        
        // Paso 3. Commit de la transacción
        tx.commit();
        
        // Objeto en estado de detache
        log.debug("Objeto persistido persona: "  + persona1);
        log.debug("Objeto persistido usuario: "  + usuario1);
        
        em.close();
    }
}
