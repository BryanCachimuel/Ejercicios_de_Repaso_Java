package Metodos;

/*
    Clase Métodos
 */
public class Aritmetica {
    // atributos de la clase
    int a;
    int b;
    
    // método de clase
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
    
    public int sumarConRetorno(){
        /*int resultado = a + b;
        return resultado;*/
        return a + b;
    }
    
    public int sumarConArgumentos(int valor1, int valor2){
        a = valor1;
        b = valor2;
        return a + b;
        /*return valor1 + valor2;*/
    }
    
    /* se consume el método sumarConRetorno */
     public int sumarConsumiendo(int valor1, int valor2){
        a = valor1;
        b = valor2;
        return sumarConRetorno();
    }
}
