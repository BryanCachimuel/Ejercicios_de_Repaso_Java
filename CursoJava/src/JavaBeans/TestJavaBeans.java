package JavaBeans;

public class TestJavaBeans {
   
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Cristoper");
        persona.setCiudad("El Oro");
        
        System.out.println("Persona = " + persona.toString());
        System.out.println("Nombre de la Persona = " + persona.getNombre());
        System.out.println("Ciudad de la Persona = " + persona.getCiudad());
    }
    
}
