package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
    Lo más importante aquí son las anotaciones para con esto pueda ser reconocido por el framework de Java Server Faces
    para así pueda ser usado desde las paginas de JSF
*/

@Named
@RequestScoped  // se utiliza el alcance RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
