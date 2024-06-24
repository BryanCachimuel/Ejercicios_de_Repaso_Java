package Conversor_Monedas;

public class Servicio {
    
    public double BolivianoDolar(double moneda){
        double cambio = 0;
        try {
            cambio = moneda / 6.92;
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
    
    public double BolivianoEuro(double moneda){
        double cambio = 0;
        try {
            cambio = moneda / 7.01;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
    public double EuroBoliviano(double moneda){
        double cambio = 0;
        try {
            cambio = moneda * 7.01;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
    public double BolivianoLibras(double moneda){
        double cambio = 0;
        try {
            cambio = moneda * 0.11;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
    public double LibrasBoliviano(double moneda){
        double cambio = 0;
        try {
            cambio = moneda * 8.72;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
    public double BolivianoSoles(double moneda){
        double cambio = 0;
        try {
            cambio = moneda * 0.55;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cambio;
    }
    
}
