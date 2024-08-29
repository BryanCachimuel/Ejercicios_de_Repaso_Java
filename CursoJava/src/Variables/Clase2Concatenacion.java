package Variables;

public class Clase2Concatenacion {

    public static void main(String[] args) {
        /* Concatenación de cadenas */
        var usuario = "Bryan";
        String titulo = "Ingeniero";
        
        var concatenacion = titulo + " " + usuario;
       
        System.out.println("Resultado: " + concatenacion);
        
        /* Concatenación de enteros */
        var valor1 = 8;
        var valor2 = 9;
        
        System.out.println("Resultado: " + (valor1 + valor2));
        
        System.out.println(valor1 + valor2 + usuario); /* las expresiones se evaluan de izquierda a derecha por eso se hace el cakculo matematico primero*/
        
        System.out.println(usuario + valor1 + valor2); /* ya que se inicia con una cadena toda la ezpresión de resultado se concatena y no se realzliza la operación de suma de los dos valores */
         
        System.out.println(usuario + (valor1 + valor2)); /* con la ayuda de los parentesis se puede realizar la operación de suma de los dos valoress */

        
    }
    
}
