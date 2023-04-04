package domain;

import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class ClienteDAO {
    Conexion instanciaMysql = Conexion.getInstance();
    private Connection conexionTransaccional;
    
    /* estas variables llevan gión bajo solo por que van a ser utilizadas para hacer consultas hacia la base de datos */
    private static final String SQL_SELECT = "SELECT * FROM cliente";
    private static final String SQL_INSERT = "INSERT INTO cliente(nombres,apellidos,email,telefono,saldo) VALUES(?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombres=?,apellidos=?,email=?,telefono=?,saldo=? WHERE id_datos=?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_datos=?";
    
    int registros;
    
    // proceso de Manejo de transacciones
    public ClienteDAO(){}
    
    public ClienteDAO(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    // método para listar datos
    public List<Cliente> listar(){
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        List<Cliente> datoslista = new ArrayList<>();
        Cliente datos;
        
        try {
            //conexion = instanciaMysql.conectar(); => Proceso de Conexión normal hacia la base de datos
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();  // proceso de conexión transaccional
            consulta = conexion.prepareStatement(SQL_SELECT);
            resultado = consulta.executeQuery();
            while(resultado.next()){
                int idDatos = resultado.getInt("id_datos");
                String nombres = resultado.getString("nombres");
                String apellidos = resultado.getString("apellidos");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                double saldo = resultado.getDouble("saldo");
                
                datos = new Cliente(idDatos, nombres, apellidos, email, telefono, saldo);
                datoslista.add(datos);
            }
        } catch (SQLException error) {
            System.out.println(error);
        }finally{
            instanciaMysql.cerrarResultSet(resultado);
            instanciaMysql.cerrarStatement(consulta);
            if(this.conexionTransaccional == null){
                instanciaMysql.desconectar(conexion);
            }
        }
        
        return datoslista;
    }
    
    // método para insertar datos
    public int insertar(Cliente dato){
        Connection conexion = null;
        PreparedStatement consulta = null;

        try {
            //conexion = instanciaMysql.conectar();
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();
            consulta = conexion.prepareStatement(SQL_INSERT);
            
            //consulta.setInt(1, dato.getIddatos());
            consulta.setString(1, dato.getNombres());
            consulta.setString(2, dato.getApellidos());
            consulta.setString(3, dato.getEmail());
            consulta.setString(4, dato.getTelefono());
            consulta.setDouble(5, dato.getSaldo());
            
            registros = consulta.executeUpdate();
            
        } catch (SQLException error) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, error);
        } finally{
            instanciaMysql.cerrarStatement(consulta);
            if(this.conexionTransaccional == null){
                instanciaMysql.desconectar(conexion);
            }
        }
        
        return registros;
    }
    
    // método para actualizar
    public int actualizar(Cliente dato){
        Connection conexion = null;
        PreparedStatement consulta = null;
        int registros = 0;
        
        try {
            //conexion = instanciaMysql.conectar();
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();
            consulta = conexion.prepareStatement(SQL_UPDATE);
            
            consulta.setString(1, dato.getNombres());
            consulta.setString(2, dato.getApellidos());
            consulta.setString(3, dato.getEmail());
            consulta.setString(4, dato.getTelefono());
            consulta.setDouble(5, dato.getSaldo());
            consulta.setInt(6, dato.getIddatos());
            
            registros = consulta.executeUpdate();
            
        } catch (SQLException error) {
            System.out.println(error);
        } finally{
            instanciaMysql.cerrarStatement(consulta);
            if(this.conexionTransaccional == null){
                instanciaMysql.desconectar(conexion);
            }
        }
        
        return registros;
    }
    
    // método para eliminar
    public int eliminar(Cliente dato){
        Connection conexion = null;
        PreparedStatement consulta = null;
        int registros = 0;
        
        try {
            //conexion = instanciaMysql.conectar();
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();
            consulta = conexion.prepareStatement(SQL_DELETE);
            
            consulta.setInt(1, dato.getIddatos());
            registros = consulta.executeUpdate();
            
        } catch (SQLException error) {
            System.out.println(error);
        } finally{
            instanciaMysql.cerrarStatement(consulta);
            if(this.conexionTransaccional == null){
                instanciaMysql.desconectar(conexion);
            }
        }
        
        return registros;
    }
}
