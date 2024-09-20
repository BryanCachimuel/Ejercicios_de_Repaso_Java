package Excepciones;

/*
    Manejo de Excepciones
 */
public class TestExcepciones {
    
    public static void main(String[] args) {
        int resultado = 0;
        
        try {
            resultado = 10/0;
            
       } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
           e.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }
    
}
