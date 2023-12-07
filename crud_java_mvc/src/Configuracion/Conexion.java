package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class Conexion {
    
    private Connection cnn;
    private String cadenaConexion, usuarioDB, claveDB;
    
    public Conexion(String cadenaConexion, String usuarioDB, String claveDB){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cadenaConexion = cadenaConexion;
            this.usuarioDB = usuarioDB;
            this.claveDB = claveDB;
            cnn = DriverManager.getConnection(this.cadenaConexion,this.usuarioDB,this.claveDB);
            System.out.println("Conexión hacia la BDD exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión hacia la base de datos" + e);
        }
    }
}
