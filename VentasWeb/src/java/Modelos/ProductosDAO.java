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
public class ProductosDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    int respuesta;
    
    public List ListarProductos(){
        String consulta = "SELECT * FROM productos";
        List<Productos> listaproductos = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos producto = new Productos();
                producto.setId(rs.getInt("idproducto"));
                producto.setNombreproducto(rs.getString("nombreproducto"));
                producto.setDescripcionproducto(rs.getString("descripcionproducto"));
                producto.setUnidad(rs.getString("unidad"));
                producto.setPrecio(rs.getDouble("precio"));
                listaproductos.add(producto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaproductos;
    }
    
    public int AgregarProductos(Productos productos){
        String consulta = "INSERT INTO productos(nombreproducto,descripcionproducto,unidad,precio) VALUES(?,?,?,?)";
        try {
           con = cn.Conexion();
           ps = con.prepareStatement(consulta);
           ps.setString(1, productos.getNombreproducto());
           ps.setString(2, productos.getDescripcionproducto());
           ps.setString(3, productos.getUnidad());
           ps.setDouble(4, productos.getPrecio());
           respuesta = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    public Productos ListarProductoPorId(int id){
        Productos productos = new Productos();
        String consulta = "SELECT * FROM productos WHERE idproducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                productos.setNombreproducto(rs.getString(2));
                productos.setDescripcionproducto(rs.getString(3));
                productos.setUnidad(rs.getString(4));
                productos.setPrecio(rs.getDouble(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }
    
    public int ActualizarProducto(Productos productos){
        String consulta = "UPDATE productos SET nombreproducto=?,descripcionproducto=?,unidad=?,precio=? WHERE idproducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.setString(1, productos.getNombreproducto());
            ps.setString(2, productos.getDescripcionproducto());
            ps.setString(3, productos.getUnidad());
            ps.setDouble(4, productos.getPrecio());
            ps.setInt(5, productos.getId());
            respuesta = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    public void EliminarProducto(int id){
        String consulta = "DELETE FROM productos WHERE idproducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
