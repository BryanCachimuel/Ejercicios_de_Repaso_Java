package controladores;

import base_datos.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class crud {
    conexion con = new conexion();
    Statement st;
    
    public void insertar(String nombre, String apellido, String area, String puesto){
        try {
            Connection conexion = con.conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO empleados(nombre,apellido,area,puesto) VALUES('"+nombre+"','"+apellido+"','"+area+"','"+puesto+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Registro Guardado Correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El Registro no se ha Guardado" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
}
