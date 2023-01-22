package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class PersonaDAO {
    Conexion  conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        List<Persona> datos = new ArrayList<>();
        String sql = "SELECT * FROM persona";
        try {
            con = conectar.getConnection();
            ps  = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Persona p = new Persona();
                p.setId(rs.getInt("id"));
                p.setNombres(rs.getString("nombres"));
                p.setCorreo(rs.getString("correo"));
                p.setTelefono(rs.getString("telefono"));
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    
    public int agregar(Persona p){
        String sql = "INSERT INTO persona(nombres, correo, telefono) VALUES(?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getCorreo());
            ps.setString(3, p.getTelefono());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return 1;
    }
    
    public int actualizar(Persona p){
        int respuesta = 0;
        String sql = "UPDATE persona SET nombres=?,correo=?,telefono=? WHERE id=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getCorreo());
            ps.setString(3, p.getTelefono());
            ps.setInt(4, p.getId());
            respuesta = ps.executeUpdate();
            if(respuesta == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    public void eliminar(int id){
        String sql = "DELETE FROM persona WHERE id="+id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
