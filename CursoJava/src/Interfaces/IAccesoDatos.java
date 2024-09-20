package Interfaces;

/*
    Manejo de Interfaces en Java
 */
public interface IAccesoDatos {
    
    int MAX_REGISTRO = 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
