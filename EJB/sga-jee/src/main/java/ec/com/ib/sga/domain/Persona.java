package ec.com.ib.sga.domain;

import java.io.Serializable;

/*
    SEGUNDO PASO: Se crea la clase Persona, para enviarse del servidor al cliente esta clase necesita serializarse mediante su implementación a esta clase
*/

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;        // atributo requerido por la interfaz Serializable
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
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
