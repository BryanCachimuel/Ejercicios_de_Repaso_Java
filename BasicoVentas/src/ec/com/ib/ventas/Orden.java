package ec.com.ib.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS]; // instanciando la clase Producto para darle un valor paraa los productos totales para el arreglo
    }
    
    
}
