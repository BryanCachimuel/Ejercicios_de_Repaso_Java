package beans;

import javax.ejb.Stateless;

/*
    Para que está clase sea un EJB se va a usar la anotación Stateless
*/

@Stateless
public class IntroduccionEjbImpl implements IntroduccionEjbRemote{

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando método sumar en el servidor");
        return a + b;
    }
    
}
