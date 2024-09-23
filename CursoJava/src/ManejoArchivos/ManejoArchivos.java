package ManejoArchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Manejo de archivos
 */
public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }
    }
}
