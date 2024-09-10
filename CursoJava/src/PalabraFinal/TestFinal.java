package PalabraFinal;

/*
    Uso de la palabra final
 */
public class TestFinal {
    
    public static void main(String[] args) {
        /* final en las variables representa que el valor dado no puede ser cambiado */
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        // miVariable = 15; -> esto no se puede hacer
        
        // no puede ser modificado el valor de la constante ya que tiene la palabra reservada final
        //Animales.MI_CONSTANTE = "constante desde la clase test";
        System.out.println("Mi constante: " + Animales.MI_CONSTANTE);
        
        final Animales animal = new Animales();
        
        // no se puede agregar una nueva referencia al objeto animal
        //animal = new Animales();
        
        /* los valores de un objeto pueden cambiar pero no se puede agregar una nueva refrencia de ese objeto */
        animal.setTipoAnimal("León");
        System.out.println("Tipo Animal: " + animal.getTipoAnimal());
        
        animal.setTipoAnimal("Jaguar");
        System.out.println("Tipo Animal: " + animal.getTipoAnimal());
    }
    
}
