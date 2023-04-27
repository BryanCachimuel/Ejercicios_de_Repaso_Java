package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */

/* aquí se crearan los métodos para extraer los datos de la base de datos*/
public class VendedorDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    
    Connection con;
    Conexion cn = new Conexion();
    
    Vendedor v = new Vendedor();
    
    public EntidadVendedor ValidarVendedor(String dni, String user){
       EntidadVendedor ev = new EntidadVendedor();
       String sql = "SELECT * FROM vendedor WHERE Dni=? AND User=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while(rs.next()){
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNombre(rs.getString(3));
                ev.setTelefono(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta");
        }
       return ev;
    }

    @Override
    public List listar() {
        List<Vendedor> listaVendedor = new ArrayList<>();
        String sql = "SELECT * FROM vendedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Vendedor vd = new Vendedor();
                vd.setId(rs.getInt(1));
                vd.setDni(rs.getString(2));
                vd.setNombres(rs.getString(3));
                vd.setTelefono(rs.getString(4));
                vd.setEstado(rs.getString(5));
                vd.setUser(rs.getString(6));
                listaVendedor.add(vd);
            }
        } catch (SQLException e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return listaVendedor;
    }

    @Override
    public int aniadir(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO vendedor(Dni,Nombres,Telefono,Estado,User) VALUES(?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE vendedor SET Dni=?,Nombres=?,Telefono=?,Estado=?,User=? WHERE IdVendedor=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM vendedor WHERE IdVendedor=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
    }
    
    public int registrarUsuario(Object[] v){
        int r = 0;
        String sql = "INSERT INTO vendedor(Dni,Nombres,Telefono,User) VALUES(?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, v[0]);
            ps.setObject(2, v[1]);
            ps.setObject(3, v[2]);
            ps.setObject(4, v[3]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return r;
    }
}
