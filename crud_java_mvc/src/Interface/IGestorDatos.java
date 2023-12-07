package Interface;
/**
 *
 * @author Bryan
 * 
 * @param <T>
 */

/*
    Como buena practica se debe agregar una I al nombrfe de la interfaz
   Se debe definir la interfaz como una clase genérarica y para ello se le pone <T>
*/
public interface IGestorDatos<T>{
    void creacion(T objeto);
    T lectura(int id);
    void actualizar(T objeto, int id);
    void eliminar(int id);
}
