package AutoboxingUnboxing;

/*
    Autoboxing y Unboxing
 */
public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        /* 
            Clases envolventes de tipos primitivos 
            int -> Integer
            long -> Long
            float -> Float
            double -> Double
            boolean -> Boolean
            byte -> Byte
            char -> Character
            short -> Short
        */
        
        // Autoboxing en donde se envuelve un tipo primitivo en un tipo object
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue() );
        
        /* recuperación de la variable entero se lo conoce como umboxing */
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
    
}
