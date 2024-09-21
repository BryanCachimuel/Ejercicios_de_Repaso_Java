package Excepciones;

public class Aritmetica {
    
    public static int division(int numerador, int denominador) throws OperacionException{
        if(denominador == 0){
            throw new OperacionException("División entre 0");
        }
        return numerador / denominador;
    }
    
}
