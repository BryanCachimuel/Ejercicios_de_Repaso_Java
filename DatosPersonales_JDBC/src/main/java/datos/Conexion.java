package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Bryan
 */
public class Conexion {
    // creamos un constructor
    private Conexion(){}
    
    /* estableciendo como un ejemplo un pool de conexiones */
    private static final String URL = "jdbc:mysql://localhost:3307/datos_personales?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1994";
    private static Conexion instancia;
    
    // conectar con la base de datos
    public DataSource obtenerFuentedeDatos(){
        BasicDataSource datos = new BasicDataSource();
        datos.setUrl(URL);
        datos.setUsername(USER);
        datos.setPassword(PASSWORD);
        datos.setInitialSize(25);  // es el tamaño de las conexiones a la base de datos
        return datos;
    }
   
    // se obtiene la conexion hacia la base de datos
    public Connection conectar() throws SQLException{
        return obtenerFuentedeDatos().getConnection();
    }
    
    // mejores prácticas para hacer la conexión hacia la base de datos
    public void desconectar(Connection conectar){
        try {
            conectar.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarResultSet(ResultSet resultado){
        try {
           resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarStatement(PreparedStatement statement){
        try {
           statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
