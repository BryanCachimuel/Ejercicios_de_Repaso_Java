package Conversor_Monedas;

import java.util.Scanner;

public class MainTest {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de dinero a convertir: ");
        double moneda = sc.nextDouble();
        
        double cambio;
        
        Servicio servicio = new Servicio();
        
        cambio = servicio.BolivianoDolar(moneda);
        //System.out.println("El Cambio de Bolivar a Dolar es: " + cambio);
        System.out.println("El Cambio de Boliviano a Dolar es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n"); 
        
        cambio = servicio.DolarBoliviano(moneda);
        //System.out.println("El Cambio de Bolivar a Dolar es: " + cambio);
        System.out.println("El Cambio de Dolar a Boliviano es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.BolivianoEuro(moneda);
        System.out.println("El Cambio de Bolivar a Dolar es: " + Math.round(cambio * 100) / 100d);
        //System.out.println("El Cambio de Boliviano a Euro es: " + cambio);
        System.out.println("\n");
        
        cambio = servicio.EuroBoliviano(moneda);
        System.out.println("El Cambio de Bolivar a Dolar es: " + Math.round(cambio * 100) / 100d);
        //System.out.println("El Cambio de Euro a Boliviano es: " + cambio);
        System.out.println("\n");
        
        cambio = servicio.BolivianoLibras(moneda);
        System.out.println("El Cambio de Boliviano a Libra Esterlina es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.LibrasBoliviano(moneda);
        System.out.println("El Cambio de Libra Esterlina a Boliviano es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.BolivianoSoles(moneda);
        System.out.println("El Cambio de Boliviano a Soles es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.SolesBoliviano(moneda);
        System.out.println("El Cambio de Soles a Boliviano es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.BolivianoGuarani(moneda);
        System.out.println("El Cambio de Boliviano a Guaraní es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.GuaraniBoliviano(moneda);
        System.out.println("El Cambio de Guaraní a Boliviano es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.BolivianoQuetzal(moneda);
        System.out.println("El Cambio de Boliviano a Quetzal es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
   }
    
}
