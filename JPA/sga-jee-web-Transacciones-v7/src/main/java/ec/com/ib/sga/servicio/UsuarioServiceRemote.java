package ec.com.ib.sga.servicio;

import ec.com.ib.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Remote;

/*
    Se crea la Interfaz UsuarioServiceRemote, para acceder a esta interfaz de manera remota se pone el notación Remote
*/

@Remote
public interface UsuarioServiceRemote {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    
    public Usuario encontrarUsuarioPorNombre(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
}
