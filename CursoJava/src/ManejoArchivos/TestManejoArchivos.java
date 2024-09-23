package ManejoArchivos;

import static ManejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Texto referencial de escritura en el archivo");
    }
    
}
