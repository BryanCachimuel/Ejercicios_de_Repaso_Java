package ec.com.ib.servicio;

import java.util.List;
import ec.com.ib.dao.PersonaDAO;
import ec.com.ib.domain.Persona;

public class ServicioPersonas {
    
    private PersonaDAO personaDao;
    
    public ServicioPersonas(){
        this.personaDao = new PersonaDAO();
    }
    
    public List<Persona> listarPersonas(){
        return this.personaDao.listar();
    }
}
