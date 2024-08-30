package Variables;

/*
    Tipos Primitivos Boolean
 */
public class Clase9PrimitivosBoolean {

    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean: " + varBoolean);
        
        if(varBoolean == true){
            System.out.println("La Bandera es Verdadera");
        }else{
            System.out.println("La Bandera es Falsa");
        }
        
        var edad = 17;
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    
}
