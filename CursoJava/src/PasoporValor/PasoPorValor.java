package PasoporValor;

/*
    Clase Paso por Valor
 */
public class PasoPorValor {
    
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        System.out.println("x nuevo valor = " + x);
    }
    
    public static void cambioValor(int arg){
        System.out.println("arg = " + arg);
        arg = 15;
    }
}
