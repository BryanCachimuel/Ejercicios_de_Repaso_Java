package Metodos;

/*
    Alcance de las Variables
 */
public class PruebaAlcanceVariables {
    
    public static void main(String[] args) {
        
        // Variables Locales se pueden definir con var 
        // nota: var no puede ser utilizado para declarar los atributos de una clase
        var a = 9;
        var b = 19;
        comprobarVariables(); // este método solo puede ser utilizado ya que es igual static que el método main
        
        Aritmetica aritmetica = new Aritmetica(a, b);
        aritmetica.sumar();
        
    }
    
    public static void comprobarVariables(){
        /*a = 10;  variable a esta fuera del alcance de este método ya que esta definido dentro del método main */
        System.out.println("Comprobando método");
    }
    
}
