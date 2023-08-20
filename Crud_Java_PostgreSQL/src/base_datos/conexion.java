package base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class conexion {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/empresa";
    String usuario = "postgres";
    String clave = "admin1994";
    
    public Connection conectar(){
        try {
           Class.forName("org.postgresql.Driver");
           conn = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión hacia la base de datos: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return conn;
    }
    
}
