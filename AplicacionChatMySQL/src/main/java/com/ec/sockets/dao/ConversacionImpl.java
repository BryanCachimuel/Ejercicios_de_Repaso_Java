package com.ec.sockets.dao;

import com.ec.sockets.conexion.Conexion;

/**
 *
 * @author Bryan
 */
public class ConversacionImpl implements ConversacionDAO{
    
    Conexion instanciaMySQL = Conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        
    }

    @Override
    public void registrarConversacionB(String mensaje) {
        
    }
    
}
