package test;

import ec.com.ib.dao.PersonaDAO;
import ec.com.ib.domain.Persona;


public class OperacionesHibernateJPA {
    
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        /* Para realizar un registro */
        Persona persona = new Persona();
        persona.setNombre("Maritza");
        persona.setApellido("Paspuezan");
        persona.setEmail("mp@gmail.com");
        persona.setTelefono("0985741236");
        //personaDao.insertar(persona);
        
        /* Para actualizar un registro */
        Persona personaModificada = new Persona();
        personaModificada.setIdPersona(17);
        
        personaModificada = personaDao.buscarPersonaPorId(personaModificada);
        
        personaModificada.setNombre("Richard");
        personaModificada.setEmail("rftc@outlook.com");
        //personaDao.modificar(personaModificada);
        
        /* Para eliminar un registro */
        Persona personaEliminada = new Persona();
        personaEliminada.setIdPersona(6);
        
        personaModificada = personaDao.buscarPersonaPorId(personaEliminada);
        personaDao.eliminar(personaEliminada);
        
        personaDao.listar();
    }
    
}
