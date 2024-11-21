package datos;

import static datos.Conexion.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public class UsuarioDaoJDBC implements UsuarioDAO{
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioDaoJDBC() {
    }

    public UsuarioDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    @Override
    public List<UsuarioDTO> select() throws SQLException{
        Connection conn = null;
        PreparedStatement psmtm = null;
        ResultSet rs = null;
        UsuarioDTO usuario;
        List<UsuarioDTO> usuarios = new ArrayList<>();
        
        try {
            conn = getConnection();
            psmtm = conn.prepareStatement(SQL_SELECT);
            rs = psmtm.executeQuery();
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String usuarioNombre = rs.getString("usuario");
                String password = rs.getString("password");
                
                usuario = new UsuarioDTO(idUsuario, usuarioNombre, password);
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
    
    @Override
    public int insert(UsuarioDTO usuario) throws SQLException{
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
    
    @Override
    public int update(UsuarioDTO usuario) throws SQLException{
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
    
    @Override
    public int delete(UsuarioDTO usuario) throws SQLException{
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
