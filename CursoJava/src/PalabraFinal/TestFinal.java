package PalabraFinal;

/*
    Uso de la palabra final
 */
public class TestFinal {
    
    public static void main(String[] args) {
        /* final en las variables representa que el valor dado no puede ser cambiado */
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        // miVariable = 15; -> esto no se puede hacer
    }
    
}
