package Controlador;

import Configuracion.ConexionLocal;
import Interface.IGestorDatos;
import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bryan
 */
public class DatosPersonalesController implements IGestorDatos<DatosPersonalesController>{
    
    private Connection cnn;
    private final ConexionLocal cnnNuevoAdmin = new ConexionLocal();
    
    PreparedStatement st;
    
    @Override
    public void creacion(DatosPersonalesController objeto) {
        try {
           cnnNuevoAdmin.conectar();
           String sql = "INSERT INTO persona(Cedula,Nombre,Apellido,Correo,Fecha_Nacimiento,Pais,Profesion,Telefono,rol_id)"
                        + "VALUES(?,?,?,?,?,?,?,?,?)";
           
           st = cnnNuevoAdmin.getConexion().prepareStatement(sql);
           //st.setString(1, objeto.getClass());
        } catch (Exception e) {
            
        }
    }

    @Override
    public DatosPersonalesController lectura(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(DatosPersonalesController objeto, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
