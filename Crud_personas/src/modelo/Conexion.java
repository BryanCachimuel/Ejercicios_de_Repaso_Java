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
        
        String url = "jdbc:mysql://localhost:3307/personas";
        String user = "root";
        String pass = "admin1994";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
}
