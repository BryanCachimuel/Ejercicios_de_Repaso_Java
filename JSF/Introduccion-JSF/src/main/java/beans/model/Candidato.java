package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.*;

/*
    Lo más importante aquí son las anotaciones para con esto pueda ser reconocido por el framework de Java Server Faces
    para así pueda ser usado desde las paginas de JSF
*/

@Named
@RequestScoped  // se utiliza el alcance RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";
    
    Logger log = LogManager.getRootLogger();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando la propiedad de nombre: " + this.nombre);
    }
    
    
}
