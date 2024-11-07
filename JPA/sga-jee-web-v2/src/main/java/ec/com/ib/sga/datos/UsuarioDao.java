package ec.com.ib.sga.datos;

import ec.com.ib.sga.domain.Usuario;
import java.util.List;

public interface UsuarioDao {
    
     public List<Usuario> findAllUsuario();
    
    public Usuario findUsuarioById(Usuario usuario);
    
    public Usuario findUsuarioByEmail(Usuario usuario);
    
    public void insertUsuario(Usuario usuario);
    
    public void updateUsuario(Usuario usuario);
    
    public void deleteUsuario(Usuario usuario);
}
