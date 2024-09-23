package ManejoArchivos;

import static ManejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Texto referencial de escritura en el archivo");
        /*escribirArchivo(nombreArchivo, "agregando mas texto para el archivo");*/
        anexarArchivo(nombreArchivo, "Texto referencias para anexar información");
        anexarArchivo(nombreArchivo, "anexando otra línea al escrito");
        
        leerArchivo(nombreArchivo);
    }
    
}
