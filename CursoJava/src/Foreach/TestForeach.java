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
        
        Ciudad ciudades[] = {new Ciudad("Ibarra"), new Ciudad("Quito"), new Ciudad("Cuenca")};
        
        for(Ciudad ciudad: ciudades){
            System.out.println("Ciudades: " + ciudad);
        }
    }
    
}
