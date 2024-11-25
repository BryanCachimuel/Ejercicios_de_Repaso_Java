package ec.com.ib.sga.servicio;

import ec.com.ib.sga.domain.Persona;
import java.util.List;
import javax.jws.*;

@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    public List<Persona> listarPersonas();
}
