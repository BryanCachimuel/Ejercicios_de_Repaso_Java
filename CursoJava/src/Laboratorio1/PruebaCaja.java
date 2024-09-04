package Laboratorio1;

/*
    Prueba Caja
 */
public class PruebaCaja {
    
    public static void main(String[] args) {
        Caja caja = new Caja();
        int calcular = caja.volumen(3, 2, 6);
        System.out.println("Calcular Volumen: " + calcular);
        
        Caja caja2 = new Caja(3, 2, 6);
        caja2.volumen();
    }
    
}
