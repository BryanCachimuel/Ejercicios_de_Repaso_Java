
package ClasesGenericas;

/*
    Manejo de clases Genéricas en Java
    Para indicar que es una clase genética se pone este símbolo <T>
 */
public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
    
}
