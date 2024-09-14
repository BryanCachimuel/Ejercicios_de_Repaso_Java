package Enumeraciones;

public enum Continentes {  
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1.1 billones"),
    ASIA(44, "1.6 billones"),
    AMERICA(34, "1 billon"),
    OCEANIA(14, "33 millones"); // Si se va a agregar nás elementos a esa clase enum se pone el ; 
    
    private final int paises;
    private final String habitantes;

    private Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;  
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }

}
