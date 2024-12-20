package domain;

import javax.xml.bind.annotation.XmlRootElement;

/*
    Realiza el proceso de marshalli es en donde se convierte a xml y hacer la conversión inversa de xml a java
*/
@XmlRootElement
public class Persona {
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }
    
    public Persona(int idPersona) {
        this.idPersona = idPersona;
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
        return "Persona:" + "idPersona=" + idPersona 
                          + ", nombre=" + nombre 
                          + ", apellido=" + apellido 
                          + ", email=" + email 
                          + ", telefono=" + telefono;
    }
    
    
    
}
