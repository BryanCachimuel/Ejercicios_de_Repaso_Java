package ec.com.ib.domain;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import java.io.Serializable;


@Entity
@Table(name = "persona")  // se pone esta notación para el caso de que el nombre de la entidad sea diferente al nombre de esta clase
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name="id_persona")
    @Id
    private int idPersona;
    
    /* como los nombres de estos atributos coinciden con los de la base de datos no es necesario poner la notación @Column tal y como esta puesto para el id */
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
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
