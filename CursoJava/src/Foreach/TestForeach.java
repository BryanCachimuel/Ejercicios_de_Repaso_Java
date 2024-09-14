package Foreach;

/*
    Manejo de forEach

 */
public class TestForeach {
 
    public static void main(String[] args) {
        String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio"};
        
        for(String mes: meses){
            System.out.println("Meses: " + mes);
        }
    }
    
}
