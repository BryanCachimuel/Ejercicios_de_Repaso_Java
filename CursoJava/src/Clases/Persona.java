package Clases;
/*
    Clase 1: Persona
*/
public class Persona {
    
    // atributos de la clase
    public String nombre;
    public String apellido;

    /* métodos de clase */
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}