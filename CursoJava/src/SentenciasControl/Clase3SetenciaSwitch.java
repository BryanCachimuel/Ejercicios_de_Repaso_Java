package SentenciasControl;

/*
    Setencia de Control Switch
 */
public class Clase3SetenciaSwitch {

    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Valor Desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Número Uno";
                break;
                
            case 2:
                numeroTexto = "Número Dos";
                break;
                
            case 3: 
                numeroTexto = "Número Tres";
                break;
            
             case 4:
                numeroTexto = "Número Cuatro";
                break;
             
             default:
                 numeroTexto = "Caso no Encontrado";
        }
        
        System.out.println("numeroTextop: " + numeroTexto);
    }
    
}
