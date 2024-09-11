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

        for (int fila = 0; fila < edades.length; fila++) {
            for (int columnas = 0; columnas < edades[fila].length; columnas++) {
                System.out.println("edades " + fila + "-" + columnas + ": " + edades[fila][columnas]);
            }
        }

        System.out.println("\n");

        String frutas[][] = {{"naranja", "limon"}, {"mora", "frutilla"}, {"babaco", "papaya", "guaba"}};

        for (int fil = 0; fil < frutas.length; fil++) {
            for (int col = 0; col < frutas[fil].length; col++) {
                System.out.println("frutas " + col + "-" + fil + ": " + frutas[fil][col]);
            }
        }

        System.out.println("\n");

        Verduras verdura[][] = new Verduras[2][3];

        verdura[0][0] = new Verduras("acelga");
        verdura[0][1] = new Verduras("berro");
        verdura[0][2] = new Verduras("coliflor");

        verdura[1][0] = new Verduras("espinaca");
        verdura[1][1] = new Verduras("nabo");
        verdura[1][2] = new Verduras("rábano");
        
        imprimir(frutas);

        /*for(int fila = 0; fila < verdura.length; fila++){
            for(int columna = 0; columna < verdura[fila].length; columna++){
                System.out.println("verduras " + columna + "-" + fila + ":" + verdura[fila][columna]);
            }
        }*/
    }

    /* método para iterar cada elemento de una matriz */
    public static void imprimir(Object matriz[][]) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("verduras " + columna + "-" + fila + ":" + matriz[fila][columna]);
            }
        }
    }

}
