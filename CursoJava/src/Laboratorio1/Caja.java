package Laboratorio1;

/*
    Laboratorio 1 - Proyecto Caja
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){}
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void volumen(){
        int calcularVolumen = this.ancho * this.alto * this.profundo;
        System.out.println("Calcular volumen con el método void: " + calcularVolumen);
    }
    
    public int volumen(int ancho, int alto, int profundo){
        int calcularVolumen = ancho * alto * profundo;
        return calcularVolumen;
    }
}
