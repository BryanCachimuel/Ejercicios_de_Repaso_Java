package test;

import beans.IntroduccionEjbRemote;
import javax.naming.*;

public class TestIntroduccionEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            // se coloca el nombre del JNDI name que se genera luego de subir el archivo jar al deploy de las aplicaciones del admin de glassfish
            IntroduccionEjbRemote introduccionEjb = (IntroduccionEjbRemote) jndi.lookup("java:global/IntroduccionEJB/IntroduccionEjbImpl!beans.IntroduccionEjbRemote]");
            int resultado = introduccionEjb.sumar(10, 15);
            System.out.println("Resultado de la suma es: " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
