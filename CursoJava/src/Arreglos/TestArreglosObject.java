package Arreglos;

public class TestArreglosObject {
    
    public static void main(String[] args) {
        Pais pais[] = new Pais[3]; 
        
        pais[0] = new Pais("Estados Unidos");
        pais[1] = new Pais("Inglaterra");
        pais[2] = new Pais("México");
        
        for(int i = 0; i < pais.length; i++){
            System.out.println("País " + i +" : "+ pais[i].getNombre());
        }
        
        System.out.println("\n");
        
        // otra forma de declarar un arreglo
        String fruta[] = {"platano","guanabana","papaya","frutilla","piña"};
        
        for(int j = 0; j < fruta.length; j++){
            System.out.println("frutas " + j + " : " + fruta[j]);
        }
    }
    
}
