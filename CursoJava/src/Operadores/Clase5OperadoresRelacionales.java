package Operadores;

/*
    Operadores Relacionales
 */
public class Clase5OperadoresRelacionales {

    public static void main(String[] args) {
        var a = 20;
        var b = 15;

        var c = a > b;
        /* Operador mayor que */
        System.out.println("c = " + c);

        var d = a >= b;
        /* Operador mayor igual que */
        System.out.println("d = " + d);

        if (a % 2 == 0) {
            System.out.println("Es número par");
        } else {
            System.out.println("Es número impar");
        }
        
        /* Verficar que una persona se adulta de acuerdo a su edad */
        var edad = 29;
        var adulto = 18;
        
        if(edad >= adulto){
            System.out.println("Es adulto");
        }else{
            System.out.println("Es menor de edad");
        }
    }

}
