package Ciclos;

/*
    Uso de etiquetas lables: este proceso no es una buena práctica
    y solo se puede utilizar para romper con los ciclos for anidados
 */
public class Clase5EtiquetasLabels {

    public static void main(String[] args) {
        
        inicio:
        for(var contador = 0; contador <= 10; contador++){
            if(contador % 2 != 0){
                continue inicio; // ir a la línea de código de la etiqueta
            }
            System.out.println("contador: " + contador);
        }
        
    }
    
}
