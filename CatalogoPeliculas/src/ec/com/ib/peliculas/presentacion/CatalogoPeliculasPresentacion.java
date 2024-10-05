package ec.com.ib.peliculas.presentacion;

import ec.com.ib.peliculas.servicio.*;
import java.util.Scanner;

public class CatalogoPeliculasPresentacion {
    
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while(opcion != 0){
            System.out.println("Elige una opción: \n" 
                + "1. Iniciar catálogo peliculas\n"
                + "2. Agregar película\n"
                + "3. Listas películas\n"
                + "4. Buscar película\n"
                + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
        }
    }
    
}
