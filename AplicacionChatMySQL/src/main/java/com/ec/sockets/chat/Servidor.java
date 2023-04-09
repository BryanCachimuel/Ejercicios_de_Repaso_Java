package com.ec.sockets.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

/**
 *
 * @author Bryan
 */
public class Servidor extends Observable implements Runnable{
    
    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }
    
    
    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;
        
        try {
            /* creamos el servidor del socket */
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor Iniciado");
            
            /* siempre estará escuchando peticiones */
            while(true){
                /* esperar a que el cliente se conecte */
                socket = servidor.accept();
                System.out.println("Cliente Conectado");
                entrada = new DataInputStream(socket.getInputStream());
                
                /* se lee el mensaje */
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                socket.close();
                System.out.println("Cliente Desconectado");
            }
            
        } catch (IOException error) {
            System.out.println(error);
        }
    }
    
}
