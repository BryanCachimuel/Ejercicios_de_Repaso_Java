package Variables;

/*
  Tipos de datos Primitivos Enteros en Java
*/
public class Clase5PrimitivosEnteros {

    public static void main(String[] args) {
        
        /* 
            Tipos Primitivos enteros: byte, short, int, long
        */
        
        // Tipo de datos Byte
        
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte: " +Byte.MAX_VALUE);
        
        /* byte numeroByte = 129; Si lo ponemos así nos dara error ya que supera el máximo valor de los bytes */
        byte numeroByte = (byte) 129; /* convertimos el valor 129 a un byte */
        
        System.out.println("Valor del numeroByte: " + numeroByte); /* no nos devuelve el valor que le estamos dando y por ende no estaria correcto hacer la conversión anterior */
        
        System.out.println("\n");
        
        // Tipo de Dato Short
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);
        
        /* short numeroByte = 32768; Si lo ponemos así nos dara error ya que supera el máximo valor de los shorts */
        short numeroShort = (short) 32768; /* convertimos el valor 32768 a un short */
        
        System.out.println("Valor del numeroShort: " + numeroShort); /* no nos devuelve el valor que le estamos dando y por ende no estaria correcto hacer la conversión anterior */
    
        
        System.out.println("\n");
        
         // Tipo de Dato Int
        System.out.println("Valor mínimo del short: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Integer.MAX_VALUE);
        
         /* int numeroInt = 2147483648; Si lo ponemos así nos dara error ya que supera el máximo valor de los integers */
        int numeroInt = (int) 2147483648L; /* convertimos el valor 2147483648L a un int, pero para este caso se pone la terminación L para decir que el valor es tipo long */
        
        System.out.println("Valor del numeroInt: " + numeroInt); /* no nos devuelve el valor que le estamos dando y por ende no estaria correcto hacer la conversión anterior */
    
        
        System.out.println("\n");
        
         // Tipo de Dato Long
        System.out.println("Valor mínimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del long: " + Long.MAX_VALUE);
        
         /* long numeroLong = 9223372036854775808L; Si lo ponemos así nos dara error ya que supera el máximo valor de los long */
        long numeroLong = (long)9223372036854775808D; /* convertimos el valor 9223372036854775807D a un long, pero para este caso se pone la terminación D para decir que el valor es tipo Double */
        long numeroLongV = 9223372036854775807L; 
        
        System.out.println("Valor del numeroLong: " + numeroLong); /* no nos devuelve el valor que le estamos dando y por ende no estaria correcto hacer la conversión anterior */
        System.out.println("Valor verdadero del numeroLong sin conversiones: " + numeroLongV);
    }
    
}
