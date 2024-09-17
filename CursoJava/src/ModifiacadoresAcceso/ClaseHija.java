package ModifiacadoresAcceso;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificación atributo protected";
        System.out.println("atributo protegido = " + this.atributoProtected);
        this.metodoProtected();
        System.out.println("\n");
        this.atributoDefault = "Modificación atributo default";
        System.out.println("atributo default = " + this.atributoDefault);
        this.metodoDefault();
        
        System.out.println("\n");
        
        /*
        No se puede acceder a los atributos y métodos privados
        this.atributoPrivado = "Modificación de atributo Privado";
        this.metodoPrivado();
        */
    }
    
}
