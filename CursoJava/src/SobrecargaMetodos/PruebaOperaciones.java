package SobrecargaMetodos;

public class PruebaOperaciones {
    
    public static void main(String[] args) {
        
        int suma1 = Operaciones.sumar(8, 9);
        System.out.println("Resultado Suma1 = " + suma1);
        
        System.out.println("\n");
        
        double suma2 = Operaciones.sumar(6.50, 8.30);
        System.out.println("Resultado Suma2 = " + suma2);
        
        System.out.println("\n");
         
        Operaciones.sumar(6, 9, 3);
        
    }
    
}
