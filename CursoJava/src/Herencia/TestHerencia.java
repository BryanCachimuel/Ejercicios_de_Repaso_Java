package Herencia;

import java.util.Date;

public class TestHerencia {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Nelson", 600.00);
        System.out.println("Empleado: " + empleado);
        
        Empleado empleado2 = new Empleado("Franklin", 800.00);
        System.out.println("Empleado: " + empleado2);
        
        System.out.println("\n");
        
        Date fecha = new Date();
        
        Cliente cliente = new Cliente("Kevin", 'M', 28, "Ibarra", fecha, true);
        System.out.println("Cliente: " + cliente);
    }
    
}
