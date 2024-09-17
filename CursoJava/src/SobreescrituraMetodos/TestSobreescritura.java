package SobreescrituraMetodos;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Nelson Cacoango", 750.00);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Lennin", 600.00, "Sistemas");  
        //System.out.println("Gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
        
    }
    
    // proceso de polimorfismo
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
