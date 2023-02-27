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
public class VentaDAO {
   Connection con; 
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public String ObtenerNumeroFactura(){
        String numerofactura = "";
        String consulta = "SELECT MAX(numerofactura) FROM ventas";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                numerofactura = rs.getString(1);
                System.err.println("numfactura"+numerofactura);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numerofactura;
    }
    
    public void RegistrarVenta(Venta venta){
        String consulta = "INSERT INTO ventas(numerofactura,idclienteventa,idempleadoventa,fechaventa,totalventa,estado) VALUES(?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.setString(1, venta.getNumeroComprobante());
            ps.setInt(2, venta.getIdCliente());
            ps.setInt(3, venta.getIdEmpleado());
            ps.setString(4, venta.getFecha());
            ps.setDouble(5, venta.getMonto());
            ps.setString(6, venta.getEstado());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void GuardarDetalleVenta(Venta venta){
        String consulta = "INSERT INTO detalleventa(idproducto,idventa,cantidadproducto,precioventa) VALUES(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.setInt(1, venta.getIdProducto());
            ps.setInt(2, venta.getIdVenta());
            ps.setInt(3, venta.getCantidad());
            ps.setDouble(4, venta.getPrecio());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int ObtenerMaximoIdVenta(){
        int idVenta = 0;
        String consulta = "SELECT MAX(idventa) FROM ventas";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                idVenta = rs.getInt(1);
                System.out.println("max: " + idVenta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idVenta;
    }
    
    public void EliminarVenta(int idVenta){
        String consulta = "DELETE FROM ventas WHERE idventa=" + idVenta;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(consulta);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
