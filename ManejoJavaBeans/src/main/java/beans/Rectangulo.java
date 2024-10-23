package beans;

public class Rectangulo {
    private int base;
    private int altura;

    /* el constructor vacio biene por defecto así que no es necesario anotarlo */
    public Rectangulo() {}
    
    public int getBase(){
        return this.base;
    }
    
    public void setBase(int base){
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea(){
        int resultado = getBase() * getAltura();
        return resultado;
    }
    
}
