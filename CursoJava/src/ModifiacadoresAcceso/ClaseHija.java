package ModifiacadoresAcceso;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificación atributo protected";
        System.out.println("atributo protegido = " + this.atributoProtected);
        this.metodoProtected();
    }
    
}
