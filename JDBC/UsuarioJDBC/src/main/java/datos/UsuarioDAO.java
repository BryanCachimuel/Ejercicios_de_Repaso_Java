package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioDAO() {
    }

    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
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
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException ex) {
               ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }
    
    public int insertar(Usuario usuario){
        Connection conn = null;
        PreparedStatement psmtm = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            psmtm = conn.prepareStatement(SQL_INSERT);
            psmtm.setString(1, usuario.getUsuario());
            psmtm.setString(2, usuario.getPassword());
            registros = psmtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(psmtm);
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Usuario usuario){
        Connection conn = null;
        PreparedStatement psmtm = null;
        int registroActualizado = 0;
        
        try {
            conn = getConnection();
            psmtm = conn.prepareStatement(SQL_UPDATE);
            psmtm.setString(1, usuario.getUsuario());
            psmtm.setString(2, usuario.getPassword());
            psmtm.setInt(3, usuario.getIdUsuario());
            registroActualizado = psmtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(psmtm);
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException ex) {
               ex.printStackTrace(System.out);
            }
        }
        return registroActualizado;
    }
    
    public int eliminar(Usuario usuario){
        Connection conn = null;
        PreparedStatement psmtm = null;
        int registroEliminar = 0;
        
        try {
            conn = getConnection();
            psmtm = conn.prepareStatement(SQL_DELETE);
            psmtm.setInt(1, usuario.getIdUsuario());
            registroEliminar = psmtm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(psmtm);
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException ex) {
               ex.printStackTrace(System.out);
            }
        }
        return registroEliminar;
    }
}
