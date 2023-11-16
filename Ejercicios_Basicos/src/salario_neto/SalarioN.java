package salario_neto;

public class SalarioN {
    
    double sb, cb, a, ayp, an, isrt, ss, afore, sc, sind;
    String puesto = "";
    double horas = 0, 
           xhora = 0, 
           deducciones = 0, 
           percepciones = 0, 
           sn = 0,
           anios = 0;
   
   public void setEmpleado(String puesto, double horas, double anios){
       this.puesto = puesto;
       this.horas = horas;
       this.anios = anios;
   }
   
   
   public void setCuantoXHora(){
       switch(puesto){
           case "Ing. en Ciberseguridad":
               xhora = 70;
               break;
               
           case "Desarrollador FullStack":
               xhora = 55;
               break;
             
           case "Desarrollador Backend":
               xhora = 45;
               break;
               
            case "Desarrollador Frontend":
               xhora = 38;
               break;
             
            case "Analista de Base de Datos":
               xhora = 47;
               break;
               
            case "Asistente de Sistemas":
               xhora = 35;
               break;
               
            default:
                xhora = 0;
                break;
       }
   }
}
