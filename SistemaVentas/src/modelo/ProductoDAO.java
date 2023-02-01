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
public class ProductoDAO implements CRUD{
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Producto prod = new Producto();
    
    @Override
    public List listar() {
        List<Producto> listaproducto = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                listaproducto.add(p);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return listaproducto;
    }

    @Override
    public int aniadir(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO producto(Nombres,Precio,Stock,Estado) VALUES(?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE producto SET Nombres=?,Precio=?,Stock=?,Estado=? WHERE idProducto=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM producto WHERE idProducto=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
    }
    
}
