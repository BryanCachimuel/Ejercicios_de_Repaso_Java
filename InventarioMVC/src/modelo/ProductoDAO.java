package modelo;

import base_datos.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class ProductoDAO {
    ConexionBD conexion = new ConexionBD();  // instancia de la conexión hacia la base de datos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarProductos(){
        String sql = "SELECT * FROM productos";
        List<ProductoDTO> lista = new ArrayList<>();
        try {
            con = conexion.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                ProductoDTO producto = new ProductoDTO();
                /* los números hacen referencia a la columna de los atributos de la tabla productos*/
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                producto.setStock(rs.getInt(4));
                lista.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los productos: " + e);
        }
        return lista;
    }
    
    public void agregarProducto(ProductoDTO producto){
        String sql = "INSERT INTO productos(nombre,precio,stock) VALUES(?,?,?)";
        try {
            con = conexion.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El Producto ya existe, no se puede registrar en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error al agregar el producto: " + e);
        }
    }
    
    public void actualizarProducto(ProductoDTO producto){
        String sql = "UPDATE productos SET nombre=?,precio=?,stock=? WHERE codigo=?";
        try {
            con = conexion.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto: " + e);
        }
    }
    
    public void eliminarProducto(int idproducto){
        String sql = "DELETE FROM productos WHERE codigo="+idproducto;
        try {
            con  = conexion.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Errror al eliminar el producto: " + e);
        }
    }
    
    public void buscarPorId(ProductoDTO producto){
        String sql = "SELECT * FROM productos WHERE id=?";
        try {
            con = conexion.conectarBaseDatos();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());
            rs = ps.executeQuery();
            
            if(rs.next()){
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println("No se a podido encontrar el producto");
        }
    }
}
