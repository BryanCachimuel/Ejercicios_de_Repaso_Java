package ec.com.ib.ventas.test;

import ec.com.ib.ventas.*;

public class VentasTest {
    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Comedor", 350.99);
        Producto producto2 = new Producto("Sala", 525.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
    }
    
}
