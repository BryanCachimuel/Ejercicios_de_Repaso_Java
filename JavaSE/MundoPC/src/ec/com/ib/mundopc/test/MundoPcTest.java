package ec.com.ib.mundopc.test;

import ec.com.ib.mundopc.*;

public class MundoPcTest {
    
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 19);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorLG = new Monitor("LG", 32);
        Teclado tecladoLG = new Teclado("bluetooth", "LG");
        Raton ratonLG = new Raton("bluetooth", "LG");
        
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLG);
        
        orden1.mostrarOrden();
        
    }
    
}
