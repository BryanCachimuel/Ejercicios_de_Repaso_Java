package beans;

import javax.ejb.Remote;

/*
    Es buena practica tener una Interfaz para que no se tenga acceso directo al script del EJB
*/

@Remote
public interface IntroduccionEjbRemote {
    
    public int sumar(int a, int b); // mediante Remote es que glassfish va a permitir publicar esta componente y por lo tanto se va a poder acceder desde el cliente
}
