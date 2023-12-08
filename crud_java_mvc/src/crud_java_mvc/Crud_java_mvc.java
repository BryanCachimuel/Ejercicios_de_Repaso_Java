package crud_java_mvc;

import Configuracion.ConexionLocal;

/**
 *
 * @author Bryan
 */
public class Crud_java_mvc {

    public static void main(String[] args) {
        ConexionLocal nConexion = new ConexionLocal();
        nConexion.conectar();
        System.out.println("Conectado");
        
        System.out.println("");
        nConexion.desconectar();
        System.out.println("Desconectado");
        
        System.out.println("");
        nConexion.testearConexion();
        System.out.println("Testeando");
    }
    
}
