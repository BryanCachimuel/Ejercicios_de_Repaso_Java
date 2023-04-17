package Modelo;

/**
 *
 * @author Bryan
 */
public class Usuarios {
   private int id_usuarios;
   private String nombre;
   private String apellido;
   private String email;
   private String clave;
   private String tipo_nivel;
   
   public Usuarios(){}

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo_nivel() {
        return tipo_nivel;
    }

    public void setTipo_nivel(String tipo_nivel) {
        this.tipo_nivel = tipo_nivel;
    }
    
   
   
}
