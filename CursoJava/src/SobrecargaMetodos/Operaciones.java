package SobrecargaMetodos;

/*
    Sobrecarha de métodos
 */
public class Operaciones {
    
    public static int sumar(int a, int b){
        System.out.println("sumar(int a, int b)");
        return a + b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
    
    public static void sumar(int a, int b, int c){
        System.out.println("sumar(int a, int b, int c)");
        int d = (a + c) + b;
        System.out.println("Resultado suma3 = " + d);
    }
}
