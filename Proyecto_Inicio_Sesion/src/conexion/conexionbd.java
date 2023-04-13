package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bryan
 */
public class conexionbd {
    Connection cn;
    private String url = "jdbc:mysql://localhost:3307/inicio_registro_java?useSSL=false";
    private String username = "root";
    private String password = "admin1994";
    
    public Connection conectarbd(){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             cn = DriverManager.getConnection(url, username, password);
             System.out.println("Conexión Exitosa Hacia la Base de Datos");
        } catch (Exception e) {
            System.out.println("Error en la conexión hacia la base de datos: " + e);
        }
        return cn;
    }
}
