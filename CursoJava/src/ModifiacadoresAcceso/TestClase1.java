package ModifiacadoresAcceso;

public class TestClase1 {
    
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Público");
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        /*
        Si esta clase esta fuera del paquete de la clase a la que invocamos esto no funcionara y dará error
        
        System.out.println("clase1 = " + clase1.atributoProtected);
        clase1.metodoProtected();
        */ 
        
        System.out.println("\n");
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
        Clase1 claseDefault = new Clase1("Valor1", "Valor2");
        clase1.atributoDefault = "Cambio desde la prueba";
        System.out.println("Clase1 atributo default = " + clase1.atributoDefault);
        claseDefault.metodoDefault();
        
        Clase1 clasePrivate = new Clase1();
        clase1.setAtributoPrivado("Atributo Privado");
        System.out.println("atributo privado = "  + clasePrivate.getAtributoPrivado());
    }
    
}
