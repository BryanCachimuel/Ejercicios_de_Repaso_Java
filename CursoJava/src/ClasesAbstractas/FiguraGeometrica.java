package ClasesAbstractas;

/*
    Clases Abstractas
 */
public abstract class FiguraGeometrica {
 
   protected  String tipoFigura;
   
   protected FiguraGeometrica(String tipoFigura){
       this.tipoFigura = tipoFigura;
   }
    
   public abstract void dibujar();

    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
   
}
