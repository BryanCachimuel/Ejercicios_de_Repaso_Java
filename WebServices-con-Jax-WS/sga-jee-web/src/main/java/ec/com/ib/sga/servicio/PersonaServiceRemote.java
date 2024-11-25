package ec.com.ib.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import ec.com.ib.sga.domain.Persona;

/*
    TERCER PASO: Se crea la Interfaz PersonaServiceRemote, para acceder a esta interfaz de manera remota se pone el notación Remote
*/

@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
