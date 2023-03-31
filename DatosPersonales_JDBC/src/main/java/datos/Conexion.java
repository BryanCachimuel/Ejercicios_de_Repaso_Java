package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class Conexion {
    // creamos un constructor
    private Conexion(){}
    
    // crear una variable donde se guarde el estado de la conexión hacia la base de datos
    private static Connection conexion;
    
    // creamos una variable para crear una sola instancia desde esta clase al JFrame
    private static Conexion instancia;
    
    //creamos las variables para conectarse a la base de datos
    private static final String url = "jdbc:mysql://localhost:3307/datos_personales?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "admin1994";
    
    // método para conectar hacia la base de datos
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, username, password);
             System.out.println("Conexión hacia la base de datos exitosa");
             return conexion;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return conexion;
    }
    
    // creamos el método para cerrar la conexion hacia la base de datos
    public void cerrarConexion() throws SQLException{
        try {
            conexion.close();
            System.out.println("Se cerro la conexión hacia la base de datos");
        } catch (Exception e) {
            System.out.println("Error: " + e);
            conexion.close();
        }finally{
            conexion.close();
        }
    }
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
