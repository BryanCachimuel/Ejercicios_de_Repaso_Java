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
        miLista.add("Domingo"); // se puede duplicar los elementos con el List
        
        imprimir(miLista);
        
        /* Se imprimen los elementos se importar el orden dado por el usuario */
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Miercóles");
        miSet.add("Viernes");
        miSet.add("Viernes"); // no se puede duplicar elementos con el Set
        miSet.add("Domingo");
        
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Enero");
        miMapa.put("Valor2", "Febrero");
        miMapa.put("Valor3", "Marzo");
        miMapa.put("Valor4", "Abril");
        miMapa.put("Valor5", "Mayo");
        
        String elemento = (String)miMapa.get("Valor4");
        System.out.println("Elemento = " + elemento);
        
        imprimir(miMapa.keySet()); // imprime todos los valores de las llaves de los elementos
        imprimir(miMapa.values()); // imprime todos los valores del mapa
    }
    
    public static void imprimir(Collection coleccion){
        /* Las dos formas imprimen el mismo resultado 
        for(Object elemento : coleccion){
            System.out.println("elemento = " + elemento);
        }*/
        
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
