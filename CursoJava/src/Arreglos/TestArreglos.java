package Arreglos;

/*
    Arreglos
 */
public class TestArreglos {
    
    public static void main(String[] args) {
         int edades[] = new int[3];
         edades[0] = 20;
         edades[1] = 25;
         edades[2] = 29;
         
         System.out.println("Edad 1: " + edades[0]);
         System.out.println("Edad 2: " + edades[1]);
         System.out.println("Edad 3: " + edades[2]);
         
         /* iterando cada elemento del arreglo */
         for(int i = 0; i < edades.length; i++){
             System.out.println("edades elemento: " + i + ": " + edades[i]);
         }
    }
    
}
