package com.ec.sockets.chat;

import java.io.DataOutputStream;
import java.net.Socket;


/**
 *
 * @author Bryan
 */
public class Cliente implements Runnable{
    
    // creación de los atributos de puerto y mensaje
    private int puerto;
    private String mensaje;

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    
    @Override
    public void run() {
        /* estableciendo el host del servidor */
        final String HOST = "127.0.0.1";
        
        /* estableciendo el puerto del servidor */
        DataOutputStream salida; 
        
        try {
            Socket socket = new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            
            /* enviamos el mensaje */
            salida.writeUTF(mensaje);
            
        } catch (Exception error) {
            System.out.println(error);
        }
    }
    
}
