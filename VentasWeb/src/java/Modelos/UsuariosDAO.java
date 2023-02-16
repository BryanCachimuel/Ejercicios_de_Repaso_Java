package Modelos;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
     int respuesta;
    
    public Usuarios Validar(int cedula, String password){
        Usuarios usuarios = new Usuarios();
        String consulta = "SELECT * FROM usuarios WHERE cedula=? AND password=?";   
        try {
            con = cn.Conexion();
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
    
    public List Listar(){
        String consulta = "SELECT * FROM usuarios";
        List<Usuarios> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setCedula(rs.getInt("cedula"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPassword(rs.getString("password"));
                usuario.setRol(rs.getString("rol"));
                usuario.setEstado(rs.getString("estado"));  
                lista.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public int Agregar(Usuarios usuarios){
        String consulta = "INSERT INTO usuarios(cedula,nombre,correo,password,rol,estado) VALUES(?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.setInt(1, usuarios.getCedula());
            ps.setString(2, usuarios.getNombre());
            ps.setString(3, usuarios.getCorreo());
            ps.setString(4, usuarios.getPassword());
            ps.setString(5, usuarios.getRol());
            ps.setString(6, usuarios.getEstado());
            respuesta = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    public Usuarios ListarPorId(int id){
        Usuarios usuarios = new Usuarios();
        String consulta = "SELECT * FROM usuarios WHERE id=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                usuarios.setCedula(rs.getInt(2));
                usuarios.setNombre(rs.getString(3));
                usuarios.setCorreo(rs.getString(4));
                usuarios.setPassword(rs.getString(5));
                usuarios.setRol(rs.getString(6));
                usuarios.setEstado(rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
}
