package Operadores;
/*
    Operadores Aritmetivos
 */
public class Clase1OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 8, b = 6;
        
        var resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);
        
        var resultadoResta = a - b;
        System.out.println("Resultado de las resta: " + resultadoResta);
        
        var resultadoMultiplicación = a * b;
        System.out.println("Resultado de las multiplicación: " + resultadoMultiplicación);
        
        var resultadoDivision = a / b;
        System.out.println("Resultado de las división: " + resultadoDivision);
        
        
        var resultado2 = 1.8D /b;
        System.out.println("Resultado divisón: " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado " + resultado);
        
        if(a % 2 == 0)
            System.out.println("Es número par");
        else
            System.out.println("Es número impar");
    }
    
}
