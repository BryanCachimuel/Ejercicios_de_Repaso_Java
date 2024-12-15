package ec.com.ib.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Alumno implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;

    private String nombre;
    
    private String apellido;
    
    private Integer edad;
    
    /* Definiendo las relaciones con las entidades Contacto y Domicilio */
    @JoinColumn(name="id_domicilio", referencedColumnName = "id_domicilio")
    /* Proceso para realizar la persistencia en cascada */
    @ManyToOne(cascade = CascadeType.ALL)
    private Domicilio domicilio;
    
    @JoinColumn(name="id_contacto", referencedColumnName = "id_contacto")
     /* Proceso para realizar la persistencia en cascada */
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;

    
    /* Relación con la entidad Asignación */
    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;

    public Alumno() {
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
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

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Domicilio getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {
        return this.contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public List<Asignacion> getAsignaciones() {
        return this.asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
    
    
    /* no se agrega la asignación debido a que no es recomendable poner una lista en este tipo de método */
    @Override
    public String toString() {
        return "Alumno: " + "idAlumno=" + idAlumno 
                          + ", nombre=" + nombre 
                          + ", apellido=" + apellido
                          + ", edad=" + edad 
                          + ", domicilio=" + domicilio 
                          + ", contacto=" + contacto;
    }
    
    /*
        Como buena práctica y como estas clase se pueden agregar en colecciones se agregan estos métodos
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idAlumno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.idAlumno, other.idAlumno);
    }
    
}
