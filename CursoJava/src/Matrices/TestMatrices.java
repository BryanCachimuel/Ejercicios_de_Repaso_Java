package Matrices;

public class TestMatrices {
    
    public static void main(String[] args) {
        // ejemplo del uso de matrices
        // [3] -> filas
        // [2] -> columnas
        int edades[][] = new int[3][2];
        
        edades[0][0] = 29;
        edades[0][1] = 28;
        
        edades[1][0] = 35;
        edades[1][1] = 32;
        
        edades[2][0] = 26;
        edades[2][1] = 28;
        
        for(int fila = 0; fila < edades.length; fila++){
            for(int columnas = 0; columnas < edades[fila].length; columnas++){
                System.out.println("edades " + fila + "-" + columnas + ": " + edades[fila][columnas]);
            }
        }
                
    }
 
}
