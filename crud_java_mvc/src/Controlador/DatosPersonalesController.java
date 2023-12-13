package Controlador;

import Configuracion.ConexionLocal;
import Interface.IGestorDatos;
import Modelos.DatosPersonales;
import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class DatosPersonalesController implements IGestorDatos<DatosPersonales>{
    
    private Connection cnn;
    private final ConexionLocal cnnNuevoAdmin = new ConexionLocal();
    
    PreparedStatement st;
    ResultSet rs;

    @Override
    public void creacion(DatosPersonales objeto) {
        try {
            // formatear fecha
            java.sql.Date fechaNacimiento = new java.sql.Date(objeto.getFecha_nacimiento().getTime());
            
           cnnNuevoAdmin.conectar();
           String sql = "INSERT INTO persona(Cedula,Nombre,Apellidos,Correo,Fecha_Nacimiento,Pais,Profesion,Telefono,rol_id)"
                        + "VALUES(?,?,?,?,?,?,?,?,?)";
           
           st = cnnNuevoAdmin.getConexion().prepareStatement(sql);
           st.setString(1, objeto.getCedula());
           st.setString(2, objeto.getNombre());
           st.setString(3, objeto.getApellido());
           st.setString(4, objeto.getCorreo());
           // pasar fecha
           st.setDate(5, fechaNacimiento);
           st.setString(6, objeto.getPais());
           st.setString(7, objeto.getProfesion());
           st.setString(8, objeto.getTelefono());
           st.setInt(9, objeto.getRol_id());
           
           st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado un nuevo registro", "Datos Guardados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "No se ha realizado el registro", "Por favor compruebe los Datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public DatosPersonales lectura(int id) {
        String sql = "SELECT Cedula,Nombre,Apellidos,Correo,Fecha_Nacimiento,Pais,Profesion,Telefono,rol_id FROM persona WHERE id= '" + id + "'";
        DatosPersonales personaTraida = new DatosPersonales();
        
        try {
            cnnNuevoAdmin.conectar();
            st = cnnNuevoAdmin.getConexion().prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                personaTraida.setCedula(rs.getString("Cedula"));
                personaTraida.setNombre(rs.getString("Nombre"));
                personaTraida.setApellido(rs.getString("Apellidos"));
                personaTraida.setFecha_nacimiento(rs.getDate("Fecha_Nacimiento"));
                personaTraida.setPais(rs.getString("Pais"));
                personaTraida.setProfesion(rs.getString("Profesion"));
                personaTraida.setTelefono(rs.getString("Telefono"));
                personaTraida.setRol_id(rs.getInt("rol_id"));
            }else{
                 personaTraida = new DatosPersonales();
                JOptionPane.showMessageDialog(null, "No se encontraron datos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se Encontraron los registros", "Error al recuperar la información", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de tipo: " + e);
            System.out.println("Error en la clase DatosPersonales: "+ this.getClass().getName());
        }
        return personaTraida;
    }

    @Override
    public void actualizar(DatosPersonales objeto, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
  
    
}
