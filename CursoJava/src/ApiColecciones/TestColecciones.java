package ApiColecciones;

import java.util.*;

/* 
    API de Collections
 */
public class TestColecciones {
    
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        
        /* Las dos formas imprimen el mismo resultado */
        for(Object elemento : miLista){
            System.out.println("elemento = " + elemento);
        }
        
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
    
}
