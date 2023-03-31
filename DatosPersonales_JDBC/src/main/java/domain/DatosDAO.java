package domain;

import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryan
 */
public class DatosDAO {
    Conexion instanciaMysql = Conexion.getInstance();
    
    /* estas variables llevan gión bajo solo por que van a ser utilizadas para hacer consultas hacia la base de datos */
    private static final String SQL_SELECT = "SELECT * FROM datos";
    private static final String SQL_INSERT = "INSERT INTO datos(nombres,apellidos,email,telefono,saldo) VALUES(?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE datos SET nombres=?,apellidos=?,email=?,telefono=?,saldo=? WHERE id_datos=?";
    private static final String SQL_DELETE = "DELETE FROM datos WHERE id_datos=?";
    
    // método para listar datos
    public List<Datos> listar(){
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        List<Datos> datoslista = new ArrayList<>();
        Datos datos;
        
        try {
            conexion = instanciaMysql.conectar();
            consulta = conexion.prepareStatement(SQL_SELECT);
            resultado = consulta.executeQuery();
            while(resultado.next()){
                int idDatos = resultado.getInt("id_datos");
                String nombres = resultado.getString("nombres");
                String apellidos = resultado.getString("apellidos");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                double saldo = resultado.getDouble("saldo");
                
                datos = new Datos(idDatos, nombres, apellidos, email, telefono, saldo);
                datoslista.add(datos);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return datoslista;
    }
}
