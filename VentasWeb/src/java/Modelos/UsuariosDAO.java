package Modelos;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class UsuariosDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Usuarios Validar(int cedula, String password){
        Usuarios usuarios = new Usuarios();
        String consulta = "SELECT * FROM usuarios WHERE cedula=? AND password=?";
        con = cn.Conexion();
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, cedula);
            ps.setString(2, password);
            rs = ps.executeQuery();
            rs.next();
            do{
                usuarios.setId(rs.getInt("id"));
                usuarios.setCedula(rs.getInt("cedula"));
                usuarios.setNombre(rs.getString("nombre"));
                usuarios.setCorreo(rs.getString("correo"));
                usuarios.setPassword(rs.getString("password"));
                usuarios.setEstado(rs.getString("estado"));
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
}
