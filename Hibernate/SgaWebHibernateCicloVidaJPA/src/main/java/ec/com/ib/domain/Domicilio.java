package ec.com.ib.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Domicilio implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;
    
    private String calle;
    
    @Column(name = "no_casa")
    private String noCasa;
    
    private String ciudad;

    public Domicilio() {
    }

    public Domicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public Integer getIdDomicilio() {
        return this.idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCasa() {
        return this.noCasa;
    }

    public void setNoCasa(String noCasa) {
        this.noCasa = noCasa;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Domicilio:" + "idDomicilio=" + idDomicilio 
                            + ", calle=" + calle 
                            + ", noCasa=" + noCasa 
                            + ", ciudad=" + ciudad;
    }
    
    /*
        Como buena práctica y como estas clase se pueden agregar en colecciones se agregan estos métodos
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idDomicilio);
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
        final Domicilio other = (Domicilio) obj;
        return Objects.equals(this.idDomicilio, other.idDomicilio);
    }

}
