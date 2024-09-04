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
}
