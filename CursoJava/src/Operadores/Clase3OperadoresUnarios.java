package Operadores;

/*
    Operadores Unarios
 */
public class Clase3OperadoresUnarios {

    public static void main(String[] args) {
        
        /* Operador de cambio de signo */
        int a = 3;
        var b = -a;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        /* Operador de negación */
        var c = true;
        boolean d = !c;
        
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        
        /* Operadores Unarios de incremento y decremento */
        
        // 1. preincremento (símbolo antes de la variable)
        var e = 3;
        var f = ++e; // primero se incrementa la variable y después se usa su valor
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // 2. posincremento (simbolo después de la variable)
        var g = 5;
        var h = g++; // primero se utiliza el valor y después se incrementa
        
        System.out.println("g = " + g); // se tenia pendiente un incremento y por eso imprime 6
        System.out.println("h = " + h); // se imprime el valor original de la variable g
        
        /* Decremento */
        // 1. predecremento
        int i = 3;
        int j = --i;
        
        System.out.println("i = " + i); // ya esta decrementado
        System.out.println("j = " + j); // se aplica el valor de la variable
        
        // 2. postdecremento
        int k = 7;
        int l = k--; // se usa el valor de la variable y queda pendiente el decremento
        
        System.out.println("k = " + k); // tenia pendiente un decremento
        System.out.println("l = " + l);
    }
    
}
