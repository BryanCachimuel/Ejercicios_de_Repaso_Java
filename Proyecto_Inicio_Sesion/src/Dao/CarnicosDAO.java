package Dao;

import Interface.MetodosUtil;
import Modelo.Carnicos;
import conexion.conexionbd;
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
public class CarnicosDAO implements MetodosUtil{
    
    conexionbd conexion = conexionbd.getInstance();
    
    @Override
    public void registrar(Carnicos carnicos) {
        try {
            Connection cn = conexion.conectarbd();
            String sql = "INSERT INTO carnicos(nombre_carnico,precio_carnico_kilos,precio_carnico_libras,cantidad,procedencia,tipo_carnico) VALUES(?,?,?,?,?,?)";
            PreparedStatement insertar = cn.prepareStatement(sql);
            insertar.setString(1, carnicos.getCarnicos());
            insertar.setDouble(2, carnicos.getPrecio_carnicos_kilos());
            insertar.setDouble(3, carnicos.getPrecio_carnicos_libras());
            insertar.setDouble(4, carnicos.getCantidad());
            insertar.setString(5, carnicos.getProcedencia());
            insertar.setString(6, carnicos.getTipo_carnico());
            insertar.executeUpdate();
            
            conexion.cerrarConexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CarnicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Carnicos carnicos) {
        try {
            Connection cn = conexion.conectarbd();
            String sql = "UPDATE carnicos SET nombre_carnico=?,precio_carnico_kilos=?,precio_carnico_libras=?,cantidad=?,procedencia=?,tipo_carnico=? WHERE id=?";
            PreparedStatement actualizar = cn.prepareStatement(sql);
            
            actualizar.setString(1, carnicos.getCarnicos());
            actualizar.setDouble(2, carnicos.getPrecio_carnicos_kilos());
            actualizar.setDouble(3, carnicos.getPrecio_carnicos_libras());
            actualizar.setDouble(4, carnicos.getCantidad());
            actualizar.setString(5, carnicos.getProcedencia());
            actualizar.setString(6, carnicos.getTipo_carnico());
            actualizar.setInt(7, carnicos.getId_carnicos());
            actualizar.executeUpdate();
            
            conexion.cerrarConexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CarnicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Carnicos carnicos) {
        try {
            Connection cn = conexion.conectarbd();
            String sql = "DELETE FROM carnicos WHERE id=?";
            PreparedStatement eliminar = cn.prepareStatement(sql);
            eliminar.setInt(1, carnicos.getId_carnicos());
            eliminar.executeUpdate();
            
            conexion.cerrarConexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CarnicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buscar(Carnicos carnicos) {
        try {
            Connection cn = conexion.conectarbd();
            String sql = "SELECT * FROM carnicos WHERE id=?";
            PreparedStatement buscar = cn.prepareStatement(sql);
            buscar.setInt(1, carnicos.getId_carnicos());
            
            ResultSet rs = buscar.executeQuery(); 
            if(rs.next()){
                carnicos.setCarnicos(rs.getString("nombre_carnico"));
                carnicos.setPrecio_carnicos_kilos(rs.getDouble("precio_carnico_kilos"));
                carnicos.setPrecio_carnicos_libras(rs.getDouble("precio_carnico_libras"));
                carnicos.setCantidad(rs.getDouble("cantidad"));
                carnicos.setProcedencia(rs.getString("procedencia"));
                carnicos.setTipo_carnico("tipo_carnico");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CarnicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CarnicoMayorPrecio(){
        try {
            Connection cn = conexion.conectarbd();
            String sql = "SELECT nombre_carnico,MAX(precio_carnico_kilos) FROM carnicos";
            PreparedStatement mayor = cn.prepareStatement(sql);
            mayor.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CarnicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CarnicoMenorPrecio(){
        try {
            Connection cn = conexion.conectarbd();
            String sql = "SELECT nombre_carnico,MIN(precio_carnico_kilos) FROM carnicos";
            PreparedStatement mayor = cn.prepareStatement(sql);
            mayor.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CarnicosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
