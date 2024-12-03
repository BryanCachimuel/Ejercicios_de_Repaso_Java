package ec.com.ib.sga.domain;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer idPersona;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }
    
    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
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
        return "Persona:" + "idPersona=" + idPersona 
                          + ", apellido=" + apellido 
                          + ", email=" + email 
                          + ", telefono=" + telefono;
    }
    
    
}
