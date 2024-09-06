package Encapsulamiento;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Lennin", 600.00, false);
        System.out.println("Nombre: " + persona.getNombre());
        // llamando al método toString de forma automática
        System.out.println("persona: " + persona);
        
        // para modificar los datos de los atributos
        persona.setNombre("Bryan");
        System.out.println("Persona Nombre: " + persona.getNombre());
        System.out.println("Persona Sueldo: " + persona.getSueldo());
        System.out.println("Persona Eliminadi: " + persona.isEliminado());
        
        String impresion = persona.toString();
        System.out.println("persona: " +impresion);
    }
    
}
