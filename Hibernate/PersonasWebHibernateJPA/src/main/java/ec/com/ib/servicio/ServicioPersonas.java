package ec.com.ib.servicio;

import ec.com.ib.dao.PersonaDAO;
import ec.com.ib.domain.Persona;
import java.util.List;

public class ServicioPersonas {
    
    private PersonaDAO personaDao;

    public ServicioPersonas() {
        this.personaDao = new PersonaDAO();
    }
    
    public List<Persona> listarPersonas(){
        return this.personaDao.listar();
    }
    
}
