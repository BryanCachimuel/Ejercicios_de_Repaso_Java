package ec.com.ib.sga.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

/*
    Esta clase se va crear como una ENTIDAD para poder interactuar con el api de JPA hacia la base de datos y esto se hace
    mediante la notación @Entity
 */
@Entity
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;  // esta variable es una implementación necesaria que viene de la interface Serializable

    @Id                                                 // Anotacion que indetifica a idPersona como la clave primaría
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Anotación que dice que es un atributo autoincremental dentro de la base de datos
    @Column(name = "id_persona")                         // mapeo del atributo id_persona desde la bdd con idPersona dentro de esta clase 
    private int idPersona;

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

    /* Contructores */
    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona: " + "idPersona=" + idPersona
                + ", nombre=" + nombre
                + ", apellido=" + apellido
                + ", email=" + email
                + ", telefono=" + telefono;
    }

}
