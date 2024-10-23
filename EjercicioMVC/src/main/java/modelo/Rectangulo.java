package modelo;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {}

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea(){
        int resultado = this.base * this.altura;
        return resultado;
    }
    
    public int getPerimetro(){
        int resultado = 2*(this.base + this.altura);
        return resultado;
    }
}
