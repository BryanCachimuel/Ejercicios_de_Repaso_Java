package Modelo;

/**
 *
 * @author Bryan
 */
public class Empleados {
    private static String idempleado;
    private static String nombre;
    private static String apellido;
    private static String area;
    private static String puesto;

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        Empleados.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
