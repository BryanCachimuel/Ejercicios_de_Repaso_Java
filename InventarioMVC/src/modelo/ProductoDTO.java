package modelo;

/**
 *
 * @author Bryan
 */
public class ProductoDTO {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;
    
    /* creamos un constructor vacio para cargar la tabla de la vista */
    public ProductoDTO() {
    }
    
    /* constructor para agregar un producto */
    public ProductoDTO(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    /* constructor para actualizat */
    public ProductoDTO(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
     
}
