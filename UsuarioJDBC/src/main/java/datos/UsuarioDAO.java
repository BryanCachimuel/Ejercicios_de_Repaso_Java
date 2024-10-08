package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    
    public List<Usuario> listarUsuarios(){
        Connection conn = null;
        PreparedStatement psmtm = null;
        ResultSet rs = null;
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            conn = getConnection();
            psmtm = conn.prepareStatement(SQL_SELECT);
            rs = psmtm.executeQuery();
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String usuarioNombre = rs.getString("usuario");
                String password = rs.getString("password");
                
                usuario = new Usuario(idUsuario, usuarioNombre, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(rs);
                close(psmtm);
                close(conn);
            } catch (SQLException ex) {
               ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }
    
}
