package InstanceOf;

import SobreescrituraMetodos.*;

public class TestInstanceOf {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Nelson Cacoango", 750.00);
        determinarTipo(empleado);
        
        Gerente gerente = new Gerente("Lennin", 600.00, "Sistemas"); 
        //determinarTipo(gerente);
        
    }
    
    // proceso de polimorfismo
    public static void determinarTipo(Empleado empleado){
       if(empleado instanceof Gerente){
           System.out.println("Es de tipo Geremte");
           Gerente gerente = (Gerente)empleado;
           System.out.println(gerente.getDepartamento());
           ((Gerente) empleado).getDepartamento();
       }
       else if(empleado instanceof Empleado){
           System.out.println("Es de tipo Empleado");
           //Gerente gerente = (Gerente)empleado;
           //System.out.println(gerente.getDepartamento());
           System.out.println("empleado = " + empleado.getNombre());
       }
       else if(empleado instanceof Object){
           System.out.println("Es de tipo Object");
           empleado.toString();
       }
    }
}
