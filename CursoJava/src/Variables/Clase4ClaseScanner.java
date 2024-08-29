package Variables;

import java.util.Scanner;

public class Clase4ClaseScanner {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); /* librería para leer datos desde la consola */
        
        System.out.print("Escribe tu nombre: ");
        var nombre = leer.nextLine();               /* nextLine -> lee datos tipo cadena */
        
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();                  /* nexInt -> lee datos tipo entero */
        
        System.out.println("Su nombre es: " + nombre + " con edad de " + edad + " años.");
    }
    
}
