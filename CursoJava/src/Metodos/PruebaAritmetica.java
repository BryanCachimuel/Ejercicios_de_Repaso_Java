package Metodos;

/*
    Prueba Aritmética
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 7;
        aritmetica.b = 8;
        aritmetica.sumar();
        
        /* para mandar a imprimir un método de tipo int se debe declarar una variable del mismo tipo del método */
        int resultado = aritmetica.sumarConRetorno();
        System.out.println("Resultado con método de retorno: " + resultado);
    }
    
}
