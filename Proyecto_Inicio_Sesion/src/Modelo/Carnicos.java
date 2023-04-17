package Modelo;

/**
 *
 * @author Bryan
 */
public class Carnicos {
    private int id_carnicos;
    private String carnicos;
    private double precio_carnicos_kilos;
    private double precio_carnicos_libras;
    private double cantidad;
    private String procedencia;
    private String tipo_carnico;
    
    public Carnicos(){}

    public int getId_carnicos() {
        return id_carnicos;
    }

    public void setId_carnicos(int id_carnicos) {
        this.id_carnicos = id_carnicos;
    }

    public String getCarnicos() {
        return carnicos;
    }

    public void setCarnicos(String carnicos) {
        this.carnicos = carnicos;
    }

    public double getPrecio_carnicos_kilos() {
        return precio_carnicos_kilos;
    }

    public void setPrecio_carnicos_kilos(double precio_carnicos_kilos) {
        this.precio_carnicos_kilos = precio_carnicos_kilos;
    }

    public double getPrecio_carnicos_libras() {
        return precio_carnicos_libras;
    }

    public void setPrecio_carnicos_libras(double precio_carnicos_libras) {
        this.precio_carnicos_libras = precio_carnicos_libras;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipo_carnico() {
        return tipo_carnico;
    }

    public void setTipo_carnico(String tipo_carnico) {
        this.tipo_carnico = tipo_carnico;
    }
    
    
}
