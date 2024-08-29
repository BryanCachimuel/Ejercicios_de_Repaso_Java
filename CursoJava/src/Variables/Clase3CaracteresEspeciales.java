package Variables;

public class Clase3CaracteresEspeciales {

    public static void main(String[] args) {
        var nombre = "Lennin";
        
        System.out.println("Nueva línea: \n" + nombre); /* \n -> salto de línea */
        System.out.println("Tabulador: \t" + nombre); /* \t ->sirve para dar un espacio */
        System.out.println("Retroceso: \b" + nombre); /* \b-> elimina un espacio en blanco que exista entre el texto y la variable contantenada */
        System.out.println("Comilla Simple: \'" + nombre + "\'"); /* \' -> para poner una cadena entre commillas simples */
        System.out.println("Comilla Doble: \"" + nombre + "\""); /* \" -> para poner una cadena entre commillas dobles */
    }
    
}
