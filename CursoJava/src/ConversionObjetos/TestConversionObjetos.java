package ConversionObjetos;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        
        /* cuando una clase padre tiene hijas se puede instanciar objetos de sus clases hijas*/
        Empleado empleado = new Escritor("Kevin", 1200.00, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
        
        // downcasting -> se esta convirtiendo de una clase padre a un hijo
        ((Escritor)empleado).getTipoEscritura();
        
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();
        
        // Upcasting -> conversión de clase padre a hija en donde no es necesario hacer un casting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
    
}
