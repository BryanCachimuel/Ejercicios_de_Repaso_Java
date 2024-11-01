package ec.com.ib.sga.servicio;

import ec.com.ib.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/*
    PASO CUARTO: Se crea la clase PersonaServiceImpl(Impl-> implementación), esta clase tiene la notación Stateless que la convierte en un ejb
*/

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    Persona persona1 = new Persona(1, "Lennin", "Loyo", "ll@gmaill.com", "0958741256");
    Persona persona2 = new Persona(2, "Brandon", "Lotton", "bl@gmail.com", "0985256339");
    
    @Override
    public List<Persona> listarPersona() {  
        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        
    }

    @Override
    public void actualizarPersona(Persona persona) {
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        
    }
    
}
