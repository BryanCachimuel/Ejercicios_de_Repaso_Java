package ec.com.ib.mundopc;

public class Monitor {
    
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    public Monitor(){
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); // se manda a llamar el constructor vacio para que se inicialice el contador de monitores
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
