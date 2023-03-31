package domain;

/**
 *
 * @author Bryan
 */
public class Datos {
   private int iddatos;
   private String nombres;
   private String apellidos;
   private String email;
   private String telefono;
   private double saldo;
   
    public Datos(){}
    
    public Datos(int iddatos) {
        this.iddatos = iddatos;
    }

    public Datos(String nombres, String apellidos, String email, String telefono, double saldo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Datos(int iddatos, String nombres, String apellidos, String email, String telefono, double saldo) {
        this.iddatos = iddatos;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public int getIddatos() {
        return iddatos;
    }

    public void setIddatos(int iddatos) {
        this.iddatos = iddatos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nId : " + iddatos + 
               "\nNombre : " + nombres + 
               "\nApellido : " + apellidos + 
               "\nEmail : " + email + 
               "\nTeléfono : " + telefono +
               "\nSaldo : " + saldo;
    }
   
   
}
