package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bryan
 */
public class Conexion {
    Connection con;
    
    /*método de conexión hacia la base de datos*/
    public Connection getConnection(){
        
        String url = "jdbc:mysql://localhost:3307/bd_ventas";
        String user = "root";
        String password = "admin1994";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Error en la conexión hacia la base de datos");
        }
        return con;
    }
}
