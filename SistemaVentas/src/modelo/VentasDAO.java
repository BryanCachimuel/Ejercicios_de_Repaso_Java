package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bryan
 */
public class VentasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int respuesta = 0;
    
    public String IdVentas(){
        String idv = "";
        String sql = "SELECT max(IdVentas) FROM ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               idv = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return idv;
    }
    
    public int GuardarVentas(Ventas v){
        Ventas ventas = new Ventas();
        String sql = "INSERT INTO ventas(IdCliente,IdVendedor,NumeroSerie,FechaVentas,Monto,Estado) VALUES(?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdVendedor());
            ps.setString(3, v.getSerie());
            ps.setString(4, v.getFecha());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return respuesta;
    }
    
    public int GuardarDetalleVentas(DetalleVentas dv){
        String sql = "INSERT INTO detalle_ventas(IdVentas,IdProducto,Cantidad,PrecioVenta) VALUES(?,?,?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, dv.getIdVentas());
           ps.setInt(2, dv.getIdProducto());
           ps.setInt(3, dv.getCantidad());
           ps.setDouble(4, dv.getPrecioVenta());                     
           ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return respuesta;
    }
    
    public String NroSerieVentas(){
        String serie = "";
        String sql = "SELECT max(NumeroSerie) FROM ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                serie = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return serie;
    }
}
