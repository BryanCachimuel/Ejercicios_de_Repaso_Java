package testclientews;

import clientews.servicio.ServicioSumaImplService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioSumaWS {
    
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumaImplService().getServicioSumaImplPort();
        System.out.println("Ejecutando Servicio sumar WS");
        int x = 28;
        int y = 94;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("Resultado: " + resultado);
        System.out.println("Fin servicio sumar WS");
    }
    
}
