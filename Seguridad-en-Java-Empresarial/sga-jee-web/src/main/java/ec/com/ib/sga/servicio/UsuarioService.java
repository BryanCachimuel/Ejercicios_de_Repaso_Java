package ec.com.ib.sga.servicio;

import ec.com.ib.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Local;

/*
    En la clase pasada se usaba un entorno remoto para la interfaz pero para este caso se usará una forma Local
*/

@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    
    public Usuario encontrarUsuarioPorNombre(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
}
