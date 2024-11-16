package ec.com.ib.sga.cliente.jpql;

import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.domain.Usuario;
import java.util.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        // 1. Consulta de todos los objetos de tipo persona
        log.debug("\n1. Consulta todas las personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        // Consulta de la persona con id=2
        log.debug("\n2. Consulta de la persona con id=2");
        jpql = "select p from Persona p where p.idPersona = 2";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);

        // 3. Consulta de la persona por nombre
        jpql = "select p from Persona p where p.nombre = 'Cinthya'";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);

        // 4. Consulta de datos individuales, se crea un arreglo(tupla) de tipo object de 3 columnas
        log.debug("\n4. Consulta de datos individuales, se crea un arreglo(tupla) de tipo object de 3 columnas");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            log.debug("nombre:" + nombre + ", apellido: " + apellido + ", email: " + email);
        }

        // 5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas
        log.debug("\n5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas");
        jpql = "select p, p.idPersona from Persona p ";
        iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("Objeto persona:" + persona);
            //log.debug("id persona:" + idPersona);
        }
        
        // 6. Consulta de todas las personas
        log.debug("\n6. Consulta de todas las personas");
        jpql = "select new ec.com.ib.sga.domain.Persona(p.idPersona) from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        // 7. Regresa el valor mínimo y máximo del idPersona (scaler result)
        log.debug("\n7. Regresa el valor mínimo y máximo del idPersona (scaler result)");
        jpql = "select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
            //log.debug("idMin: " + idMin + ", idMax: " + idMax + ", count: " + count);
        }
        
        // 8. Cuenta los nombres de las personas que son distintos
        log.debug("\n8. Cuenta los nombres de las personas que son distintos");
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
        //log.debug("No. de personas con nombre distinto: " + contador);
        
        // 9. Concatena y convierte a mayuscula los nombres y apellidos 
         log.debug("\n9. Concatena y convierte a mayuscula los nombres y apellidos ");
         jpql = "select CONCAT(UPPER(p.nombre), ' ', UPPER(p.apellido)) as Nombres from Persona p";
         nombres = em.createQuery(jpql).getResultList();
         for(String nombreCompleto : nombres){
             //log.debug(nombreCompleto);
         }
         
         // 10. Obtiene el objeto persona con id igual al parámetro proporcionado
         log.debug("\n10. Obtiene el objeto persona con id igual al parámetro proporcionado");
         int idPersona = 5;
         jpql = "select p from Persona p where p.idPersona = :id";
         q = em.createQuery(jpql);
         q.setParameter("id", idPersona);
         persona = (Persona) q.getSingleResult();
         //log.debug(persona);
         
         //11. Obtiene las personas que contengan una letra a en el nombre, sin importar si es mayuscula o minuscula
         log.debug("\n11. Obtiene las personas que contengan una letra a en el nombre, sin importar si es mayuscula o minuscula");
         jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
         String parametroString = "%o%";    // es el caracter que utilizamos para el like
         q = em.createQuery(jpql);
         q.setParameter("parametro", parametroString);
         personas = q.getResultList();
         //mostrarPersonas(personas);
         
         //12. Uso de between
         log.debug("\n12. Uso de between");
         jpql = "select p from Persona p where p.idPersona between 1 and 4";
         personas = em.createQuery(jpql).getResultList();
         mostrarPersonas(personas);
         
         //13. Uso de Ordenamiento
         log.debug("\n13. Uso de Ordenamiento");
         jpql = "select p from Persona p where p.idPersona > 3 order by p.nombre desc, p.apellido desc";
         personas = em.createQuery(jpql).getResultList();
         mostrarPersonas(personas);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }

}
