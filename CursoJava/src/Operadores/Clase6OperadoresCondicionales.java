package Operadores;

/*
    Operadores Condicionales
 */
public class Clase6OperadoresCondicionales {

    public static void main(String[] args) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado =  a >= valorMinimo && a <= valorMaximo;
        
        if(resultado == true){
            System.out.println("Dentro del rango");
        }else{
            System.out.println("Fuera del rango");
        }
        
        var vacaciones = false;
        var diaDescanzo = true;
        
        if(vacaciones || diaDescanzo){
            System.out.println("Padre puede asistir al juego del hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }
    }
    
}
