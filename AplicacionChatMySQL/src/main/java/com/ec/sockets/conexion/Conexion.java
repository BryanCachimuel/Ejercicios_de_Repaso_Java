package com.ec.sockets.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class Conexion {
    
    private static final String URL= "jdbc:mysql://localhost:3307/chat?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "admin1994";
    private static Conexion instancia;
    
    public Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    
    public void cerrarResultSet(ResultSet resultado){
        try {
            resultado.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void desconectar(Connection conexion){
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void cerrarStatement(PreparedStatement statement){
        try {
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
