package Variables;

import java.util.Scanner;

/*
    Conversión de Tipos Primitivos
 */
public class Clase10ConversionTiposPrimitivos {

    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        /* Convertir tipos String a entero */
        var edad = Integer.parseInt("20");
        System.out.println("edad: " + (edad + 1));
        
        /* Convertir tipos String a double */
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("ValorPi: " + valorPI);
        
        /* Pedir un valor por consola 
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad: " + edad);*/
        
        /* Convertir tipos int a String */
        var textoEdad = String.valueOf(29);
        System.out.println("textoEdad: " + textoEdad);
        
        /* Obteniedo un valor de la cadena mediante el indice que se ingrese dentro de charAt */
        var caracter = "Hola".charAt(0);
        System.out.println("caracter: " + caracter);
        
        System.out.print("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter: " + caracter);
        
    }
    
}
