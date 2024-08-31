package Operadores;
  /*
    Operadores de Asignación
 */
public class Clase2OperadoresAsignacion {

    public static void main(String[] args) {
        
        /* Operadores de asignación; +, -, = */
        int a = 3, b = 2;
        int c = a + 5 - b;
        
        System.out.println("c: " + c);
        
        /* Operador de asignación: += */
        var d = 8;
        d += 1; // d = d +1 
        System.out.println("d: " + d);
        
        var e = 20;
        e += 4; // e = e + 4
        System.out.println("e: " + e);
        
        var f = 19;
        f -= 2; // f = f - 2
        System.out.println("f: " + f);
        
        var g = 36;
        g *= 3; // g = g * 3
        System.out.println("g: " + g);
        
        var h = 15;
        h /= 5; // h = h / 5
        System.out.println("h: " + h);
        
        var i = 140;
        i %= 6; // i = i % 5
        System.out.println("i: " + i);
    }
    
}
