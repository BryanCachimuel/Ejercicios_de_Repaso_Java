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
        domicilio.setCalle("Obispo Mosquera");
        domicilio.setNoCasa("5-96");
        domicilio.setCiudad("Ibarra");
        
        Contacto contacto = new Contacto();
        contacto.setNombre("Nelson Cacoango");
        contacto.setEmail("nccc@gmail.com");
        contacto.setTelefono("0987659873");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Camilo");
        alumno.setApellido("Cacoango");
        alumno.setEdad(10);
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("Alumno: " + alumno);
        
    }
    
}
