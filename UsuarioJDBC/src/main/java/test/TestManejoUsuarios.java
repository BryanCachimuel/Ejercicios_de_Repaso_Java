package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        Usuario usuarioNuevo = new Usuario("Fernando", "4862864");
        usuarioDao.insertar(usuarioNuevo);
        
        List<Usuario> usuarios = usuarioDao.listarUsuarios();
        
        usuarios.forEach(usuario -> {
            System.out.println("Usuarios: " + usuario);
        });
        
    }
    
}
