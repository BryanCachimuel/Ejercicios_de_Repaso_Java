package Dao;

import Interface.MetodosUtil;
import Modelo.Carnicos;
import conexion.conexionbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        
    }

    @Override
    public void buscar(Carnicos carnicos) {
        
    }
    
}