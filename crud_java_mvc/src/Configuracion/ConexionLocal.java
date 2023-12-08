package Configuracion;

import Interface.IGestorConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */

public class ConexionLocal implements IGestorConexion{
    
    private String url = "jdbc:mysql://localhost/crud_java_mvc_seguros";
    private String usuario = "root";
    private String clave = "";
    
    /* Instancia de la clase Connetion */
    private Connection conexion;

    public ConexionLocal() {}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(this.url,this.usuario,this.clave);
            System.out.println("Conexión hacia la BDD exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void desconectar() {
        try {
            conexion.close();
            System.out.println("Se ha desconectado de la base de datos");
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean testearConexion() {
        try {
            if(conexion != null && !conexion.isClosed()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    
}
