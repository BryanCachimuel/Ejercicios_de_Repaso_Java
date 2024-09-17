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
    
    String atributoDefault = "Valor atributo Default";
    
    Clase1(String args, String args2){
        System.out.println("Contructor Default");
    }
    
    void metodoDefault(){
        System.out.println("Método Default");
    }
    
    private String atributoPrivado = "Valor atributo Privado";
    
    private Clase1(String atributo, String valor, String valor2){
        this();
        System.out.println("Constructor Privado");
    }
    
    private void metodoPrivate(){
        System.out.println("Método Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
