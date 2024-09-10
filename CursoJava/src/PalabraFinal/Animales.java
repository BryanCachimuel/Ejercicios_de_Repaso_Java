package PalabraFinal;

/*
    Uso de la palabra final en una clase, lo que significa que esta clase 
    no va a poder tener clases hijas
 */

// public final class Animales {
public class Animales {
    
    // es conocida como una constante cuando se une las palabras final y static y también el nombre de la constante se debe poner en mayuscula
    public final static String MI_CONSTANTE = "constante en java";
    
    public final void imprimir(){
        System.out.println("Método Imprimir");
    }
    
}
