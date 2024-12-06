package test;

import ec.com.ib.dao.PersonaDAO;
import ec.com.ib.domain.Persona;


public class OperacionesHibernateJPA {
    
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        //personaDao.listar();
        
        Persona persona = new Persona();
        persona.setNombre("Maritza");
        persona.setApellido("Paspuezan");
        persona.setEmail("mp@gmail.com");
        persona.setTelefono("0985741236");
        
        //personaDao.insertar(persona);
        personaDao.listar();
    }
    
}
