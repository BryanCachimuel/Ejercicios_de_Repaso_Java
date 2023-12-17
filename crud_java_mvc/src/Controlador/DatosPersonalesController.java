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
        }finally{
            cnnNuevoAdmin.desconectar();
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
                personaTraida.setCorreo(rs.getString("Correo"));
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
            System.out.println("Error en la clase: "+ this.getClass().getName());
        }finally{
            cnnNuevoAdmin.desconectar();
        }
        return personaTraida;
    }

    @Override
    public void actualizar(DatosPersonales objeto, int id) {
        String sql = "UPDATE persona SET Cedula=?,Nombre=?,Apellidos=?,Correo=?,Fecha_Nacimiento=?,Pais=?,Profesion=?,Telefono=?,rol_id=? WHERE id='"+id+"'";
        try {
           // formatear fecha
           java.sql.Date fechaNacimiento = new java.sql.Date(objeto.getFecha_nacimiento().getTime());
           
           cnnNuevoAdmin.conectar();
           st = cnnNuevoAdmin.getConexion().prepareStatement(sql); 
           st.setString(1, objeto.getCedula());
           st.setString(2, objeto.getNombre());
           st.setString(3, objeto.getApellido());
           st.setString(4, objeto.getCorreo());
           st.setDate(5, fechaNacimiento);
           st.setString(6, objeto.getPais());
           st.setString(7, objeto.getProfesion());
           st.setString(8, objeto.getTelefono());
           st.setInt(9, objeto.getRol_id());
           //st.setInt(10, objeto.getId());
           JOptionPane.showMessageDialog(null, "Sea realizando la actualización al registro", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
           st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede actualizar el registro", "Error al actualizar", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de tipo: " + e);
            System.out.println("Error en la clase: "+ this.getClass().getName());
        }
    }

    @Override
    public void eliminar(int id) {
       String sql = "DELETE FROM persona WHERE id ='"+id+"'";
        try {
            cnnNuevoAdmin.conectar();
            st = cnnNuevoAdmin.getConexion().prepareStatement(sql);
            int filasAfectadas = st.executeUpdate();
            
            if(filasAfectadas > 0){
                JOptionPane.showMessageDialog(null, "Datos Eliminados");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron datos a eliminar");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el proceso de eliminación");
            System.out.println("Error: " + e);
            System.out.println("Error en la clase: " + this.getClass().getName());
        }finally{
            cnnNuevoAdmin.desconectar();
        }
    }
    
   
  
    
}
