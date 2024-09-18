package ConversionObjetos;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritua;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritua = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritua.getDescripcion();
    }
    
}
