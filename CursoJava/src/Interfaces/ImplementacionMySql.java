package Interfaces;

/*
    Para implementar una interface se dene poner implements seguido del nombre de la Interfaz
*/

public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        
    }

    @Override
    public void actualizar() {
        
    }

    @Override
    public void eliminar() {
        
    }
    
    
    
}
