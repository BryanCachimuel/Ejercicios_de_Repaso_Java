package registros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    private static final String url = "jdbc:mysql://localhost/bd_registros";
    private static final String username = "root";
    private static final String password = "3307";
    
    // método para conectar hacia la base de datos
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, username, password);
             JOptionPane.showMessageDialog(null, "Conexión hacia la base de datos exitosa" );
             return conexion;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
        return conexion;
    }
    
    // creamos el método para cerrar la conexion hacia la base de datos
    public void cerrarConexion() throws SQLException{
        try {
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
            conexion.close();
        }finally{
            conexion.close();
        }
    }
    
    // Patrón singleton se lo pone static para poder ser accedido directamente desde otra clase con JFrame
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
