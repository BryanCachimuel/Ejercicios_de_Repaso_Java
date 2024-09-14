package BloquesInicializacion;

/*
    Manejo de Bloques de código
 */
public class Perros {
    
    private final int idPerro;
    private static int contadorPerros;
    
    // bloque de inicialización estático que se ejecuta antes que el constructor
    static {
        System.out.println("Ejecución bloque estático");
        ++contadorPerros;
    }
    
    // bloque de inicialización no estático
    {
        System.out.println("Ejecición de bloque no estático");
        this.idPerro = contadorPerros++;
    }
    
    public Perros(){
        System.out.println("Ejecución del constructor");
    }

    public int getIdPerro() {
        return idPerro;
    }

    @Override
    public String toString() {
        return "Perros{" + "idPerro=" + idPerro + '}';
    }
    
}
