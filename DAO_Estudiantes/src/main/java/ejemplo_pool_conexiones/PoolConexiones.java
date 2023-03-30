package ejemplo_pool_conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.*;

/**
dependecia puesta en el archivo pom.xml para que funcione el pool de conexiones
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-dbcp2</artifactId>
    <version>2.8.0</version>
 */
public class PoolConexiones {
    /* estableciendo como un ejemplo un pool de conexiones */
    private static final String URL = "jdbc:mysql://localhost:3307/estudiantes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1994";
    private static PoolConexiones instancia;
    
    // conectar con la base de datos
    public DataSource obtenerFuentedeDatos(){
        BasicDataSource datos = new BasicDataSource();
        datos.setUrl(URL);
        datos.setUsername(USER);
        datos.setPassword(PASSWORD);
        datos.setInitialSize(0);  // es el tamaño de las conexiones a la base de datos
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
            Logger.getLogger(PoolConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarResultSet(ResultSet resultado){
        try {
           resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(PoolConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarStatement(PreparedStatement statement){
        try {
           statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(PoolConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static PoolConexiones getInstance(){
        if(instancia == null){
            instancia = new PoolConexiones();
        }
        return instancia;
    }
}
