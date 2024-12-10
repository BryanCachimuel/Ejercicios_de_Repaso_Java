package ec.com.ib.dao;

import javax.persistence.*;

/* Es de tipo abstrac para no poder crear objetos de este tipo de clase */
public abstract class GenericDAO {
    
    /* para que esta clase sea accedida desde sus clases hijas */
    protected static EntityManager em;
    
    private static EntityManagerFactory emf;
    private static final String PU = "HibernateJpaPU";
}
