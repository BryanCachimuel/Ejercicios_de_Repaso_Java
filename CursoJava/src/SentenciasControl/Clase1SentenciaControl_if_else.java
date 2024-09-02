package SentenciasControl;

/*
    Sentencia de control if lese
 */
public class Clase1SentenciaControl_if_else {

    public static void main(String[] args) {
        /*int numero = 15;
        int numero2 = 5;
        
        if(numero % numero2 == 0){
            System.out.println("Condición verdader");
        }else{
            System.out.println("Condición falsa");
        }*/
        
        int numeroDeterminado = 2;
        var numeroTexto = "Número Desconocido";
        
        if(numeroDeterminado == 1){
            numeroTexto = "Número Uno";
        }
        else if(numeroDeterminado == 2){
            numeroTexto = "Número Dos";
        }
        else if(numeroDeterminado == 3){
            numeroTexto = "Número Tres";
        }
        else if(numeroDeterminado == 4){
            numeroTexto = "Número Cuatro";
        }
        else{
            numeroTexto = "Número no Encontrado";
        }
        
        System.out.println("Número Texto: " + numeroTexto);
    }
    
}
