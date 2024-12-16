package ec.com.ib.test.cascade;

import ec.com.ib.domain.Alumno;
import ec.com.ib.domain.Contacto;
import ec.com.ib.domain.Domicilio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaCascadaTest {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Alfredo Perez");
        domicilio.setNoCasa("10-04");
        domicilio.setCiudad("Ibarra");
        
        Contacto contacto = new Contacto();
        contacto.setNombreContacto("Kevin Rodriguez");
        contacto.setEmail("kdrb@gmail.com");
        contacto.setTelefono("0987423659");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("David");
        alumno.setApellido("Rodriguez");
        alumno.setEdad(18);
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("Alumno: " + alumno);
        
    }
    
}
