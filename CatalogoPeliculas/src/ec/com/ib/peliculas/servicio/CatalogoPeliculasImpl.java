package ec.com.ib.peliculas.servicio;

import ec.com.ib.peliculas.datos.AccesoDatosImpl;
import ec.com.ib.peliculas.datos.IAccesoDatos;
import ec.com.ib.peliculas.domain.Pelicula;
import ec.com.ib.peliculas.excepciones.AccesoDatosEx;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    
 
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        
    }

    @Override
    public void buscarPelicula(String buscar) {
        
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        
    }
    
}
