package ModifiacadoresAcceso;

/*
    Modificadores de Acceso
 */
public class Clase1 {
    
    public String atributoPublico = "Valor atributo público";
    
    public Clase1(String args){
        System.out.println("Constructor Público");
    }
    
    public void metodoPublico(){
        System.out.println("Método Público");
    }
    
    protected String atributoProtected = "Valor atributo protected";
    
    protected Clase1(){
        System.out.println("Constructor Protected");
    }
    
    protected void metodoProtected(){
        System.out.println("Método Protected");
    }
}
