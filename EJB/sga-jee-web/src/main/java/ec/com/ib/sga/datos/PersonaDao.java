package ec.com.ib.sga.datos;

import ec.com.ib.sga.domain.Persona;
import java.util.List;

public interface PersonaDao {
    
    public List<Persona> findAllPersonas();
    
    public Persona findPersonaById(Persona persona);
    
    public Persona finfPersonaByEmail(Persona persona);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
    
}
