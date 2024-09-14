package Enumeraciones;

public class TestEnumeraciones {
    
    public static void main(String[] args) {
        System.out.println("Día 1: " + Dias.LUNES);
        
        indicarDiaSemana(Dias.DOMINGO);
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer Día de la Semana");
                break;
             
            case MARTES:
                System.out.println("Segundo Día de la Semana");
                break;
                
            case MIERCOLES:
                System.out.println("Tercer Día de la Semana");
                break;
            
            case JUEVES:
                System.out.println("Cuarto Día de la Semana");
                break;
                
            case VIERNES:
                System.out.println("Quinto Día de la Semana");
                break;
                
            case SABADO:
                System.out.println("Sexto Día de la Semana");
                break;
                
            case DOMINGO:
                System.out.println("Septimo Día de la Semana");
                break;
                
            default:
                System.out.println("No está el día que usted indica");
        }
    }
}
