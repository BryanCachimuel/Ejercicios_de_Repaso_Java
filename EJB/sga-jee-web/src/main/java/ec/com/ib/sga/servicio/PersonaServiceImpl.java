package ec.com.ib.sga.servicio;

import ec.com.ib.sga.datos.PersonaDao;
import ec.com.ib.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/*
    PASO CUARTO: Se crea la clase PersonaServiceImpl(Impl-> implementación), esta clase tiene la notación Stateless que la convierte en un ejb
*/

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{
    
    // con esta notación tenemos acceso completo hacia la capa de datos
    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersona() {  
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.finfPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void actualizarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
