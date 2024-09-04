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
        
        Aritmetica aritmetica2 = new Aritmetica();
        int v1 = aritmetica2.a = 15;
        int v2 = aritmetica2.b = 25;
        /* cuando se este en debug y se quiera entrar en el proceso del método se debe dar clik en la opcíon f7 (signo que describa f7) */
        int resultado2 = aritmetica2.sumarConArgumentos(v1, v2);
        System.out.println("Resultado con método con argumentos: " + resultado2);
        
        int resultado3 = aritmetica2.sumarConsumiendo(v1, v2);
        System.out.println("Resultado con método que consume otro método: " + resultado3);
        
        System.out.println("\n");
        
        Aritmetica aritmetica3 = new Aritmetica(69, 18);
        aritmetica3.sumar();
    }
    
}
