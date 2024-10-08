package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        /*Usuario usuarioNuevo = new Usuario("Marlene", "5101520");
        usuarioDao.insertar(usuarioNuevo);*/
        
        /*Usuario usuarioActualizar = new Usuario(5, "Michelle", "987654321");
        usuarioDao.actualizar(usuarioActualizar);*/
        
        Usuario usuarioEliminar = new Usuario(2);
        usuarioDao.eliminar(usuarioEliminar);
        
        List<Usuario> usuarios = usuarioDao.listarUsuarios();
        
        usuarios.forEach(usuario -> {
            System.out.println("Usuarios: " + usuario);
        });
        
    }
    
}
