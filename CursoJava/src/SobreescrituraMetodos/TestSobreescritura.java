package SobreescrituraMetodos;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Lennin", 600.00, "Sistemas");
        
        System.out.println("Gerente: " + gerente.obtenerDetalles());
        
    }
}
