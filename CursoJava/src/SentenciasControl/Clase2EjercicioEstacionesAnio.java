package SentenciasControl;

import java.util.Scanner;

/*
    Ejercicio de Estaciones del Año
 */
public class Clase2EjercicioEstacionesAnio {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el mes para conocer la estación: ");
        var mes = leer.nextInt();
        
        var estacion = "Estación Desconocida";
        
        if(mes  == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        
        System.out.println("Estación: " + estacion);
    }
    
}
