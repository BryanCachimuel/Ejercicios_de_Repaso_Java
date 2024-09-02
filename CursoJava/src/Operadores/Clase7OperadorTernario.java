package Operadores;

/*
    Operador Ternario
*/

public class Clase7OperadorTernario {

    public static void main(String[] args) {
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado: " + resultado);
        
        var resultado2 = (-1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado2: " + resultado2);
        
        var numeroEvaluar = 8;
        var evaluando = (numeroEvaluar % 2 == 0) ? "Número Par" : "Número Impar";
        
        System.out.println("evaluando: " + evaluando);
        
    }
    
}
