package Variables;

/*
  Tipos de datos Primitivos Flotantes en Java
*/

public class Clase6PrimitivosFlotantes {

    public static void main(String[] args) {
       /*
            Tipos Primitivos de Tipo Flotante: Float y Double
        */
       
        // Tipo de datos Float
        
        System.out.println("Valor mínimo del byte: " + Float.MIN_VALUE);
        System.out.println("Valor máximo del byte: " + Float.MAX_VALUE);
        
        float numeroFloat = (float) 3.4028236E38D; /* no es factible hacer esta conversión porque da como resultado infinito */
        float numeroFloatV = (float) 3.4028235E38D;
        
        System.out.println("Valor del numeroFloat: " + numeroFloat); /* no nos devuelve el valor que le estamos dando y por ende no estaria correcto hacer la conversión anterior */
        System.out.println("Valor del numeroFloatV: " + numeroFloatV);
        
        System.out.println("\n");
        
        // Tipo de datos Double
        
        System.out.println("Valor mínimo del Double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo del Double: " + Double.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308D; /* para este caso no es necesario poner la terminación D, ya que al poner el punto en el número ya se asume que es decimal */
        System.out.println("Valor del numeroDouble: " + numeroDouble);
    }
    
}
