package ec.com.ib.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.com.ib.sga.datos.PersonaDao;
import ec.com.ib.sga.domain.Persona;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.jws.WebService;

/*
    PASO CUARTO: Se crea la clase PersonaServiceImpl(Impl-> implementación), esta clase tiene la notación Stateless que la convierte en un ejb
*/

@Stateless
@WebService(endpointInterface = "ec.com.ib.sga.servicio.PersonaServiceWs")
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWs{
    
    // con esta notación tenemos acceso completo hacia la capa de datos
    @Inject
    private PersonaDao personaDao;
    
    @Resource
    private SessionContext contexto;
    
    @Override
    public List<Persona> listarPersonas() {
       return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        try {
            personaDao.updatePersona(persona);
        } catch (Throwable t) {
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
        }
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
