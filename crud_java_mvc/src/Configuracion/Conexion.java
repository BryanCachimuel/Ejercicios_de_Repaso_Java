package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class Conexion {
    
    private Connection cnn;
    private String cadenaConexion, usuarioDB, claveDB;
    
    public Conexion(String cadenaConexion, String usuarioDB, String claveDB){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cadenaConexion = cadenaConexion;
            this.usuarioDB = usuarioDB;
            this.claveDB = claveDB;
            cnn = DriverManager.getConnection(this.cadenaConexion,this.usuarioDB,this.claveDB);
            System.out.println("Conexión hacia la BDD exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public boolean testearConexion(){
        try {
            return !cnn.isClosed();
        } catch (SQLException e) { 
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
    public void abrirConexion(){
        try {
            cnn = DriverManager.getConnection(cadenaConexion,"root","");
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void cerrarConexion(){
        try {
            cnn.close();
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
