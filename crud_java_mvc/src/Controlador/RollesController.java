package Controlador;

import Configuracion.ConexionLocal;
import Modelos.Roles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class RollesController {
    
    private final ConexionLocal cnnNuevoAdmin = new ConexionLocal();
   
    PreparedStatement st;
    ResultSet rs;
    
    public List<Roles> obtenerRoles(){
        List<Roles> lista = new ArrayList<>();
        String sql = "SELECT nombre,id FROM roles ORDER BY id";
        try {
            cnnNuevoAdmin.conectar(); 
            st = cnnNuevoAdmin.getConexion().prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){  
                Roles rol = new Roles();
                rol.setId(rs.getInt("id"));
                rol.setNombre(rs.getString("nombre"));
                lista.add(rol);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar los datos de los roles: " + this.getClass().getName());
            System.out.println("Ocurrio un error durante el proceso de la consulta: " +e);
        }
        return Collections.emptyList();
    }
    
    public List<Roles> listaRoles(){
        return obtenerRoles();
    }
}
