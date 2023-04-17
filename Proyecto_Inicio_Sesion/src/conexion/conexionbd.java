package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class conexionbd {
    
    private conexionbd(){}
    
    private static Connection conexion;
    
    private static conexionbd instancia;
    
    private String url = "jdbc:mysql://localhost:3307/inicio_registro_java?useSSL=false";
    private String username = "root";
    private String password = "admin1994";
    
    public Connection conectarbd(){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conexion = DriverManager.getConnection(url, username, password);
             System.out.println("Conexión Exitosa Hacia la Base de Datos");
        } catch (Exception e) {
            System.out.println("Error en la conexión hacia la base de datos: " + e);
        }
        return conexion;
    }
    
    public void cerrarConexion() throws SQLException{
        try {
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
            conexion.close();
        }finally{
            conexion.close();
        }
    }
    
    public static conexionbd getInstance(){
         if(instancia == null){
            instancia = new conexionbd();
        }
        return instancia;
    }
 
}
