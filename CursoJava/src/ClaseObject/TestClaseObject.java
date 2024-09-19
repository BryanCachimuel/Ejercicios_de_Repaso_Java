package ClaseObject;

public class TestClaseObject {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Franklin", 500.00);
        Empleado empleado2 = new Empleado("Nelson", 500.00);
        
        if(empleado1 == empleado2){
            System.out.println("Tiene la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos no son iguales en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hascode es igual");
        }else{
            System.out.println("El valor hashcode no es igual");
        }
    }
    
}
