package Variables;

public class TipoVariables {

    public static void main(String[] args) {
        int miVariableEntera = 29;
        System.out.println(miVariableEntera);
        
        /* Modificando el valor de la variablle */
        miVariableEntera = 25;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos B.L";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        /* var - Inferencia de tipos de datos */
        var miVariableEnteraConVar = 100;
        System.out.println(miVariableEnteraConVar);
        
        var miVariableCadenaConVar = "Probando la variable cadena con Var";
        System.out.println(miVariableCadenaConVar);
    }
    
}
