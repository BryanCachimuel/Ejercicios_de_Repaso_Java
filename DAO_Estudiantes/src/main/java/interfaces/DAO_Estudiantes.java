package interfaces;

import Modelo.Estudiantes;

/**
 *
 * @author Bryan
 */
public interface DAO_Estudiantes {
    
    public void registrar(Estudiantes estudiantes);
    public void actualizar(Estudiantes estudiantes);
    public void eliminar(Estudiantes estudiantes);
    public void buscar(Estudiantes estudiantes);
    
}
