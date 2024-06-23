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
        System.out.println("El Cambio de Bolivar a Dolar es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n"); 
        
        cambio = servicio.DolarBoliviano(moneda);
        //System.out.println("El Cambio de Bolivar a Dolar es: " + cambio);
        System.out.println("El Cambio de Bolivar a Dolar es: " + Math.round(cambio * 100) / 100d);
        System.out.println("\n");
        
        cambio = servicio.BolivianoEuro(moneda);
        System.out.println("El Cambio de Bolivar a Dolar es: " + Math.round(cambio * 100) / 100d);
        //System.out.println("El Cambio de Bolivar a Dolar es: " + cambio);
        System.out.println("\n");
        
        cambio = servicio.EuroBoliviano(moneda);
        System.out.println("El Cambio de Bolivar a Dolar es: " + Math.round(cambio * 100) / 100d);
        //System.out.println("El Cambio de Bolivar a Dolar es: " + cambio);
   }
    
}
