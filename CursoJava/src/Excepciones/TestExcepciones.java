package Excepciones;

/*
    Manejo de Excepciones
 */
public class TestExcepciones {
    
    public static void main(String[] args) {
        int resultado = 0;
        
        try {
            resultado = Aritmetica.division(10, 0);
            
       } catch(OperacionException ex){
            System.out.println("Ocurrió un error de tipo OperacionException");
            System.out.println(ex.getMessage());
       } 
        catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception: ");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la división entre 0");
        }
        System.out.println("resultado = " + resultado);
    }
    
}
