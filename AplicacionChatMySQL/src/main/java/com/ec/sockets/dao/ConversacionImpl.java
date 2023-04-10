package com.ec.sockets.dao;

import com.ec.sockets.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bryan
 */
public class ConversacionImpl implements ConversacionDAO{
    
    Conexion instanciaMySQL = Conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMySQL.conectar();
            String sql = "INSERT INTO conversaciones(conversacionA) values(?)";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        } finally{
            instanciaMySQL.cerrarStatement(consulta);
            instanciaMySQL.desconectar(conexion);
        }
    }

    @Override
    public void registrarConversacionB(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMySQL.conectar();
            String sql = "INSERT INTO conversaciones(conversacionB) values(?)";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        } finally{
            instanciaMySQL.cerrarStatement(consulta);
            instanciaMySQL.desconectar(conexion);
        }
    }
}
