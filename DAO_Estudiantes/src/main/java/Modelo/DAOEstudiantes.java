package Modelo;

import dao.Conexion;
import interfaces.DAO_Estudiantes;
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
public class DAOEstudiantes implements DAO_Estudiantes {

    Conexion conexion = Conexion.getInstance();

    @Override
    public void registrar(Estudiantes estudiantes) {
        try {
            Connection conectar = conexion.conectar();
            String sql = "INSERT INTO personas(cedula,nombres,edad,direccion) VALUES(?,?,?,?)";
            PreparedStatement insertar = conectar.prepareStatement(sql);
            //insertar.setInt(1, null);
            insertar.setString(1, estudiantes.getCedula());
            insertar.setString(2, estudiantes.getNombres());
            insertar.setInt(3, estudiantes.getEdad());
            insertar.setString(4, estudiantes.getDireccion());
            insertar.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void actualizar(Estudiantes estudiantes) {
        try {
          Connection conectar = conexion.conectar();
          String sql = "UPDATE personas SET cedula=?,nombres=?,edad=?,direccion=? WHERE id=?";
          PreparedStatement actualizar = conectar.prepareStatement(sql);
          actualizar.setString(1, estudiantes.getCedula());
          actualizar.setString(2, estudiantes.getNombres());
          actualizar.setInt(3, estudiantes.getEdad());
          actualizar.setString(4, estudiantes.getDireccion());
          actualizar.setInt(5, estudiantes.getId());
          actualizar.executeUpdate();
        } catch (SQLException ex) {
             Logger.getLogger(DAOEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Estudiantes estudiantes) {
        try {
            Connection conectar = conexion.conectar();
            String sql = "DELETE FROM personas WHERE id=?";
            PreparedStatement eliminar = conectar.prepareStatement(sql);
            eliminar.setInt(1, estudiantes.getId());
            eliminar.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buscar(Estudiantes estudiantes) {
        try {
          Connection conectar = conexion.conectar();
          String sql = "SELECT * FROM personas WHERE id=?";
          PreparedStatement buscar = conectar.prepareStatement(sql);
          buscar.setInt(1, estudiantes.getId());
          
          ResultSet consulta = buscar.executeQuery();
          if(consulta.next()){
              estudiantes.setCedula(consulta.getString("cedula"));
              estudiantes.setNombres(consulta.getString("nombres"));
              estudiantes.setEdad(Integer.parseInt(consulta.getString("edad")));
              estudiantes.setDireccion(consulta.getString("direccion"));
          }
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
