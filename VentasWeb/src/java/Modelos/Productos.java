package Modelos;

/**
 *
 * @author Bryan
 */
public class Productos {
    int id;
    String nombreproducto;
    String descripcionproducto;
    String unidad;
    double precio;

    public Productos() {}

    public Productos(int id, String nombreproducto, String descripcionproducto, String unidad, double precio) {
        this.id = id;
        this.nombreproducto = nombreproducto;
        this.descripcionproducto = descripcionproducto;
        this.unidad = unidad;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcionproducto() {
        return descripcionproducto;
    }

    public void setDescripcionproducto(String descripcionproducto) {
        this.descripcionproducto = descripcionproducto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
