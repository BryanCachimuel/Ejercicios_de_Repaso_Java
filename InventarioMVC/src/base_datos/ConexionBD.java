package base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class ConexionBD {
    Connection con;
    String driver = "com.mysql.jdbc.Driver";
    String dbName = "inventariomvc";
    String url = "jdbc:mysql://localhost:3307/"+dbName+"?useSSL=false&serverTimezone=UTC";
    String usuario = "root";
    String clave = "admin1994";
    
    public Connection conectarBaseDatos(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión hacia la Base de Datos Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la Conexión hacia la Base de Datos: " + e);
        }
        return con;
    }
}
