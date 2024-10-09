package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {  
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
            Persona actualizarPersona = new Persona(1, "Bryan", "Cachimuel", "blcl@gmail.com", "0974859635");
  
            personaJdbc.actualizar(actualizarPersona);
            
            //Persona nuevaPersona = new Persona("Adriana", "Díaz88888888888888888888888888888888888888888888888888888888888888888888", "amdc@yahoo.com", "0987245639");
            Persona nuevaPersona = new Persona("Adriana", "Díaz", "amdc@yahoo.com", "0987245639");
            personaJdbc.insertar(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transacción");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }
    
}
