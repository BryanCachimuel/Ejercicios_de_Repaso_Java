package ec.com.ib.sga.servicio;

import ec.com.ib.sga.domain.Persona;
import java.util.List;
import javax.ejb.Local;

/*
    En la clase pasada se usaba un entorno remoto para la interfaz pero para este caso se usará una forma Local
*/

@Local
public interface PersonaService {
    
    public List<Persona> listarPersona();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
