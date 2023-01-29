package modelo;

import java.util.List;

/**
 *
 * @author Bryan
 */
public interface CRUD {
    /* aquí se declarará todos los métodos que se utilizaran en el menú de mantenimiento*/
    public List listar();
    public int aniadir(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
}
