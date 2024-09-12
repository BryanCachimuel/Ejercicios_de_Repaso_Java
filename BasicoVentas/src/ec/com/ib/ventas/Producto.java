package ec.com.ib.ventas;

/*
    Diseño de clases
 */
public class Producto {
    private final int idProducto; // final para que esta variable no pueda ser actualizada 
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    public Producto(){
        this.idProducto = ++contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this(); // para llamar a un costructor interno se debe poner este this que hace referencia al constructor  vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
