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
        
        System.out.println("\n");
        
        String frutas[][] = {{"naranja","limon"},{"mora","frutilla"},{"babaco","papaya","guaba"}};
        
        for(int fil = 0; fil < frutas.length; fil++){
            for(int col = 0; col < frutas[fil].length; col++){
                System.out.println("frutas " + col + "-" + fil + ": " + frutas[fil][col]);
            }
        }
                
    }
 
}
