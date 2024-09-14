package ArgumentosVariables;

/*
    Argumentos variables (varargs)
 */
public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(5,9,12,16,20);
        imprimirNumeros(25,32,38,44,49,53);
        variosParametros("Bryan", 5,10,15,20,25,30,35,40);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    /* int... numeros -> indica la n cantidad de argumentos que puede tener este método */
    private static void imprimirNumeros(int... numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
            
        }
        
    }
    
}
