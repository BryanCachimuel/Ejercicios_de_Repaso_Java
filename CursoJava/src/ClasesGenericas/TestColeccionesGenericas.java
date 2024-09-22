package ClasesGenericas;

import java.util.*;

public class TestColeccionesGenericas {
    
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // se puede duplicar los elementos con el List
        
        imprimir(miLista);
        String elemento = miLista.get(0);
        //System.out.println("Elemento = " + elemento);
        
        /* Se imprimen los elementos se importar el orden dado por el usuario */
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Miercóles");
        miSet.add("Viernes");
        miSet.add("Viernes"); // no se puede duplicar elementos con el Set
        miSet.add("Domingo");
        
        //imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Enero");
        miMapa.put("Valor2", "Febrero");
        miMapa.put("Valor3", "Marzo");
        miMapa.put("Valor4", "Abril");
        miMapa.put("Valor5", "Mayo");
        miMapa.put("Valor5", "Junio");  
        
        String elementoMapa = miMapa.get("Valor5"); // se imprime le ultimo valor establecido de acuerdo a su clave
        System.out.println("Elemento = " + elementoMapa);
        
        //imprimir(miMapa.keySet()); // imprime todos los valores de las llaves de los elementos
        //imprimir(miMapa.values()); // imprime todos los valores del mapa
    }
    
    public static void imprimir(Collection<String> coleccion){
        /*coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });*/
        
        for(String elemento : coleccion){
            System.out.println("Elemento = " + elemento);
        }
    }
}
