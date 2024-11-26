package ec.com.ib.sga.web;

import ec.com.ib.sga.domain.Persona;
import ec.com.ib.sga.servicio.PersonaService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.*;
import org.apache.logging.log4j.*;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@RequestScoped
public class PersonaBean {
    
    Logger log = LogManager.getRootLogger();
    
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
    
    List<Persona> personas;

    public PersonaBean() {
        log.debug("Iniciando el Objeto PersonaBean");
    }
    
    /* Se inicializan cada uno de los elementos de nuestra PersonaBean ya que si no se inicializan no se podra desplegar el listado de personas */
    @PostConstruct
    public void inicializar(){
        // Iniciamos las variables
        this.personas = personaService.listarPersonas();
        log.debug("Personas recuperadas en ManagedBean: " + this.personas);
        this.personaSeleccionada = new Persona();
    }
    
    /* Método para modificar los datos de una persona */
    public void editListener(RowEditEvent event){
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }

    public Persona getPersonaSeleccionada() {
        return this.personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void agregarPersona(){
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void eliminarPersona(){
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void reiniciarPersonaSeleccionada(){
        this.personaSeleccionada = new Persona();
    }
}
