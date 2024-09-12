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
    
    public void agregarProducto(Producto producto){
        /*validación para no pasarnos del maximo de productos definidos */
        if(this.contadorProductos < MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el máximo de productos: " + MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
            /*Producto producto = this.productos[i];
            total += producto.getPrecio(); */
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la orden:");
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
