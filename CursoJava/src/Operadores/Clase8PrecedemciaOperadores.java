package Operadores;

/*
    Precedencia de Operadores
 */
public class Clase8PrecedemciaOperadores {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        
        var z = ++x + y--;
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado: " + resultado);
        
        var evaluando = (4 + 5) * 6 / 3;
        System.out.println("evaluando: " + evaluando);
    }
    
}
