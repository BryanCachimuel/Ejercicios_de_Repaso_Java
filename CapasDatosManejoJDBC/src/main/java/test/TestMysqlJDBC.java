package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMysqlJDBC {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/test?useSSL=false&useTimezone=true=&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin1994");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print("Nombre: " + resultado.getString("nombre"));
                System.out.print("Apellido: " + resultado.getString("apellido"));
                System.out.print("Email: " + resultado.getString("email"));
                System.out.print("Teléfono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}