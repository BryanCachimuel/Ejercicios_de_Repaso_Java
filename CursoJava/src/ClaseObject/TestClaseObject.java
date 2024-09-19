package ClaseObject;

public class TestClaseObject {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Franklin", 500.00);
        Empleado empleado2 = new Empleado("Franklin", 500.00);
        
        if(empleado1 == empleado2){
            System.out.println("Tiene la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
    }
    
}
