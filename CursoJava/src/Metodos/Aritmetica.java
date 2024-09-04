package Metodos;

/*
    Clase Métodos
 */
public class Aritmetica {
    // atributos de la clase
    int a;
    int b;
    
    // constructor vacio biene por defecto
    public Aritmetica(){}
    
    // sobrecarga de constructores
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    }
    
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
    
    /* se consume el método sumarConRetorno 
        this -> hace refrencia a que un atributo de esa clase
    */
     public int sumarConsumiendo(int a, int b){
        this.a = a; // El argumento a se asigna al atributo this.a
        this.b = b; // El argumento b se asigna al atributo this.b
        return this.sumarConRetorno();
    }
}
