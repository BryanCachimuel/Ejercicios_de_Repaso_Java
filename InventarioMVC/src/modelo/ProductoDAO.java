package modelo;

import base_datos.ConexionBD;
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
            ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e);
        }
    }
}
