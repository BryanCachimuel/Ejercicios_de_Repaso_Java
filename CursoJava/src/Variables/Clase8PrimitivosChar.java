package Variables;

/*
    Tipos Primitivos Char
 */
public class Clase8PrimitivosChar {

    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter: " + miCaracter);
        
        char varChar = '\u0021'; /* se puede poner los códigos de los caracteres unicode */
        System.out.println("varChar: " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal: " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo: " + varCharSimbolo);
        
        char varPruebaChar = '\u0169'; 
        System.out.println("varPruebaChar: " + varPruebaChar);
        
        var varChar2 = '\u0021'; /* se puede poner los códigos de los caracteres unicode */
        System.out.println("varChar2: " + varChar2);
        
        var varCharDecimal2 = (char)33;
        System.out.println("varCharDecimal2: " + varCharDecimal2);
        
        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo2: " + varCharSimbolo2);
        
        
        /* los tipos enteros soportan los códigos unicode y los tranforma de char a entero */
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo: " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra: " + letra);
    }
    
}
