package Conversor_Monedas;

public class Servicio {
    
    public double BolivianoDolar(double moneda){
        double cambio = 0;
        try {
            cambio = moneda/6.92;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
    public double DolarBoliviano(double moneda){
        double cambio = 0;
        try {
            cambio = moneda * 6.92;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
}
