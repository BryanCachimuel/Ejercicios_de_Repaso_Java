package Ciclos;

/*
    Palabras Break y Continue
 */
public class Clase4PalabrasBreakContinue {

    public static void main(String[] args) {
        /*for(var contador = 0; contador <= 10; contador++){
            if(contador % 2 == 0){
                System.out.println("contador: " + contador);
                break;
            }
        }*/
        
        for(var contador = 0; contador <= 10; contador++){
            if(contador % 2 != 0){
                continue; // permite ir a la siguiente iteración
            }
            System.out.println("contador: " + contador);
        }
    }
    
}
