package JavaBeans;

import java.io.Serializable;

/*
    Manejo de JavaBeans
 */
public class Persona implements Serializable{
    
    private String nombre;
    private String ciudad;
    
    /* uno de los requisitos de los beans es tener un constructor vacio */
    public Persona(){}
    
    public Persona(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
}
