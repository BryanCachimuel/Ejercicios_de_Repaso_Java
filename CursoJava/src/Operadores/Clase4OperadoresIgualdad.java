package Operadores;

/*
       Operadores de Igualdad
 */
public class Clase4OperadoresIgualdad {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d =  a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var cadena3 = "Hola";
        
        var comparacion = cadena == cadena2; // compara referencia de objetos
        System.out.println("comparación = " + comparacion);
        
        var comparacionCadenas = cadena.equals(cadena2);
        System.out.println("comparacionCadenas = " + comparacionCadenas);
        
        var comparar = cadena.equals(cadena3);  // comparamos contenido de cadenas
        System.out.println("comparar = " + comparar);
    }
    
}
