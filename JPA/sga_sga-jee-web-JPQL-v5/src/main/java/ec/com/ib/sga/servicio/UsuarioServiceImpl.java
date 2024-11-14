package ec.com.ib.sga.servicio;

import ec.com.ib.sga.datos.UsuarioDao;
import ec.com.ib.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/*
   Se crea la clase UsuarioServiceImpl(Impl-> implementación), esta clase tiene la notación Stateless que la convierte en un ejb
*/

@Stateless
public class UsuarioServiceImpl implements UsuarioServiceRemote, UsuarioService{
    
    // con esta notación tenemos acceso completo hacia la capa de datos
    @Inject
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuario();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return usuarioDao.findUsuarioById(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorNombre(Usuario usuario) {
        return usuarioDao.findUsuarioByUsername(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.insertUsuario(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDao.updateUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDao.deleteUsuario(usuario);
    }

    
    
}
